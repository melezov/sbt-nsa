package com.mentatlabs.nsa
package scalac

import org.specs2._, specification.SpecPart
import scala.collection.mutable.{LinkedHashSet => MSet}

trait ScalacOptionsSpec
    extends Specification {

  protected val FS = sys.props("file.separator")

  protected implicit class PimpedScalacOption(scalacOption: ScalacOption) {
    def =>=(expected: String) = {
      /* unit tests check options by joining them with a space
       * so, perform a sanity check if no spaces were present before */
      scalacOption.params.forall(o => !(o contains ' ')) and
      scalacOption.params.mkString(" ") === expected
    }
  }

  protected implicit def checkVersions(scalacOption: ScalacOption): SpecPart = {
    // older versions of Scalac help do not use the -g:<level> pattern, so we use a dual regex
    val head = scalacOption.params.head

    val pattern = " " + ((scalacOption: @unchecked) match {
      case _: ScalacOptionSwitch => head + "  "
      case _: ScalacOptionBoolean => head + "  "
      case _: ScalacOptionChoice[_] => head.replaceFirst(":.*", "(  |:<)")
      case _: ScalacOptionValue[_] => head + "(  | <)"
    }) r

    // every version from `since` should support this option (unless removed)
    val shouldExistIn = MSet.empty ++ ScalacHelp.helps.keys.filter(scalacOption.isDefinedAt)

    // apply regex pattern to Scalac help text in order to determine if an option exists
    val existsIn = MSet.empty ++ ScalacHelp.helps.filter { case (_, h) =>
      pattern.findFirstIn(h.toString).isDefined
    }.keys

    val since = scalacOption.since
    val sinceDesc = s"since $since"

    val missing = shouldExistIn -- existsIn
    val missingDesc = if (missing.isEmpty) "" else ", missing in " + (missing mkString ", ")

    val deprecatedDesc = scalacOption.deprecated map { ", deprecated in " + _ } getOrElse ""
    val removedDesc = scalacOption.removed map { ", removed in " + _ } getOrElse ""

    val extras = existsIn -- shouldExistIn
    val extrasDesc = if (extras.isEmpty) "" else ", shouldn't be in " + (extras mkString ", ")

    sinceDesc + missingDesc + deprecatedDesc + removedDesc + extrasDesc
  }
}

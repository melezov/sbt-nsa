package com.mentatlabs.nsa
package scalac
package options

/** -Yshow-trees-stringified
  * ========================
  *   2.10.0 - 2.12.0: (Requires -Xprint:) Print stringifications along with detailed ASTs.
  */
case object ScalacYShowTreesStringified
    extends ScalacOptionSwitch("-Yshow-trees-stringified") {
  val since = `2.10.0`
}
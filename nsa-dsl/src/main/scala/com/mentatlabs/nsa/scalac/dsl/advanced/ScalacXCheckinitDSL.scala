package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXCheckinitDSL
    extends ScalacOptionDSL {

  object Xcheckinit {
    val unary_- = ScalacXCheckinit
  }
}

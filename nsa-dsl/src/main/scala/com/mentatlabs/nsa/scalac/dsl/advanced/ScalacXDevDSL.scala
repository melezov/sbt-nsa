package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXDevDSL
    extends ScalacOptionDSL {

  object Xdev {
    val unary_- = ScalacXDev
  }
}
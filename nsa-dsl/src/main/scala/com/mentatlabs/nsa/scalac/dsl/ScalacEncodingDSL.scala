package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacEncodingDSL extends ScalacDSL {
  object encoding {
    val unary_- = ScalacEncoding
  }
}

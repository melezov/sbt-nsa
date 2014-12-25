package com.mentatlabs.nsa
package test

class PrivateOptionsSpec extends TypedOptionsSpec {
  def is = s2"""
  -Ybackend                          ${`-Ybackend test`}                          ${`-Ybackend` GenASM}
  -Ybreak-cycles                     ${`-Ybreak-cycles test`}                     ${`-Ybreak-cycles`}
  -Yclosure-elim                     ${`-Yclosure-elim test`}                     ${`-Yclosure-elim`}
  -Ycompact-trees                    ${`-Ycompact-trees test`}                    ${`-Ycompact-trees`}
  -Yconst-opt                        ${`-Yconst-opt test`}                        ${`-Yconst-opt`}
  -Ydead-code                        ${`-Ydead-code test`}                        ${`-Ydead-code`}
  -Ydebug                            ${`-Ydebug test`}                            ${`-Ydebug`}
  -Ydelambdafy                       ${`-Ydelambdafy test`}                       ${`-Ydelambdafy` inline}
  -Ydisable-unreachable-prevention   ${`-Ydisable-unreachable-prevention test`}   ${`-Ydisable-unreachable-prevention`}
  -Yinline                           ${`-Yinline test`}                           ${`-Yinline`}
  -Yinline-handlers                  ${`-Yinline-handlers test`}                  ${`-Yinline-handlers`}
  -Yinline-warnings                  ${`-Yinline-warnings test`}                  ${`-Yinline-warnings`}
  -Yinfer-argument-types             ${`-Yinfer-argument-types test`}             ${`-Yinfer-argument-types`}
  -Ylog-classpath                    ${`-Ylog-classpath test`}                    ${`-Ylog-classpath`}
  -Ymacro-debug-lite                 ${`-Ymacro-debug-lite test`}                 ${`-Ymacro-debug-lite`}
  -Ymacro-debug-verbose              ${`-Ymacro-debug-verbose test`}              ${`-Ymacro-debug-verbose`}
  -Ymacro-expand                     ${`-Ymacro-expand test`}                     ${`-Ymacro-expand` normal}
  -Yno-adapted-args                  ${`-Yno-adapted-args test`}                  ${`-Yno-adapted-args`}
  -Yno-completion                    ${`-Yno-completion test`}                    ${`-Yno-completion`}
  -Yno-generic-signatures            ${`-Yno-generic-signatures test`}            ${`-Yno-generic-signatures`}
  -Yno-imports                       ${`-Yno-imports test`}                       ${`-Yno-imports`}
  -Yno-load-impl-class               ${`-Yno-load-impl-class test`}               ${`-Yno-load-impl-class`}
  -Yno-predef                        ${`-Yno-predef test`}                        ${`-Yno-predef`}
  -Ynooptimise                       ${`-Ynooptimise test`}                       ${`-Ynooptimise`}
  -Yopt                              ${`-Yopt test`}                              ${`-Yopt` help}
  -Yoverride-objects                 ${`-Yoverride-objects test`}                 ${`-Yoverride-objects`}
  -Yoverride-vars                    ${`-Yoverride-vars test`}                    ${`-Yoverride-vars`}
  -Ypresentation-strict              ${`-Ypresentation-strict test`}              ${`-Ypresentation-strict`}
  -Ypresentation-verbose             ${`-Ypresentation-verbose test`}             ${`-Ypresentation-verbose`}
  -Yrangepos                         ${`-Yrangepos test`}                         ${`-Yrangepos`}
  -Yreify-copypaste                  ${`-Yreify-copypaste test`}                  ${`-Yreify-copypaste`}
  -Yrepl-class-based                 ${`-Yrepl-class-based test`}                 ${`-Yrepl-class-based`}
  -Yrepl-sync                        ${`-Yrepl-sync test`}                        ${`-Yrepl-sync`}
  -Yresolve-term-conflict            ${`-Yresolve-term-conflict test`}            ${`-Yresolve-term-conflict` error}
  -Yshow-symkinds                    ${`-Yshow-symkinds test`}                    ${`-Yshow-symkinds`}
  -Yshow-symowners                   ${`-Yshow-symowners test`}                   ${`-Yshow-symowners`}
  -Yshow-syms                        ${`-Yshow-syms test`}                        ${`-Yshow-syms`}
  -Yshow-trees                       ${`-Yshow-trees test`}                       ${`-Yshow-trees`}
  -Yshow-trees-compact               ${`-Yshow-trees-compact test`}               ${`-Yshow-trees-compact`}
  -Yshow-trees-stringified           ${`-Yshow-trees-stringified test`}           ${`-Yshow-trees-stringified`}
  -Yskip                             ${`-Yskip test`}                             ${`-Yskip` FooBar}
  -Ystatistics                       ${`-Ystatistics test`}                       ${`-Ystatistics` FooBar}
  -Ystop-after                       ${`-Ystop-after test`}                       ${`-Ystop-after` FooBar}
  -Ystop-before                      ${`-Ystop-before test`}                      ${`-Ystop-before` FooBar}
  -Ywarn-adapted-args                ${`-Ywarn-adapted-args test`}                ${`-Ywarn-adapted-args`}
  -Ywarn-dead-code                   ${`-Ywarn-dead-code test`}                   ${`-Ywarn-dead-code`}
  -Ywarn-inaccessible                ${`-Ywarn-inaccessible test`}                ${`-Ywarn-inaccessible`}
  -Ywarn-infer-any                   ${`-Ywarn-infer-any test`}                   ${`-Ywarn-infer-any`}
  -Ywarn-nullary-override            ${`-Ywarn-nullary-override test`}            ${`-Ywarn-nullary-override`}
  -Ywarn-nullary-unit                ${`-Ywarn-nullary-unit test`}                ${`-Ywarn-nullary-unit`}
  -Ywarn-numeric-widen               ${`-Ywarn-numeric-widen test`}               ${`-Ywarn-numeric-widen`}
  -Ywarn-unused                      ${`-Ywarn-unused test`}                      ${`-Ywarn-unused`}
  -Ywarn-unused-import               ${`-Ywarn-unused-import test`}               ${`-Ywarn-unused-import`}
  -Ywarn-value-discard               ${`-Ywarn-value-discard test`}               ${`-Ywarn-value-discard`}
"""

  def `-Ybackend test` =
    (`-Ybackend` GenASM)          =>= "-Ybackend:GenASM" and
    (`-Ybackend` GenBCode)        =>= "-Ybackend:GenBCode" and
    (`-Ybackend` custom "FooBar") =>= "-Ybackend:FooBar"

  def `-Ybreak-cycles test` =
    `-Ybreak-cycles` =>= "-Ybreak-cycles"

  def `-Yclosure-elim test` =
    `-Yclosure-elim` =>= "-Yclosure-elim"

  def `-Ycompact-trees test` =
    `-Ycompact-trees` =>= "-Ycompact-trees"

  def `-Yconst-opt test` =
    `-Yconst-opt` =>= "-Yconst-opt"

  def `-Ydead-code test` =
    `-Ydead-code` =>= "-Ydead-code"

  def `-Ydebug test` =
    `-Ydebug` =>= "-Ydebug"

  def `-Ydelambdafy test` =
    (`-Ydelambdafy` inline)          =>= "-Ydelambdafy:inline" and
    (`-Ydelambdafy` method)          =>= "-Ydelambdafy:method" and
    (`-Ydelambdafy` custom "FooBar") =>= "-Ydelambdafy:FooBar"

  def `-Ydisable-unreachable-prevention test` =
    `-Ydisable-unreachable-prevention` =>= "-Ydisable-unreachable-prevention"

  def `-Yinline test` =
    `-Yinline` =>= "-Yinline"

  def `-Yinline-handlers test` =
    `-Yinline-handlers` =>= "-Yinline-handlers"

  def `-Yinline-warnings test` =
    `-Yinline-warnings` =>= "-Yinline-warnings"

  def `-Yinfer-argument-types test` =
    `-Yinfer-argument-types` =>= "-Yinfer-argument-types"

  def `-Ylog-classpath test` =
    `-Ylog-classpath` =>= "-Ylog-classpath"

  def `-Ymacro-debug-lite test` =
    `-Ymacro-debug-lite` =>= "-Ymacro-debug-lite"

  def `-Ymacro-debug-verbose test` =
    `-Ymacro-debug-verbose` =>= "-Ymacro-debug-verbose"

  def `-Ymacro-expand test` =
    (`-Ymacro-expand` normal)          =>= "-Ymacro-expand:normal" and
    (`-Ymacro-expand` none)            =>= "-Ymacro-expand:none" and
    (`-Ymacro-expand` discard)         =>= "-Ymacro-expand:discard" and
    (`-Ymacro-expand` custom "FooBar") =>= "-Ymacro-expand:FooBar"

  def `-Yno-adapted-args test` =
    `-Yno-adapted-args` =>= "-Yno-adapted-args"

  def `-Yno-completion test` =
    `-Yno-completion` =>= "-Yno-completion"

  def `-Yno-generic-signatures test` =
    `-Yno-generic-signatures` =>= "-Yno-generic-signatures"

  def `-Yno-imports test` =
    `-Yno-imports` =>= "-Yno-imports"

  def `-Yno-load-impl-class test` =
    `-Yno-load-impl-class` =>= "-Yno-load-impl-class"

  def `-Yno-predef test` =
    `-Yno-predef` =>= "-Yno-predef"

  def `-Ynooptimise test` =
    `-Ynooptimise` =>= "-Ynooptimise"

  def `-Yopt test` =
    (`-Yopt` `_`)                 =>= "-Yopt:_" and
    (`-Yopt` help)                =>= "-Yopt:help" and
    (`-Yopt` `unreachable-code`)  =>= "-Yopt:unreachable-code" and
    (`-Yopt` `-unreachable-code`) =>= "-Yopt:-unreachable-code" and
    (`-Yopt` `l:none`)            =>= "-Yopt:l:none" and
    (`-Yopt` `-l:none`)           =>= "-Yopt:-l:none" and
    (`-Yopt` `l:default`)         =>= "-Yopt:l:default" and
    (`-Yopt` `l:method`)          =>= "-Yopt:l:method" and
    (`-Yopt` `l:project`)         =>= "-Yopt:l:project" and
    (`-Yopt` `l:classpath`)       =>= "-Yopt:l:classpath" and
    (`-Yopt` custom "Foo:Bar")    =>= "-Yopt:Foo:Bar" and
    (`-Yopt` custom "-Foo:Bar")   =>= "-Yopt:-Foo:Bar"

  def `-Yoverride-objects test` =
    `-Yoverride-objects` =>= "-Yoverride-objects"

  def `-Yoverride-vars test` =
    `-Yoverride-vars` =>= "-Yoverride-vars"

  def `-Ypresentation-strict test` =
    `-Ypresentation-strict` =>= "-Ypresentation-strict"

  def `-Ypresentation-verbose test` =
    `-Ypresentation-verbose` =>= "-Ypresentation-verbose"

  def `-Yrangepos test` =
    `-Yrangepos` =>= "-Yrangepos"

  def `-Yreify-copypaste test` =
    `-Yreify-copypaste` =>= "-Yreify-copypaste"

  def `-Yrepl-class-based test` =
    `-Yrepl-class-based` =>= "-Yrepl-class-based"

  def `-Yrepl-sync test` =
    `-Yrepl-sync` =>= "-Yrepl-sync"

  def `-Yresolve-term-conflict test` =
    (`-Yresolve-term-conflict` `package`)       =>= "-Yresolve-term-conflict:package" and
    (`-Yresolve-term-conflict` `object`)        =>= "-Yresolve-term-conflict:object" and
    (`-Yresolve-term-conflict` error)           =>= "-Yresolve-term-conflict:error" and
    (`-Yresolve-term-conflict` custom "FooBar") =>= "-Yresolve-term-conflict:FooBar"

  def `-Yshow-symkinds test` =
    `-Yshow-symkinds` =>= "-Yshow-symkinds"

  def `-Yshow-symowners test` =
    `-Yshow-symowners` =>= "-Yshow-symowners"

  def `-Yshow-syms test` =
    `-Yshow-syms` =>= "-Yshow-syms"

  def `-Yshow-trees test` =
    `-Yshow-trees` =>= "-Yshow-trees"

  def `-Yshow-trees-compact test` =
    `-Yshow-trees-compact` =>= "-Yshow-trees-compact"

  def `-Yshow-trees-stringified test` =
    `-Yshow-trees-stringified` =>= "-Yshow-trees-stringified"

  def `-Yskip test` =
    (`-Yskip` `typer`)   =>= "-Yskip:typer" and
    (`-Yskip` `patmat`)  =>= "-Yskip:patmat" and
    (`-Yskip` `erasure`) =>= "-Yskip:erasure" and
    (`-Yskip` `cleanup`) =>= "-Yskip:cleanup" and
    (`-Yskip` `jvm`)     =>= "-Yskip:jvm" and
    (`-Yskip` `FooBar`)  =>= "-Yskip:FooBar"

  def `-Ystatistics test` =
    (`-Ystatistics` `_`)        =>= "-Ystatistics:_" and
    (`-Ystatistics` `help`)     =>= "-Ystatistics:help" and
    (`-Ystatistics` `parser`)   =>= "-Ystatistics:parser" and
    (`-Ystatistics` `-parser`)  =>= "-Ystatistics:-parser" and
    (`-Ystatistics` `typer`)    =>= "-Ystatistics:typer" and
    (`-Ystatistics` `-typer`)   =>= "-Ystatistics:-typer" and
    (`-Ystatistics` `patmat`)   =>= "-Ystatistics:patmat" and
    (`-Ystatistics` `-patmat`)  =>= "-Ystatistics:-patmat" and
    (`-Ystatistics` `erasure`)  =>= "-Ystatistics:erasure" and
    (`-Ystatistics` `-erasure`) =>= "-Ystatistics:-erasure" and
    (`-Ystatistics` `cleanup`)  =>= "-Ystatistics:cleanup" and
    (`-Ystatistics` `-cleanup`) =>= "-Ystatistics:-cleanup" and
    (`-Ystatistics` `jvm`)      =>= "-Ystatistics:jvm" and
    (`-Ystatistics` `-jvm`)     =>= "-Ystatistics:-jvm" and
    (`-Ystatistics` `FooBar`)   =>= "-Ystatistics:FooBar" and
    (`-Ystatistics` `-FooBar`)  =>= "-Ystatistics:-FooBar"

  def `-Ystop-after test` =
    (`-Ystop-after` `parser`)  =>= "-Ystop-after:parser" and
    (`-Ystop-after` `typer`)   =>= "-Ystop-after:typer" and
    (`-Ystop-after` `patmat`)  =>= "-Ystop-after:patmat" and
    (`-Ystop-after` `erasure`) =>= "-Ystop-after:erasure" and
    (`-Ystop-after` `cleanup`) =>= "-Ystop-after:cleanup" and
    (`-Ystop-after` `jvm`)     =>= "-Ystop-after:jvm" and
    (`-Ystop-after` `FooBar`)  =>= "-Ystop-after:FooBar"

  def `-Ystop-before test` =
    (`-Ystop-before` `typer`) =>= "-Ystop-before:typer" and
    (`-Ystop-before` `patmat`) =>= "-Ystop-before:patmat" and
    (`-Ystop-before` `erasure`) =>= "-Ystop-before:erasure" and
    (`-Ystop-before` `cleanup`) =>= "-Ystop-before:cleanup" and
    (`-Ystop-before` `jvm`) =>= "-Ystop-before:jvm" and
    (`-Ystop-before` `FooBar`) =>= "-Ystop-before:FooBar"

  def `-Ywarn-adapted-args test` =
    `-Ywarn-adapted-args` =>= "-Ywarn-adapted-args"

  def `-Ywarn-dead-code test` =
    `-Ywarn-dead-code` =>= "-Ywarn-dead-code"

  def `-Ywarn-inaccessible test` =
    `-Ywarn-inaccessible` =>= "-Ywarn-inaccessible"

  def `-Ywarn-infer-any test` =
    `-Ywarn-infer-any` =>= "-Ywarn-infer-any"

  def `-Ywarn-nullary-override test` =
    `-Ywarn-nullary-override` =>= "-Ywarn-nullary-override"

  def `-Ywarn-nullary-unit test` =
    `-Ywarn-nullary-unit` =>= "-Ywarn-nullary-unit"

  def `-Ywarn-numeric-widen test` =
    `-Ywarn-numeric-widen` =>= "-Ywarn-numeric-widen"

  def `-Ywarn-unused test` =
    `-Ywarn-unused` =>= "-Ywarn-unused"

  def `-Ywarn-unused-import test` =
    `-Ywarn-unused-import` =>= "-Ywarn-unused-import"

  def `-Ywarn-value-discard test` =
    `-Ywarn-value-discard` =>= "-Ywarn-value-discard"
}

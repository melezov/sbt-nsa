import sbt._
import Keys._
import ScriptedPlugin._

object Build extends Build {
  val ElementReleases  = "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
  val ElementSnapshots = "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"

  private def defaultSettings =
    Defaults.coreDefaultSettings ++ Seq(
      organization := "com.mentatlabs.nsa"

    , scalaVersion := "2.10.4"

    , scalacOptions := Seq(
        "-deprecation"
      , "-encoding", "UTF-8"
      , "-feature"
      , "-language:existentials"
      , "-language:implicitConversions"
      , "-language:postfixOps"
      , "-language:reflectiveCalls"
      , "-optimise"
      , "-unchecked"
      , "-Xcheckinit"
      , "-Xlint"
      , "-Xmax-classfile-name", "72"
      , "-Xno-forwarders"
      , "-Xverify"
      , "-Yclosure-elim"
      , "-Ydead-code"
      , "-Yinline-warnings"
      , "-Yinline"
      , "-Yrepl-sync"
      , "-Ywarn-adapted-args"
      , "-Ywarn-dead-code"
      , "-Ywarn-inaccessible"
      , "-Ywarn-nullary-override"
      , "-Ywarn-nullary-unit"
      , "-Ywarn-numeric-widen"
      )

    , scalacOptions in Test ++= Seq("-Yrangepos")

    , publishArtifact in (Compile, packageDoc) := false
    , publishTo := Some(if (version.value endsWith "-SNAPSHOT") ElementSnapshots else ElementReleases)
    , credentials ++= {
        val creds = Path.userHome / ".config" / "sbt-nsa" / "nexus.config"
        if (creds.exists) Some(Credentials(creds)) else None
      }.toSeq
    )

  lazy val nsaCore = Project(
    "nsa-core"
  , file("nsa-core")
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import com.mentatlabs.nsa._"
    , libraryDependencies ++= Seq(
        "org.specs2" %% "specs2-core" % "2.4.15" % "test"
      , "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3" % "test"
      )
    )
  )

  lazy val nsaDsl = Project(
    "nsa-dsl"
  , file("nsa-dsl")
  , dependencies = Seq(nsaCore)
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import com.mentatlabs.nsa._, experimental_dsl._"
    , libraryDependencies ++= Seq(
        "org.specs2" %% "specs2-core" % "2.4.15" % "test"
      )
    )
  )

  lazy val nsaPlugin = Project(
    "nsa-plugin"
  , file("nsa-plugin")
  , dependencies = Seq(nsaDsl)
  , settings = defaultSettings ++ scriptedSettings ++ Seq(
      sbtPlugin := true
    , scriptedLaunchOpts += "-Dproject.version=" + version.value
    )
  )

  lazy val root = Project(
    "root"
  , file(".")
  , aggregate = Seq(nsaCore, nsaDsl)
  , settings = defaultSettings ++ Seq(
      publishArtifact := false
    )
  )
}

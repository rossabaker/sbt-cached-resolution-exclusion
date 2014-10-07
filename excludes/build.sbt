import sbt._
import Keys._

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4.6" % "test"
     exclude("org.scalacheck", "scalacheck_2.11")
)

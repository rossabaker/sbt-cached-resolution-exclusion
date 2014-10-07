import sbt._
import Keys._

val excludes = project

val noexcludes = project

fork in ThisBuild := true // so we get an introspectable java.class.path

scalaVersion in ThisBuild := "2.11.2"

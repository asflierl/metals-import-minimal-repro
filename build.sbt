ThisBuild / scalaVersion := "3.3.3"

lazy val libMeep = project

lazy val root = project.in(file(".")).dependsOn(libMeep % "test -> test;compile -> compile")
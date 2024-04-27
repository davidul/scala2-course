ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scala2-course"
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0"

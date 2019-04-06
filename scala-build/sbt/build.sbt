// Initialize Project
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.crupley"

// Set paths since project is in a different folder
scalaSource in Compile := baseDirectory.value / "../project/src/main/scala"
scalaSource in Test := baseDirectory.value / "../project/src/test/scala"
resourceDirectory in Compile := baseDirectory.value / "../project/src/main/resources"
resourceDirectory in Test := baseDirectory.value / "../project/src/test/resources"

// Add Dependencies
lazy val hello = (project in file("."))
  .settings(
    name := "scalabuild",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )

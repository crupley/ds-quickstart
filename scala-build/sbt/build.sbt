// Configure project and dependencies
lazy val scalabuild = (project in file("."))
  .settings(
    name := "scalabuild",
    scalaVersion := "2.12.8",
    organization := "com.crupley",
    version      := "1.0.0",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )

// Set paths since project is in a different folder
scalaSource in Compile := baseDirectory.value / "../project/src/main/scala"
scalaSource in Test := baseDirectory.value / "../project/src/test/scala"
resourceDirectory in Compile := baseDirectory.value / "../project/src/main/resources"
resourceDirectory in Test := baseDirectory.value / "../project/src/test/resources"

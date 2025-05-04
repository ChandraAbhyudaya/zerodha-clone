ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

val AkkaVersion = "2.8.0"

lazy val root = (project in file("."))
  .settings(
    name := "practicemc",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion
    )
  )

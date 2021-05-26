lazy val developSettings = Seq(
  name := "tindalos",
  version := "0.1.0",
  scalaVersion := "3.0.0",
  libraryDependencies ++= Seq(
    // TODO 対応待ち
    // "com.typesafe.scala-logging" %% "scala-logging" % "3.9.3"
  ),
  libraryDependencies ++= Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe" % "config" % "1.4.1",
    "com.ullink.slack" % "simpleslackapi" % "1.3.0"
  )
)
lazy val testSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scalactic" %% "scalactic" % "3.2.9",
    "org.scalatest" %% "scalatest" % "3.2.9" % "test",
    "org.scalatest" %% "scalatest-freespec" % "3.2.9" % "test"
  )
)
lazy val root = project
  .in(file("."))
  .settings(developSettings)
  .settings(testSettings)

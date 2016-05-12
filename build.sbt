
enablePlugins(DebianPlugin)

name := "atlas-demo"
version := "1.0"
scalaVersion := Dependencies.Versions.scala

maintainer := "Brian Harrington <brharrington@gmail.com>"
packageSummary := "Atlas packaging example."
packageDescription := """Example for how to create a package based on
  the Atlas jars."""

libraryDependencies ++= Seq(
  Dependencies.atlasStandalone,
  Dependencies.iepModAdmin,
  Dependencies.iepModArchaius2,
  Dependencies.iepModAwsMetrics,
  Dependencies.iepModEureka,
  Dependencies.iepModJmxPort
)

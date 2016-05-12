
enablePlugins(DebianPlugin)
enablePlugins(JavaAppPackaging)

name := "atlas-demo"
version := "1.0"
scalaVersion := Dependencies.Versions.scala

externalResolvers += Resolver.jcenterRepo

maintainer := "Brian Harrington <brharrington@gmail.com>"
packageSummary := "Atlas packaging example."
packageDescription := """Example for how to create a package based on
  the Atlas jars."""

mainClass in Compile := Some("com.netflix.atlas.standalone.Main")

dockerExposedPorts := Seq(7101, 7500, 8077)

libraryDependencies ++= Seq(
  Dependencies.atlasStandalone,
  Dependencies.iepModAdmin,
  Dependencies.iepModArchaius2,
  Dependencies.iepModAwsMetrics,
  Dependencies.iepModEureka,
  Dependencies.iepModJmxPort
)

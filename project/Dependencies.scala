import sbt._

object Dependencies {
  object Versions {
    val scala = "2.11.8"
    val atlas = "1.5.0-rc.6"
    val iep = "0.4.2"
  }

  import Versions._

  val atlasStandalone     = "com.netflix.atlas_v1" % "atlas-standalone"   % atlas
  val iepModAdmin         = "com.netflix.iep"      % "iep-module-jmxport" % iep
  val iepModArchaius2     = "com.netflix.iep"      % "iep-module-jmxport" % iep
  val iepModAwsMetrics    = "com.netflix.iep"      % "iep-module-jmxport" % iep
  val iepModEureka        = "com.netflix.iep"      % "iep-module-jmxport" % iep
  val iepModJmxPort       = "com.netflix.iep"      % "iep-module-jmxport" % iep
}

import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "todoliat"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  val appDependencies = Seq("postgresql" % "postgresql" % "8.4-702.jdbc4")
    // Add your own project settings here      
  )

}

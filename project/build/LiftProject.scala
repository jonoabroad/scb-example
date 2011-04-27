import sbt._
import de.element34.sbteclipsify._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) with Eclipsify  with bees.RunCloudPlugin  {
  val liftVersion = "2.3"

  override def beesUsername = Some("username")
  override def beesApplicationId = Some("app.id")
	  
  val scalatoolsSnapshot = ScalaToolsSnapshots	  
  // If you're using JRebel for Lift development, uncomment
  // this line
  override def scanDirectories = Nil

  override def libraryDependencies = Set(
    //deployment
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile" withSources(),
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile" withSources(),
    "ch.qos.logback" % "logback-classic" % "0.9.26" withSources(),
    "net.databinder" %% "dispatch-http" % "0.7.8" % "compile->default" withSources(),
    "mysql" % "mysql-connector-java" % "5.1.14",
     //testing 
    "net.liftweb" %% "lift-testkit" % liftVersion % "test" withSources(),
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test",
    "junit" % "junit" % "4.5" % "test",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test",
    "com.h2database" % "h2" % "1.2.138",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default"
  ) ++ super.libraryDependencies
}

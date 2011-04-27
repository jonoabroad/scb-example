import sbt._

class MySbtProjectPlugins(info: ProjectInfo) extends PluginDefinition(info) {

  lazy val eclipse = "de.element34" % "sbt-eclipsify" % "0.7.0"
  lazy val cloudbees = "eu.getintheloop" % "sbt-cloudbees-plugin" % "0.2.7"
  lazy val sonatypeRepo = "sonatype.repo" at "https://oss.sonatype.org/content/groups/public"
// val staxReleases = "stax-release-repo" at "http://mvn.stax.net/content/repositories/public"

}

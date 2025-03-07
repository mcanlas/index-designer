import sbt.Keys.*
import sbt.*

object DependenciesPlugin extends AutoPlugin {
  override def trigger = allRequirements

  object autoImport {
    implicit class DependencyOps(p: Project) {
      def withEffectMonad: Project =
        p
          .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.7")

      def withTesting: Project = {
        val weaverVersion =
          "0.8.4"

        p.settings(
          libraryDependencies ++= Seq(
            "com.disneystreaming" %% "weaver-cats"       % weaverVersion % Test,
            "com.disneystreaming" %% "weaver-scalacheck" % weaverVersion % Test
          )
        )
      }
    }
  }
}

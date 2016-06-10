import sbt.Defaults.defaultSettings
import sbt.Keys._
import sbt._
import Dependencies._

object Build extends Build {

  // Scala version used
  val buildScalaVersion = "2.10.6"

  // Compiler flag
  final val StandardSettings = defaultSettings ++ Seq(
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    scalaVersion := buildScalaVersion,
    retrieveManaged in ThisBuild := true
  )

  // The default project
  lazy val testMain = Project(
    id = "test",
    base = file("."),
    settings =  StandardSettings ++ Seq(
      description := "Main app",
      libraryDependencies ++= additionalComponents, // See below
      resolvers ++= ExtraResolvers
    )
  )


  // ------------------------------------------
  // Additional components
  // ------------------------------------------

  // To enable a component remove the //
  val additionalComponents =
    // scalatraComponents ++
    // apacheHttpComponents ++
    // Seq( scalaz ) ++
    // Seq( pdfBox ) ++
    // Seq( h2DB ) ++
    // Seq( posgresDB ) ++
    // Seq( akka ) ++
    Seq()
}

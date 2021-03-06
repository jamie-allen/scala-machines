name := "machines"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0-SNAPSHOT"

libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.0-SNAPSHOT"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-deprecation", "-Ydependent-method-types", "-unchecked")

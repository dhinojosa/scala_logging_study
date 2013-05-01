name := "Scala Logging Study"

version := "1.0"

scalaVersion := "2.10.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

scalacOptions ++= "-feature" :: "-language:postfixOps" :: Nil

javacOptions += "-Xlint:deprecation"

libraryDependencies ++= Seq (
   "com.typesafe" %% "scalalogging-slf4j" % "1.0.1" withSources() withJavadoc(),  //Scala Logging
   "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc(), //Scala Test
   "org.slf4j" % "slf4j-api" % "1.7.5" withSources() withJavadoc(),               //SLF4J-API Dependency
   "org.slf4j" % "slf4j-simple" % "1.7.5" withSources() withJavadoc()             //SLF4J-Simple Dependency
)

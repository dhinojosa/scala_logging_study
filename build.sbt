name := "Scala Logging Study"

version := "1.0"

scalaVersion := "2.10.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

scalacOptions ++= "-feature" :: "-language:postfixOps" :: Nil

javacOptions += "-Xlint:deprecation"

libraryDependencies ++= Seq (
   "com.typesafe" %% "scalalogging-slf4j" % "1.0.1" withSources() withJavadoc() //Scala Logging
)

name := """PetStore"""
organization := "com.edu.udea"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Estas son las dependencias necesarias para trabajar con bases de datos MySQL
libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.edu.udea.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.edu.udea.binders._"

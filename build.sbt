name := "utilities"

organization := "com.example"

version := "0.2-"+ new java.util.Date().getTime

scalaVersion := "2.12.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Tazi repository olmalı
//publishTo := Some(Resolver.file("file", new File("D:/Kadriye/maven-repo/releases")))
//publishTo := Some(Resolver.file("file", new File("C:\\Users\\ozgur\\.m2\\repository")))


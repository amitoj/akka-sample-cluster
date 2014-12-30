name := "akka-sample-cluster"

version := "1.0"

scalaVersion := "2.10.4"

val akkaVersion = "2.3.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "2.0" % "test",
  "org.fusesource" % "sigar" % "1.6.4")

javaOptions in run ++= Seq(
  "-Xms128m",
  "-Xmx1024m")

mainClass in (Compile, run) := Some("sample.cluster.simple.SimpleClusterApp")

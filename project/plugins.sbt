addSbtPlugin("org.scalameta" % "sbt-scalafmt"      % "2.4.2")
addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.3")
addSbtPlugin("ch.epfl.scala" % "sbt-release-early" % "2.1.1")
libraryDependencies ++= Seq("us.oyanglul" %% "dhall-generic" % "0.2.0")

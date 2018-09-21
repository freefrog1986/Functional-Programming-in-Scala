addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")

resolvers += Resolver.url("bintray-sbt-plugins", url("http://dl.bintray.com/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
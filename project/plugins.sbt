// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

// transform JSX assets
addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.5.0")

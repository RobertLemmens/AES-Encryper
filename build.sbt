name := "aes-encrypter"

version := "1.0"

scalaVersion := "2.12.5"
val tsecV = "0.0.1-M11"

libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "8.0.144-R12",
  "io.github.jmcardon" %% "tsec-common" % tsecV,
  "io.github.jmcardon" %% "tsec-cipher-jca" % tsecV,
  "io.github.jmcardon" %% "tsec-cipher-bouncy" % tsecV,
  "io.github.jmcardon" %% "tsec-hash-jca" % tsecV,
  "io.github.jmcardon" %% "tsec-hash-bouncy" % tsecV
)
libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"
libraryDependencies += "com.github.pureconfig" %% "pureconfig" % "0.9.1"
libraryDependencies += "net.glxn" % "qrgen" % "1.4"

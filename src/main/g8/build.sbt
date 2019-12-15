import Dependencies._

lazy val commonSettings = inThisBuild(
    Seq(
      scalaVersion := "2.12.8",
      addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.10.3"),
      addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
    )
)

lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(
    name := "$name$",
    organization := "$organization$",
    scalaVersion := "2.12.6",
    libraryDependencies += scalaTest % Test
  )

lazy val root =
  Project("alexandria", file("."))
    .aggregate(core, markdown)

lazy val core =
  module("core").withTesting

lazy val markdown =
  module("markdown")

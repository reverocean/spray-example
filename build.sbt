organization  := "de.guderlei"

version       := "0.3"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo"         at "http://repo.spray.io/",
  "sonatype releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo"      at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"         % "1.2-RC3",
  "io.spray"            %   "spray-routing"     % "1.2-RC3",
  "io.spray"            %   "spray-testkit"     % "1.2-RC3",
  "io.spray"            %%  "spray-json"        % "1.2.5",
  "com.typesafe.akka"   %%  "akka-actor"        % "2.2.3",
  "org.specs2"          %%  "specs2"            % "2.0"      % "test",
  "org.squeryl"         %%  "squeryl"           % "0.9.5-6",
  "com.h2database"      %   "h2"                % "1.3.168"
)

seq(Revolver.settings: _*)

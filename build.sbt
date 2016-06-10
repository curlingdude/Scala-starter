lazy val root = (project in file(".")).
    settings(
        name := "spark_sftp",
        version := "1.0",
        scalaVersion := "2.10.6"
    )
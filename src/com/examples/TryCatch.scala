package com.examples

/**
  * Created by ash on 7/9/16.
  */
object TryCatch {

  def main(inputFileNames: Array[String]) {
    inputFileNames foreach (inputFile => countLines(inputFile))
  }

  import scala.io.Source
  import scala.util.control.NonFatal

  def countLines(fileName: String): Unit = {
    var source: Option[Source] = None

    try {
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines().size
      println(s"Number of lines is $size and the filename is $fileName")
    } catch {
      case NonFatal(ex) => println(s"Exception is $ex")
    } finally {
      for (s <- source) {
        s close()
      }
    }

  }

}

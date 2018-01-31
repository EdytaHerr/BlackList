import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source

object TextFilesOperators {

  def TextWriter(text: String): Unit = {

    val file = new File("list_of_people.txt")
    val buffWriter = new BufferedWriter(new FileWriter(file))
    buffWriter.write(text)
    buffWriter.close()
  }

  def TextReader(): Unit = {

    val buffSource = Source.fromFile("pies_text.txt")
    for (line <- buffSource.getLines()) {
      //line
      println(line)
    }
    buffSource.close()
  }
}

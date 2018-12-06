import scala.io.Source

class Day1 {

}

object Day1 {
  val fileName = "src/main/resources/Day1-input.txt"

  def main(args: Array[String]): Unit = {
    println("Hi")
    println(Source.fromFile(fileName).getLines().map((s: String) => s.toInt).reduce((x1: Int, x2: Int) => x1 + x2))
    println(Source.fromFile(fileName).getLines().map((s: String) => s.toInt).sum)
  }
}

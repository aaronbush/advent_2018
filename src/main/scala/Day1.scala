import scala.io.Source

class Day1 {

}

object Day1 {
  val fileName = "src/main/resources/Day1-input.txt"

  var solved: Boolean = false

  def main(args: Array[String]): Unit = {
    println("Hi")
    println(Source.fromFile(fileName).getLines().map((s: String) => s.toInt).reduce((x1: Int, x2: Int) => x1 + x2))
    println(Source.fromFile(fileName).getLines().map((s: String) => s.toInt).sum)

    // part two; save to array as we may need to iterate multiple times
    // todo: look for a more functional way to do this.
    val input = Source.fromFile(fileName).getLines().map((s: String) => s.toInt).toArray
    var curFreq = 0
    val len = input.length
    var i = 0
    val frequencies = scala.collection.mutable.Set.empty[Int]

    do {
      if (i > len - 1) {
        i = 0
      }
      curFreq = curFreq + input(i)
      if (frequencies.contains(curFreq)) {
        solved = true
      } else {
        frequencies += curFreq
        i += 1
      }
    } while (!solved)

    println(curFreq)
  }
}

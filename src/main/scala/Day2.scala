import scala.io.Source

class Day2 {

}

object Day2 {
  def main(args: Array[String]): Unit = {
    println("Hi")
    val fileName = "src/main/resources/Day2-input.txt"

    val input = Source.fromFile(fileName).getLines()
    var twos = 0
    var threes = 0

    input.foreach((s: String) => {
      val charMap = collection.mutable.Map[Char, Int]()
      s.toCharArray.foreach(c => charMap.update(c, charMap.getOrElseUpdate(c, 0) + 1))
      charMap.values.find(i => i == 2).foreach(_ => twos += 1)
      charMap.values.find(i => i == 3).foreach(_ => threes += 1)
    })

    println(s"twos: $twos and threes: $threes => $twos * $threes == ${threes * twos}")


  }
}

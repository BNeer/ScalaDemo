
// Program for demonstrating for-expression that iterates over a list of strings:
object Fruit {
  def main(args: Array[String]): Unit = {

    val fruits = List("apple", "banana", "lime", "orange")
    val fruitsLengths: List[Int] = for {
      f <- fruits
      if f.length > 4
    } yield f.length

    // Print the list of fruit lengths
    println(fruitsLengths)
  }
}

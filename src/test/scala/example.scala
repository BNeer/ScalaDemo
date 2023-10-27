import scala.collection.mutable.ListBuffer

object example extends App {
  def double(ints: List[Int]): List[Int] = {
    val buffer = new ListBuffer[Int]()
    for (i <- ints) {
      buffer += i * 2
    }
    buffer.toList
  }

  val oldNumbers = List(1, 2, 3)
  val newNumbers = double(oldNumbers)
}

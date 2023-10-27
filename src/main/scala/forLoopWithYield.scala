object forLoopWithYield {
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5)
    val squaredNumber = for (i <- numbers) yield (i * 2)
    println(s"Square of numbers: $squaredNumber")
    }
  }



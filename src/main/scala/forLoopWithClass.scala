object forLoopWithClass {
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5,6,7,8,9,10)
    // if is used after for, it is called guards
    for (i <- numbers if i % 2 == 0){
      println(s"Even number : $i")
    }

  }

}

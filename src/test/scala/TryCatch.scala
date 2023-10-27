//try{
//  writeToFile(text)
//}catch {
//  case fnfe: FileNotFoundException => println(fnfe)
//  case ioe: IOException => println(ioe)

//}



// Example of Try/Catch through below program

object TryCatch {
  def main(args: Array[String]): Unit = {
    try {
      // We try to do something that might cause an error
      val numerator = 10
      val denominator = 0
      val result = numerator / denominator
      println(s"Result: $result")
    } catch {
      case e: ArithmeticException =>
        // If an error (in this case, dividing by zero) happens, we catch it here
        println("An error occurred: Division by zero")
    }
  }
}

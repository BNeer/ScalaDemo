import scala.io.StdIn

object tryCatchFinallyExample {
  def main(args: Array[String]): Unit = {
    try {
      // Code that may throw an exception
      val input = StdIn.readLine("Enter a number: ").toInt
      val result = 10 / input
      println(s"Result: $result")
    } catch {
      case e: NumberFormatException =>
        println("Invalid input. Please enter a valid number.")
      case e: ArithmeticException =>
        println("Division by zero is not allowed.")
    } finally {
      // Cleanup code that will always be executed, regardless of whether an exception was thrown
      println("Cleanup code executed.")
    }
  }
}

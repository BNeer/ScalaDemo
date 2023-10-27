import scala.io.Source

object APIClient {
  def main(args: Array[String]): Unit = {
    val apiUrl = "http://127.0.0.1:5000/retrieve" // Replace with your API URL

    val response = Source.fromURL(apiUrl).mkString

    println("Response from API:")
    println(response)
  }
}
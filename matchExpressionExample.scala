object matchExpressionExample {
  def main(args: Array[String]): Unit = {
    val dayOfWeek = 9

    val dayName = dayOfWeek match {
      case 1 => "Sunday"
      case 2 => "Monday"
      case 3 => "Tuesday"
      case 4 => "Wednesday"
      case 5 => "Thursday"
      case 6 => "Friday"
      case 7 => "Saturday"
      case _ => "Invalid Day"

    }
    println(s"Day of the week : $dayName")
  }

}

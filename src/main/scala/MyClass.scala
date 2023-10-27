object MyClass {
  class MySubClass {
    def sayHello(name: String): Unit = {
      println(s"Hello, $name!")
    }
  }

  def main(args: Array[String]): Unit = {
    val myObject = new MySubClass()
    myObject.sayHello("Peter")
  }
}




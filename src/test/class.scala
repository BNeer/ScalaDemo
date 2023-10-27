class Person (var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}


// Will replace surname in below code as result would be Neeraj Gupta
val p = new Person("Neeraj", "Bhartendu")
println(p.firstName)
p.lastName = "Gupta"
p.printFullName()


class Pizza(
           var crustSize: CrustSize,
           var crustType: CrustType,
           val toppings: ArrayBuffer[Topping]
           ){
  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()


}
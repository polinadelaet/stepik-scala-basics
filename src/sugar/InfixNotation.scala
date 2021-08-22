package sugar

object InfixNotation extends App {
  class Book(val title: String, val id: Int) {
    def &&(permission: Boolean) = permission && (id < 10)
  }

  val book = new Book("The Shining", 3)
  println(book && true)
  println(10.unary_- == -10)

  class Person(val name: String) {
    def unary_+ :Person = {
      new Person(s"${this.name} NoSurname")
    }
  }

  val person = new Person("Bob")
  println((+person).name)




}

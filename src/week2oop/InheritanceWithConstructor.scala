package week2oop

object InheritanceWithConstructor extends App {
  class Person(name: String, surname: String) {

    def this() = this("who", "is мы")
  }

  class Student(val name: String, surname: String, crush: String) extends Person {}

  val Polina = new Student("Polina", "Prok", "nobody")
  println(Polina.name)



  class Human(id: Int, kek: String) {}
  class Pupil(id: Int, kek: String, crush: String) extends Human(id, kek) {

  }
}

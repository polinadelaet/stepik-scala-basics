package week2oop

object OverrideClass extends App {

  class Animal(name: String, age: Int) {
    val favoriteSound = "gav"
    def crush: String = "nein"

    def run(): Unit = {
      println("I AM RUNNING")
    }
  }
  class Cat(name: String, age: Int, override val favoriteSound: String) extends Animal(name, age) {
    override def run() = {
      println("i am fucking cat i hate activities")
    }
    val mem: String = super.crush + " I have"
  }

  val cat: Cat = new Cat("kisa", 15, "MEW")
  val pet = new Animal("zhora", 3)
  cat.run
  pet.run
  println(cat.mem)
  println(cat.crush)
}

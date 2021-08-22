package week2oop

object TestAbstract extends App {

  abstract class Fruit() {
    def isDelishes()

    val taste: String
    val kek = "kek"
  }

  val fruit = new Fruit {
    override def isDelishes(): Unit = {
      "lel"
    }

    override val taste: String = "taste"
  }

}

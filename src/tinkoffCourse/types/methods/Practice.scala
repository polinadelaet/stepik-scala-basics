package tinkoffCourse.types.methods

object Practice extends App {
  def eat(apple: Int, bananas: Int*) = {
    println(apple*bananas.max)
  }

  def schet(k: Int)(l: Long)(j: Double) = {
    k*l*j
  }

  val bananas: Array[Int] = Array(2, 3, 4)
  eat(2, 5, 8, 1)
  println(schet(1)(3)(4))
}

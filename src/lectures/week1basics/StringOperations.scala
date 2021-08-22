package lectures.week1basics

import scala.+:

object StringOperations extends App {
  val aStr = '1'.+("42")
  val name = "John"

  println(s"Hello, $name") // выводит Hello, John

  val crush_name = "Dima"
  val crush_surname  = 'm'
  println(s"I like ${crush_name + crush_surname}")
  println("link" ++: "/catalog")
  println(s"The link is $crush_name.toUpperCase")

  val someStr = "rer \n reeer"
  println("$someStr")
  println(s"rer \n reeer")
  println(raw"$someStr")


}
//n-1
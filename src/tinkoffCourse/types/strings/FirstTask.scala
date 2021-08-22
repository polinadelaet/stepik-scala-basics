package tinkoffCourse.types.strings

import scala.io.StdIn.{readInt, readLine}

object FirstTask extends App {
  val str1 = readLine()
  val kek: Array[Int]= str1.split(" ").map(_.toInt)

  val str2: String = readLine()
  val heart = str2.substring(kek(0), kek(1)+1).reverse
  println(str2.substring(kek(0), kek(1)+1))

  println(s"${str2.replace(str2.substring(kek(0), kek(1)+1), heart)}")
}

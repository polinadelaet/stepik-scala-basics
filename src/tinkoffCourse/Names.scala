package tinkoffCourse
import tinkoffCourse.Names.Config.{name => prefix}

import scala.io.StdIn.readInt
import scala.math.BigDecimal.RoundingMode.HALF_UP

object Names extends App {
  def greeting(name: String) {
    println(prefix + name)
  }

  object Config {
    val name = "Hello, "
  }

  val name = "Oleg"
  greeting(name)
  val p: Unit = 42

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    1/(sigma*scala.math.sqrt(2*scala.math.Pi)) * scala.math.pow(scala.math.E, (-((x - mu)*(x - mu))/(2 * scala.math.pow(sigma, 2))))
  }

  val ch1: BigInt = BigInt(10)
  val ch2 = BigInt(30)
  println(ch1.gcd(ch2))
  val kek = ((1: Short) + (2: Short)).toShort
  println(kek.getClass)
  val mem: Int = "34567890".toInt



  def crispsWeight(weight: BigDecimal, potatoWaterRatio: BigDecimal, crispsWaterRatio: BigDecimal): BigDecimal = {
    ((weight * (1 - potatoWaterRatio)) / (1 - crispsWaterRatio) ).setScale(5, HALF_UP)
  }

  println(crispsWeight(90.0, 0.9, 0.1))

  def circle(a: BigInt): BigInt = {
    def loop(ch: BigInt, AC: Int = 0): BigInt = {
      if ( ch >0 ) {
        if (ch % 2 == 0) loop(ch >> 1, AC)
        else loop(ch >> 1, AC+1)
      }
      else AC
    }
    loop(a)
  }

  val o = readInt()
  println(circle(o))

  val x = "Kate"
  val y = "Egor"
  val a = x + y
  val b = x + y

  a == b // будет TRUE потому что скала поймет что там они равны
  println(a eq b)


  def isCapital(word: String, pos: Int): Boolean = {
    if (((word.charAt(pos) >= 65) && (word.charAt(pos) <= 90))) true
    else false
  }
  println(isCapital("Scala", 0))
  println('S'.toInt)
}

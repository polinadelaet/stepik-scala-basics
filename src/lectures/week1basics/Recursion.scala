package lectures.week1basics

object Recursion extends App {
  def factorial(n: Int) : Int = {
    def loop(n: Int, AC: Int = 1): Int = {
      if (n > 0) loop(n-1, n * AC)
      else AC
    }
    loop(n)
  }
  def repeatWord(n: Int, word: String): String = {
    def loop(n: Int, AC : String = ""): String = {
      if (n <= 0) AC
      else loop(n-1, s"$word $AC")
    }
    loop(n)
  }

  def powerOfTwo(digit: Int): BigInt = {
    def loop(n: Int, AC: BigInt = 1): BigInt = {
      if (n <= 0) AC
      else loop(n-1, AC * 2)
    }
    loop(digit)
  }

  def uvelich(x: Int, y: Int, n: Int): Int = {
    def loop(n: Int, AC: Int = 0): Int = {
      if (n <= 0) AC
      else loop(n - 1, AC + y)
    }
    loop(n, x)
  }

  def printLoop(x: Int): String = {
    def loop(n: Int, AC: String = ""): String = {
      if (n <= 0) AC
      else loop(n - 1, s"$x $AC")
    }
    loop(x.toString.length)
  }

  println(powerOfTwo(2))

  println(factorial(4))

  println(repeatWord(2, "kek"))

  println(powerOfTwo(13))

  println(printLoop(uvelich(10, 1, 5)) + "is the result")
}

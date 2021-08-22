package lectures.week1basics

object Dop extends App {
  def changeProbels(string: String): String = {
    def loop(n: Int, flag: Boolean, AC: String=""): String = {
      if (n < 0) AC
      else {
        if ((string.charAt(n) != ' ')) {
          println(s"char at $n = " + string.charAt(n))
          loop(n-1, false, string.charAt(n)+AC)
        } else {
          if ((string.charAt(n) == ' ') && !flag) {
            loop(n-1, true, string.charAt(n)+AC)
          } else loop(n-1, true, AC)
        }
      }
    }
    loop(string.length - 1, true)
  }

  def printe(list: List[String], n: Int): String = {
    def loop(n: Int, AC: String = "") : String = {
      if (n < 0) AC
      else loop(n-1, s"$AC ${list(n)}")
    }
    loop(n-2, list(n-1))
  }

  val a: List[String] = changeProbels("I like     Scala ").split(" ").toList
  println(printe(a, a.length))
}

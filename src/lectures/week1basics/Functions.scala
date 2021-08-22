package lectures.week1basics

object Functions extends App {
  def aFunctionWithDefaultParameter(x: Int = 21, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  println(aFunctionWithDefaultParameter())

}

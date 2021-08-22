package tinkoffCourse.types.methods

object Task1 extends App {
  def fibs(num: Int) = {
    def loop(n: Long, AC1: Long = 1, AC2: Long = 1): Long = {
      if ((n==1) || (n==2)) AC1
      if (n == num) AC1
      else loop(n+1, AC2, AC1+AC2)
    }
    loop(1)
  }
  println(fibs(7))
}

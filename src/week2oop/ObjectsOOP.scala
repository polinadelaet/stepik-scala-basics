package week2oop

object ObjectsOOP extends App {
  def fib(n: Int): Int = {
    def loop(n: Int, AC: Int = 1): Int = {
      if (n <= 2) AC
      else loop(n - 1, AC)+loop(n - 2, AC)
    }
    loop(n)
  }

  println(fib(10))



  class Instructor(val id: Int, val name: String, val surname: String) {
    def fullName() = {
      s"${this.name.toUpperCase().charAt(0)}${this.name.substring(1, this.name.length).toLowerCase} ${this.surname.toUpperCase().charAt(0)}${this.surname.substring(1, this.surname.length).toLowerCase}"
    }
  }

  class Course(courseID: Int, val title: String, val releaseYear: String, instructor: Instructor) {
    def getId = {
      s"${this.courseID}${this.instructor.id}"
    }

    def isTaughtBy(instructor: Instructor) = {
      instructor.id == this.instructor.id && instructor.name == this.instructor.name && instructor.surname == this.instructor.surname
    }

    def copyCourse(newReleaseYear: String) = {
      new Course(this.courseID + 1, "", newReleaseYear, instructor)
    }
  }

  val kek = new Instructor(1, "kek", "SDFGHJK")
  println(kek.fullName())
}

package sugar

object CaseClasses extends App  {
  case class Course(title: String, instructor: String)

  object Course {
    def apply(instructor: String): Course = Course("AdvancedScala", instructor)
  }

  val scalaCourse = Course("Scala", "Bob")

  val course = scalaCourse.copy(instructor = "AdvancedScala")
  println(course.instructor)
}

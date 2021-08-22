package exercises

object LinkedListWithGenerics extends App {
  abstract class LogList[+A] {
    def last: A
    def previous: LogList[A]
    def isEmpty: Boolean
    def all: String
    def add[B >: A](msg: B): LogList[B]
  }
  class Log[+A](head: A, tail: LogList[A]) extends LogList[A] {
    override def add[B >: A](msg: B): LogList[B] = new Log[B](msg, this)
    override def last = head
    override def previous = tail
    override def isEmpty = false
    override def all: String = {
      def loop(list: LogList[A], AC: String = ""): String = {
        if (list.isEmpty) AC
        else loop(list.previous, AC  +" "+ list.last)
      }
      loop(previous, s"$last")
    }
  }

  object Empty extends LogList {
    override def add[B >: Nothing](msg: B): LogList[B] = new Log(msg, Empty)
    override def last = throw new NoSuchElementException
    override def previous = throw new NoSuchElementException
    override def isEmpty = true
    override def all = ""
  }
}

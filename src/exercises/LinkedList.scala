package exercises

object LinkedList extends App {
  abstract class LogList {
    def last: String
    def previous: LogList
    def isEmpty: Boolean
    def all: String
    def add(msg: String): LogList
  }
  class Log(head: String, tail: LogList) extends LogList {
    override def add(msg: String): LogList = new Log(msg, this)
    override def last = head
    override def previous = tail
    override def isEmpty = false
    override def all: String = {
      def loop(list: LogList, AC: String = ""): String = {
        if (list.isEmpty) AC
        else loop(list.previous, AC  +" "+ list.last)
      }
      loop(previous, head)
    }
  }

  object Empty extends LogList {
    override def add(msg: String): LogList = new Log(msg, Empty)
    override def last = throw new NoSuchElementException
    override def previous = throw new NoSuchElementException
    override def isEmpty = true
    override def all = ""
  }

  val llog = new Log("m1", new Log("m2", new Log("m3", Empty)))
  println(llog.all)
}

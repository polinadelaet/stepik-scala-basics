package exercises

object LogSystem extends App {
  class Logger(msgNum: Int = 0) {
    def info = {
      println("INFO New Message")
      new Logger(msgNum + 1)
    }
    def info(n: Int): Logger = {
      def loop(n: Int): Logger = {
        if (n <= 0) this
        else info.info(n-1)
      }
      loop(n)
    }
    def print = println(msgNum)
  }

  val log = new Logger
  log.info(4).print
  log.info.print

}

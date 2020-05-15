package myproject

object implicitdemo2 {
  def main(args: Array[String]): Unit = {
    implicit val srt1: String = "jack"

    def hello(implicit name: String): Unit = {
      println(name + "hello")

      def hello(): Unit = {
        println("xxx")
      }
    }

    hello(srt1)
  }

  def hello(): Unit = {
    println("xx")
  }
}

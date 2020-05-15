package myproject

object implicitdemo3 {
  def main(args: Array[String]): Unit = {
    implicit val name: String = "Scala"
    implicit val name1: String = "World"

    def hello(implicit content: String = "jack") = {
      println("Hello" + content)
    }
  }
}

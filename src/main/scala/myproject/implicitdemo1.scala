package myproject

object implicitdemo1 {
  def main(args: Array[String]): Unit = {

    implicit def f1(d: Double): Int = {
      d.toInt
    }

    val num: Int = 3.5
    println(num)

  }

}

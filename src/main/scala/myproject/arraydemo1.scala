package myproject

import scala.collection.mutable.ArrayBuffer

object arraydemo1 {
  def main(args: Array[String]): Unit = {
    val arr03 = ArrayBuffer[Any](3, 4, 5)
    for (i <- arr03) {
      println(i)
    }
    println("arr03(1)=" + arr03(1))
    println(arr03.length)
    println(arr03.hashCode())
    println("----------------------------------")
    arr03.append(12,23,32)
    for (i <- arr03) {
      println(i)
    }
    println("arr03(1)=" + arr03(1))
    println(arr03.length)
    println(arr03.hashCode())
  }
}

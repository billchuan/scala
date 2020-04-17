//4月17日上课学习
import scala.beans.BeanProperty

object demo08 {
  def main(args: Array[String]): Unit = {
    val car1 = new car1
    car1.name = "BMW"
    println(car1.name)
    println("--------------------")
    val car2 = new car2
    car2.name = "aaa"

    car2.setName("bbb")
    println(car2.getName)
  }

}

class car1 {
  var name: String = null
}

class car2 {
  @BeanProperty var name: String = _
}
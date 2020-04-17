import scala.beans.BeanProperty

object demo08 {
  def main(args: Array[String]): Unit = {
    val car1 =new car
    car1.name="BMW"
    println(car1.name)
    println("--------------------")

  }

}

class car {
  @BeanProperty var name: String = null
}

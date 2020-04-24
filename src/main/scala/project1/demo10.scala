//4月24日学习

package project1

object demo10 {
  def main(args: Array[String]): Unit = {
    val emp = new emp
    emp.printname()
    emp.name="tom"
    emp.sayhi()

  }
}

class person {
  var name: String = "jack"

  def printname() = {
    println("person printname()" + name)
  }

  def sayhi() = {
    println("say hello")
  }
}


class emp extends person {
  override def printname(): Unit = {
    println("emp printname()" + name)
    println("----------------------")
    super.printname()
    println("----------------------")
    sayhi()
  }
}


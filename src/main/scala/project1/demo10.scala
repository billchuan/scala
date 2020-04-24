//4月24日学习

package project1

object demo10 {
  def main(args: Array[String]): Unit = {
    val emp = new emp
    emp.printname()
  }
}

class person {
  var name: String = _

  def printname() = {
    print("person printname()" + name)
  }
}


class emp extends person {
  override def printname(): Unit = {
    println("emp printname()" + name)
  }
}


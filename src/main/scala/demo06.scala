//4月10日一、二节课学习
//类的定义练习
object demo06 {
  def main(args: Array[String]): Unit = {
    val cat = new cat
    cat.name = "小白"
    cat.age = 3
    cat.color = "白色"



    println("小猫的信息如下，名字:" + cat.name + "\t颜色:" + cat.color + "\t年龄:" + cat.age)
  }
}


class cat {
  var name: String = " "
  var age: Int = _
  var color: String = _
  var dog = null

}

class dog {

}
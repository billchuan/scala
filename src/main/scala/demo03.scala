//3月27日一、二节课上课学习
object demo03 {
  //方法的定义,实现加法运算
  def add(x: Int, y: Int): Int = {
    x + y
  }

  //方法体自动补齐返回值
  def add1(x: Int, y: Int) = {
    x + y
  }

  //定义参数列表
  def add2(x: Int)(y: Int) = {
    x + y
  }

  //定义无参方法
  def name: String = {
    System.getProperty("user.name") //调用系统用户名
  }

  //定义带有默认参数的方法
  def display(str: String = "hello scala"): Unit = {
    println(str)
  }

  //定义带有多个默认参数值的方法
  def add3(x: Int = 1, y: Int = 2, z: Int) = {
    x + y + z
  }

  //定义不定长参数的方法
  def add4(a: Int*) = {
    var sum = 0
    for (item <- a) {
      sum = sum + item
      print(item+" ")
    }
    print("sum=" + sum)
  }

  def main(args: Array[String]): Unit = {
    val res = add1(2, 3)
    println("res=" + res)
    val res1 = add2(3)(4)
    println("res1=" + res1)
    println(name)
    println(display("123456789"))
    val res2 = add3(z = 3)
    println("res2=" + res2)
    add4(2,3,4,5,6,7,8,9,10)


  }

}

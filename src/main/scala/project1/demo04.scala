package project1

//3月27日三、四节课上课学习
object demo04 {
  //return指定返回值
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  //五种常用的函数的定义方法
  val f1 = ((x: Int, y: Int) => (x + y))
  val f2 = (x: Int, y: Int) => (x + y)
  //“_”类似于占位符
  val f3 = (_: Int) + (_: Int)
  val f4: (Int, Int) => Int = (_ + _)
  val f5: ((Int, Int) => Int) = ((x, y) => x + y)

  //实现3!:3*2*1
  //递归的方法实现4!:4*3!
  //通过递归函数返回一个结果
  val dg: Int => Int = (n) => {
    if (n <= 1) {
      1
    } else {
      n * dg(n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    //    println(add(1, 2))
    //    println(f1(2, 3))
    //    println(f2(3, 4))
    //    println(f3(4, 5))
    //    println(f4(5, 6))
    //    println(f5(6, 7))
    println(dg(3))
    //println(test(4))
  }


}

//4月3日一、二节课学习
object demo05 {
  //惰性函数，延迟加载(首次不执行再次调用执行)
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("---------------------")
    println("res="+res)

  }





  def sum(a: Int, b: Int): Int = {
    println("sum()函数执行了.................")
    return a + b
  }


}

//3月20日一、二节课程代码
object demo02 {
  def main(args: Array[String]): Unit = {
    /*list集合遍历练习
    var list = List("hello", 30, 20, "scala")
    for (item <- list) {
      println("item=" + item)
    }
    */
    /*引入变量练习
    for (i <- 1 to 5; j = 10 - i) {
      println(j)
    }
    */
    /*循环嵌套练习
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i=" + i + "j=" + j)
    }
    //与上相同
    for (i <- 1 to  3) {
      for (j <- 1 to 3) {
        println("i=" + i + "j=" + j)
      }
    }
    */

    /*循环返回值
    val res = for (i <- 1 to 10) yield i
     println(res)

     val res1=for (i<-1 to 10 ) yield {
       if(i%2==0)
         i
       else
         "不是偶数"
     }
     println(res1)
     */

    /*布长的控制
    for (i <- Range(1,10,2)){
      println("i="+i)
    }
    for (i <-1 to 10 if i%2==1){
      println("i="+i)
    }
    */
    /*计算1-100之间9的倍数的和以及个数
    var count = 0
    var sum = 0
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        count = count + 1
        sum = sum + i
      }
    }
    println("count=" + count + "  sum=" + sum)
    */
    /*for循环嵌套
    val num = 6
    for (i <- 0 to num) {
      println(i + "+" + (num - i) + "=" + num)
    }
    */

    //3月20日三、四节课代码

    /* while循环
    var i = 0 //变量初始化
     while (i < 10) //循环条件
     {
       println("hello scala" + i)
       i += 1 //循环变量迭代
     }
    */
    /*while循环 打印1-100被3整除的数
    var i = 1
    while (i >= 0 && i <= 100) {
      if (i % 3 == 0) {
        print(i + " ")
      }
      i += 1
    }
    */
    /*do.....while循环练习
    var i = 0
    do {
      println("hello scala" + i)
      i += 1
    }while (i < 10)
    */

  }
}

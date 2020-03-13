import io.StdIn._
object demo01 {
  def main(args: Array[String]): Unit = {
    val grade=readFloat()
    if (grade==100){
      println("应该奖励BMW")
    }
    else if(grade>80&&grade<100){
      println("应该奖励iphone7plus")
    }
    else if (grade>=60&&grade<=80){
      println("应该奖励一台ipad")
    }
    else{
      println("什么都没有")
    }
    /*
    val year=readInt()
    if((year %4 ==0&&year %100 !=0)||(year %400==0)){
      println(year+"年是闰年")
    }
    else{
      println(year+"年不是闰年")
    }
    */

    /*
    val a=readLine("请输入第一个数:")
    val b=readLine("请输入第二个数:")
    val sum=a+b
    if ((sum.toInt%3==0)&&(sum.toInt%5==0)){
      println("可以被整除")
    }
    */

  }
}

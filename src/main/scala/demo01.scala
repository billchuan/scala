import scala.io.StdIn._
object demo01 {
  def main(args: Array[String]): Unit = {

    print("请输入成绩:")
    val cj=readDouble()
    if(cj<=8){
      println("你已进入决赛")
      print("请输入性别:")
      var sex=readChar()
      if (sex.toString=="男"){
        println("进入男子组")
      }else{
        println("进入女子组")
      }
    }
    else{
      println("Pass")
    }
    /*
    val a=readInt()
    val res={
      if (a>20){
        "111"
        7
        "222"
      }
      else {
        "ok"
      }
    }
    println("res="+res)
    */
    //多分支代码
    /*
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
    */
    //年份判断
    /*
    val year=readInt()
    if((year %4 ==0&&year %100 !=0)||(year %400==0)){
      println(year+"年是闰年")
    }
    else{
      println(year+"年不是闰年")
    }
    */
    //整除代码
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

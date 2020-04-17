//4月17日上课学习
object demo07 {
  def main(args: Array[String]): Unit = {
    //    val p1 = new person("Jack", 30)
    //    p1.name = "Jack"
    //    p1.age = 20
    //    println("name=" + p1.name + "\nage=" + p1.age)
    //    val p2 = new person("bill")
    //    println("name=" + p2.name + "\nage=" + p2.age)
    //    println("++++++++++++++++++++++++++++++++++++")
    //    val p3 = new person("tom", 50)
    //    println("name=" + p3.name + "\nage=" + p3.age)
    val wo1 = new work1("tom") {
      println("name=" + wo1.name)
      //work1.inname 不能访问
      println("---------------------")
    }
    val wo2 = new work2("tom") {
      println("name=" + wo2.name)
      //work2.inname 不能赋值
      println("---------------------")
    }
  }

}

//class person(inname :String) {
//  var name: String = inname
//  var age: Int = _
//  age += 10
//  println("------------------------------------")
//
//  def this(inname: String, inage: Int) {
//    this("bill")
//    this.name = inname
//    this.age = inage
//  }
//}
class work1(inname: String) {
  var name = inname
}

class work2(val inname: String) {
  var name = inname
}

class work3(var inname: String) {
  var name = inname
}
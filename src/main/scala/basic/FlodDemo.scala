package basic

/**
 * Author:BYDylan
 * Date:2020/7/22
 * Description:注意括号方向
 */
object FlodDemo {
  def main(args: Array[String]): Unit = {
    val list4 = List(1, 9)
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }
//    (1 - 1) - 9
    var i6 = list4.foldLeft(1)(minus)
    println("i6=" + i6)

//    (100 - 1) - 9
    i6 = list4.foldLeft(100)(minus)
    println(i6)

//    (1 - (9 - 10))
    i6 = list4.foldRight(10)(minus)
    println(i6)


  }
}

package basic

/**
 * Author:BYDylan
 * Date:2020/7/22
 * Description:你并不希望立即执行,而是在使用到结果才执行,则可以使用view来进行优化
 */
object ViewDemo {
  def main(args: Array[String]): Unit = {
    //    没有使用view,常规方式
    //    val viewSquares1 = (1 to 10).filter(eq)
    //    println(viewSquares1)

    val viewSquares2 = (1 to 10).view.filter(eq)
    println(viewSquares2)
    //    遍历
    //    for (item <- viewSquares2) {
    //      println("item=" + item)
    //    }
  }

  //如果这个数,逆序后和原来数相等,就返回true,否则返回false
  def eq(i: Int): Boolean = {
    println("eq 被调用..")
    i.toString.equals(i.toString.reverse)
  }
}

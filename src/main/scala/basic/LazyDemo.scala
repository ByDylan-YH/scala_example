package basic

/**
 * Author:BYDylan
 * Date:2020/7/21
 * Description:lazy修饰的变量在调用的时候才会执行
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("先执行分割线")
    println("res=" + res)
  }

  //sum函数，返回和
  def sum(n1: Int, n2: Int): Int = {
    println("sum() 执行了..") //输出一句话
    return n1 + n2
  }

}

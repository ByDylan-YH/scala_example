package basic

object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    //    1.在scala中只有一个catch
    //    2.有多个case,每个case匹配一种异常
    //    3.从上往下优先匹配异常
    //    4.try 当中一旦异常,try里面的后续步骤不再执行,执行try外语句
    try {
      val r = 10 / 0
      throwsException();
      println("try内部")
    } catch {
      case ex: ArithmeticException => {
        println(s"捕获异常: ${ex.getMessage()}")
      }
      case ex: Exception => println(s"捕获异常: ${ex.getMessage()}")
    } finally {
      println("finally...")
    }
    println("try外部")
  }

  @throws(classOf[NumberFormatException]) //等同于Java NumberFormatException.class
  def throwsException() = {
    //    11.5.toInt
    "abc".toInt
  }
}

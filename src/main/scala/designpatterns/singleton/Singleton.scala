package designpatterns.singleton

/**
  * Author:BY
  * Date:2019/11/27
  * Description:单例设计模式
  */
class Worker private {
  def work() = println("I am the only worker!")
}

object Worker {
  val worker = new Worker

  def GetWorkInstance(): Worker = {
    worker.work()
    return worker
  }
}

object Singleton {
  def main(args: Array[String]) {
    for (i <- 1 to 3) {
      Worker.GetWorkInstance()
    }
  }
}
package basic

import scala.beans.BeanProperty
/**
 * Author:BYDylan
 * Date:2020/7/21
 * Description:使用 @BeanProperty 自动生成 getXxx 和 setXxx
 */
object BeanPropertDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car()
    car.name = "宝马"
    println(s"car.name: ${car.name}")
    println(s"car.getName(): ${car.getName()}")
    car.setName("奔驰")
    println(s"car.getName(): ${car.getName()}")
  }
}

class Car {
  @BeanProperty var name: String = null
}

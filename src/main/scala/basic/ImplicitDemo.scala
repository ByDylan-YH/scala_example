package basic

/**
 * Author:BYDylan
 * Date:2020/7/22
 * Description:隐式函数应当在作用域才能生效
 */
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数转成 Double->Int 转换,我们必须保证隐式函数的匹配只能是唯一的.
    implicit def doubleToInt(d: Double): Int = { //底层 生成 f1$1
      d.toInt
    }

    implicit def floatToInt(f: Float): Int = {
      f.toInt
    }

    //    底层编译 f1$1(3.5)
    val num: Int = 3.5
    val num2: Int = 4.5f
    println(s"num: ${num}")
    println(s"num2: ${num2}")

    //    编写一个隐式函数,丰富mySQL功能
    implicit def addDelete(msql: MySQL): DB = {
      new DB
    }

    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() // 编译器工作 分析 addDelete$1(mySQL).delete()
    mySQL.update()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }

  def update(): Unit = {
    println("update")
  }
}


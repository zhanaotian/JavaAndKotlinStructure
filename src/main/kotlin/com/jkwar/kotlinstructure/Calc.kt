package com.jkwar.kotlinstructure

import java.lang.NumberFormatException

/**
 *  命令行计数器开发
 */
fun main(args: Array<String>) {
  //无限循环
  while (true) {
    try {
      println("请输入算式例如：4 + 5")
      val input = readLine() ?: break
      //去掉空字符串
      val splits = input.trim().split(" ")
      if (splits.size < 3) {
        throw IllegalArgumentException("参数个数不对")
      }
      val arg1 = splits[0].toDouble()
      val op = splits[1]
      val arg2 = splits[2].toDouble()
      println("$arg1 $op $arg2 = ${Operator(op)(arg1, arg2)}")
    } catch (e: NumberFormatException) {
      println("你确定输入的是数字吗？")
    } catch (e: IllegalArgumentException) {
      println("你确定你输入的是三个参数？或者您确定您的输入是用空格分隔的吗？")
    } catch (e: Exception) {
      println("亲爱的用户，你的运气太差，程序遇到未知的异常，${e.message}")
    }
    println("您确定要再来一发吗？[Y]")
    val cd = readLine()
    //如果等于y，再一次循环
    if (cd == null || cd.toLowerCase() != "y") {
      break
    }
  }
  println("感谢你使用我们的计算器。")
}


class Operator(op: String) {
  private val opFun: (left: Double, right: Double) -> Double

  init {
    opFun = when (op) {
      "+" -> { l, r -> l + r }
      "-" -> { l, r -> l - r }
      "*" -> { l, r -> l * r }
      "/" -> { l, r -> l / r }
      "%" -> { l, r -> l % r }
      else -> {
        throw UnsupportedOperationException(op)
      }
    }
  }

  //重载
  operator fun invoke(left: Double, right: Double): Double {
    return opFun(left, right)
  }

//  fun apply(left: Double, right: Double): Double {
//    return opFun(left, right)
//  }

}
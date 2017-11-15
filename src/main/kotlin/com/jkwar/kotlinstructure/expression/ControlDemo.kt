package com.jkwar.kotlinstructure.expression

/**
 * 流程控制
 */
fun main(args: Array<String>) {
  //if
  val a = 1
  val b = 4
  val c = "string"
  val stringlist = listOf(1, 2, 3, "java", 'c')
  println("-- if 表达式--")
  val max = if (a > b) {
    print("Choose a")
    a
  } else {
    print("Choose b")
    b
  }
  println()
  println(max)

  println("--When 表达式--")
  when (a) {
    0 -> println(0)
    1 -> println(1)
    else -> {
      println("a not is 0 or 1")
    }
  }

  when (a) {
    0 -> println("a is 1 or 2")
    else -> println("a not is 0 nor 1")
  }

  when (b) {
    in 1..10 -> println("b is in the range")
    !in 10..20 -> print("b is outside the range")
    else -> print("none of the above")
  }

  fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
  }

  when {
    a == 20 -> print("x == 20")
    a !is Int -> print("x is Int")
    else -> print("x is funny")
  }


  println(hasPrefix("yes"))


}
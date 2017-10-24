package com.jkwar.kotlinstructure

/**
 * Lambda 表达式
 *
 */

//(Int,Int) -> Int
val sum1 = { arg1: Int, arg2: Int ->
  println("$arg1 + $arg2 = ${arg1 + arg2}")
  arg1 + arg2
}

//() -> Unit
val printlnHello = {
  println("Hello") //( Any?) -> String
}

//(int) -> Long
val int2Long = fun(x: Int): Long {
  return x.toLong()
}

fun main(args: Array<String>) {
  println(printlnHello())
  println(sum1(3, 6))
  println(sum1.invoke(3, 6))
  println(int2Long(3))
  println(sum1)
  println(int2Long)
  println(printlnHello is ()-> Unit)


  //遍历 第一种
  for (arg in args) {
    println(arg)
  }

  //遍历 第二种
  args.forEach(::println)


  args.forEach ForEach@ {
    if (it == "10") return@ForEach
    println(it)
  }


}
package com.jkwar.kotlinstructure.expression

/**
 * 循环语句
 */

fun main(args: Array<String>) {
  //if
  val stringlist = listOf(1, 2, 3, "java", 'c')
  println("--For 循环--")
  for (item in stringlist) println(item)

  for (i in stringlist.indices) {
    println(stringlist[i])
  }

  for ((index, value) in stringlist.withIndex()) {
    println("the element at $index is $value")
  }

  println("--While 循环--")
  var d = 8
  while (d < 10) {
    println(d)
    d++
  }

  println("--do While 循环--")
  var y = 10
  do {
    y++
    println(y)
  } while (y < 15)

  println("-- break 语句 --")
  for (arg in args) {
    if (arg == "Java") {
      break
    }
    println(arg)
  }
  println("-- continue 语句 --")
  continues@ for (arg in args) {
    if (arg == "Java") {
      continue@continues
    }
    println(arg)
  }
  println("-- return 语句 --")
  returns@ for (arg in args) {
    if (arg == "Java") {
      return@returns
    }
    println(arg)
  }

  println("-- 多重嵌套循环结合标签使用 --")
  outter@ for (item in args) {
    lnner@ while (item == "5") {
      println(item)
      if (item == "5") {
        println("退出")
        break@outter
      }
    }
  }
}
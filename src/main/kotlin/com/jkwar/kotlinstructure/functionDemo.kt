package com.jkwar.kotlinstructure

val array = intArrayOf(1, 2, 3, 4, 5)

val list = arrayListOf(1, 2, 3, 4, 5)

//默认函数返回unit
fun sayHi(name: String): Unit {
  println("Hi, $name")
}

//具名参数
fun sum(a: Int, b: Int, c: Int) {

}

fun sum(a: Int, b: Int) = a + b

//变长参数
fun sum(vararg list: Int) {
  list.forEach(::print)
}

fun sum(vararg list: Int, name: String) {
  list.forEach(::print)
  println("name")
}

//默认参数
fun sum(double: Double = 3.0, vararg ints: Int, name: String) {
  println(double)
  ints.forEach(::println)
  println(name)
}

fun sum(double: Double, vararg ints: Int, name: Int = 110) {
  ints.forEach(::println)
  println(name)
}


fun main(args: Array<String>) {
  println("具名参数" + sum(a = 1, b = 2))
  println("变长参数")
  sum(1, 2, 3, 4, 5, 6)
  println()
  sum(1, 2, 3, 4, 5, name = "android")
  println("Spread Operator")
  sum(*array, name = "android")
  println("默认参数")
  sum(ints = *array, name = "java")
  sum(3.0, *array)
}
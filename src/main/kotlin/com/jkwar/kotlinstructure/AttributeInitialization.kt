package com.jkwar.kotlinstructure

/**
 * 属性初始化
 */
class X

class AttributeInitialization {
  var a = 10
  //延迟初始化
  lateinit var b: String
  lateinit var x: X

  val e: X by lazy {
    println("init X")
    X()
  }
  var gg: String? = null
}

fun main(args: Array<String>) {
  println("start")
  val a = AttributeInitialization()
  println(a.a)
  println(a.e)

  //初始化
  a.x = X()
  a.b = "java"

  println(a.x)
  println(a.b)
  println(a.gg?.length)
  a.gg = "aa"
  println(a.gg?.length)


}





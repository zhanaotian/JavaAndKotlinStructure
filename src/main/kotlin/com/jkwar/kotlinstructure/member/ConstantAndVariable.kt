package com.jkwar.kotlinstructure.member

/**
 * 成员属性
 * 幕后字段
 * 幕后属性
 */
class ConstantAndVariable {
  val name: String = "android"
  val city: String = "上海"
  var state: String = "无底"
  //延迟初始化属性
  lateinit var subject: String
  //自定义getter
  val isEmpty
    get() = this.name.length == 0
  //自定义setter
  var stringRepresentation
    get() = this.city
    set(value) {
      stringRepresentation = value
    }
  var setterVisibility = "abcd"
    private set //setter 私有
  //幕后字段
  var counter = 11
    get() = field
    set(value) {
      if (value >= 10) {
        field = 124
      }
    }
  //幕后属性
  private var _table: Map<String, Int>? = null
  public val table: Map<String, Int>
    get() {
      if (_table == null) {
        _table = HashMap()
      }
      return _table ?: throw AssertionError("Set to null by another thread")
    }
}


fun main(args: Array<String>) {
  val cav = ConstantAndVariable()
  println(cav.isEmpty)
  println(cav.name)
  println(cav.city)
  println(cav.state)
  println(cav.stringRepresentation)
  //println(cav.setterVisibility = 0)
  println(cav.counter)
  println(cav.table)
  cav.subject = "hahaha"
  println(cav.subject)
}





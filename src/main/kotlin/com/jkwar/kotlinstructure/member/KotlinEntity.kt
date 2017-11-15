package com.jkwar.kotlinstructure.member

/**
 * 成员属性
 */
class KotlinEntity {
  var name: String = "kotlin"
    get() {
      println("get name $field")
      return field
    }
    set(value) {
      field = value
      println("set name $value")
    }

  var age: Int = 0
    get() {
      println("get age $field")
      return field
    }
    set(value) {
      field = value
      println("set age $value")
    }
}

fun main(args: Array<String>) {
  val kotlinEntity = KotlinEntity()
  kotlinEntity.name = "java"
  println(kotlinEntity.name)
  kotlinEntity.age = 16
  println(kotlinEntity.age)
  println(name)
}

//幕后属性
private var _name: String? = null
public val name: String
  get() {
    if (_name == null) {
      _name = "c++"
    }
    return _name ?: throw  AssertionError("异常")
  }
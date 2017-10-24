package com.jkwar.kotlinstructure


/**
 *  成员方法
 */

class people(var 名字: String, var 长相: String, var 声音: String) {

  fun 唱歌(歌名: String) {
    println("唱的什么歌：$歌名")
  }

  fun 跳舞(舞蹈: String) {
    println("跳的什么舞：$舞蹈")
  }
}

fun main(args: Array<String>) {
  val peple = people("小天鹅", "可爱", "甜美")
  println(peple.名字)
  println(peple.长相)
  println(peple.声音)
  peple.唱歌("起来了")
  peple.跳舞("第二套广播健身操")
}
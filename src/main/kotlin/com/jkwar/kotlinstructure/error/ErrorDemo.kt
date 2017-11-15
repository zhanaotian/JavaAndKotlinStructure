package com.jkwar.kotlinstructure.error

/**
 * 异常捕获
 */
fun main(args: Array<String>) {
    //常规异常处理
//    try {
//        val arg1 = args[0].toInt()
//        val arg2 = args[1].toInt()
//        println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
//    } catch (e: NumberFormatException) {
//        println("你确定你输入的是整数吗？")
//    } catch (e: ArrayIndexOutOfBoundsException) {
//        println("你确定你输入的是两位整数吗？")
//    } catch (e: Exception) {
//        println("你人太丑")
//    } finally {
//        println("感谢你使用我的的加法计算器")
//    }
    //异常表达处理
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println(result)



}
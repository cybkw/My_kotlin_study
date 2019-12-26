package com.bkw.kotlin_study_1.course4

class Test4 {

}

fun main(args: Array<String>) {
    //Kotlin Lambda语法
//    val thread = Thread({ -> Unit })
//    thread.start()
//
//
////如果Lambda没有参数，可以省略箭头符号->
//    val thread2 = Thread({})
//    thread2.start()
//
//    //如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面
//    val thread3 = Thread() {}
//    thread3.start()
//
//    //如果函数只有一个参数且这个参数是Lambda，则可以省略小括号
//    val thread4 = Thread {}
//    thread4.start()

    //执行test闭包的内容
//    test

    //闭包
    echo("打印字符串")

    com(1, 4)

//    me()

    test2(1)

    test2(12)
}

/**
 * Lambda 闭包声明
 * 如：打印一个字符串函数
 * @param name 参数
 * */
val echo = { name: String ->
    println(name)
}

/**
 * 闭包声明
 * 计算x+y的值
 * */
val com = { x: Int, y: Int ->
    println(x + y)
}

/**
 * 无参闭包
 * */
val me = { ->
    println("me= my eye")
}

/**
 * 定义一个比较测试的闭包
 *
 * */
val test = if (5 > 3) {
    println("yes")
} else {
    println("no")
}

/**
 * 动态传参闭包,比较数字大小
 * */
val test2 = { v: Int ->
    if (v > 5) {
        println("$v" + "大于5")
    } else {
        println("$v" + "小于5")
    }
}


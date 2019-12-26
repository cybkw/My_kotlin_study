package com.bkw.kotlin_study_1.course3

class test4 {
}

//1.1 普通带参数的函数
fun echo(name: String) {
    println("$name")
}

//1.2 带默认参数值的函数
fun echo2(name: String? = "bkw") {
    println("$name")
}

//1.3 如果一个函数它的函数体只有一个语句的话，使用以下方式
fun echo3(name: String) = println("$name")


//二、函数嵌套
//类似于内部类，内部函数可以访问外部函数的局部变量。
//一般情况下，不建议使用内部函数，内部函数会降低代码可读性。

//用途：
//在某些条件下触发递归的函数，不希望被外部函数访问到的函数。

fun function() {
    val str = "hello w"

    fun say(count: Int = 10) {
        println(str) // 此处可以访问function函数的str
        if (count > 0) {
            //满足条件递归执行
            say(count - 1)
        }
    }
    say()
}

fun function2() {
    fun f() {
        println("嘻嘻嘻")
    }
}


/**
 * 扩展函数
 * */
//静态在某个类之上添加新的方法
//使用方式：
//fun关键字后面带需要扩展的类的 类名.函数名（函数体）：方法返回类型 +方法体
//如下：
//  类名.函数名  (函数体) 函数返回类型 函数体
//fun File.readText(charset: Charset = Charsets.UTF_8): String = readBytes().toString(charset)


fun main(args: Array<String>) {
//    function()
//    function2()


    //静态在kt类上添加一个扩展函数
    fun Kt.say2(name: String = "bkw"): String = println(name).toString()


    fun Kt.say3(name: String) {
        println("RM")
        println("智孝")
    }
    //直接就可运行扩展的函数
//    Kt.say2()
    Kt.say3("");


    println(Kt.name)

}

//扩展属性,扩展属性不能在函数中定义
val Kt.name: String
    get() {
        return "bkw"
    }
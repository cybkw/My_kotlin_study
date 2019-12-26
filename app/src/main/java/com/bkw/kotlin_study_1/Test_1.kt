package com.bkw.kotlin_study_1


//一、kotlin中，变量名在前，类型在后。
//var 表示一个变量
var age: Int = 18

//另外，如果你写的变量类型是编译器可以推断出来的，就可以不用写类型
// 如：
var arg = 19


//val 表示一个不可变的变量，但不是一个常量
val name: String = "bkw"

//二、kotlin 空安全类型特性
//String默认不能为null
//如：如果不确定name2是否为空,则使用String?表示
val name2: String? = null;

//三、String 和String?是完全不同的类型，他们不能互相赋值
var name3: String = "bkw"
var name4: String? = "lwl"
// 如下：编译无法通过，因为name4是可为空的类型，而name3是不可为空的类型，所以不能赋值
//另外，可为空类型大于不可为空类型，如 name4(可空)=name3（不可空）,可以把name3赋值给name4
//name3=name4

//如何解决？ 使用!! 双感叹号进行强制转换可以解决
fun main(args: Array<String>) {
//    name3 = name4!!
//    name4 = name3
    println_return("lwl")
}

//四、函数相关
//kotlin用fun关键字表示一个方法，如下：
//同样：方法中的参数，变量名在前：类型在后
//无返回值的函数方法
fun print(str: String) {

}

//有返回值的函数方法,表达的方式是在函数名后面用":类型"表示，如下
// 返回值类型为String
fun println_return(str: String): String {
    //使用$美元符号引用一个变量，如下：
    println("这个字符串是：$str")

    return str+"bkw"
}






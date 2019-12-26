package com.bkw.kotlin_study_1

import kotlin.reflect.KClass

/**
 * 与Java代码互相调用
 * */

//一、语法变化
//1.1 Kotlin的代码可以直接写在文件里面，而不用写在类里面，如：test.kt。
//而Java代码必须.java后缀文件结尾。
//示例： Utils.kt
//fun echo(name:String){
//    println("$name")
//}

//Java调用 Main.java
//public static void main(String[] args){
//    UtilsKt.echo("hello kt");
//}

//1.2


fun testClass(clazz:KClass<KotlinMain>){
    println(clazz.simpleName);
}


//二、Kotlin关键字处理


//三、基本数据类型的处理
//在kotlin中，没有封装类这个概念
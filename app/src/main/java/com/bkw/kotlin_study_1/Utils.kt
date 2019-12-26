// 默认包名 package com.bkw.kotlin_study_1

//自己指定包名
package demo

import com.bkw.kotlin_study_1.KotlinMain
import com.bkw.kotlin_study_1.Main
import com.bkw.kotlin_study_1.testClass

/**
 *1.5 kotlin-传递类参数的方式
 * 需要指定传递的类
 * */
fun testClass(clazz :Class<Main>){
    println(clazz.simpleName);
}


/** study2表示Utils.kt文件中一个类，文件中可以存在多个类，如：class study3*/
class Study2 {
    fun echo(name: String) {
        println("我是kotlin:$name")

    }


    /**
     * kotlin匿名内部类
     * */
    object Book{
        fun read(){
            println("我是kotlin匿名内部类：Book")
        }
    }
}



/**
 * main函数==等同于java中的 main方法
 * */
fun main(args: Array<String>) {

    //在kotlin中调用java，可以使用var,也可以使用val,推荐val
    val m=Main();
    m.forKotlin("调用")

    //kotlin调用匿名内部类
    Study2.Book.read()


    //kotlin中调用Java的class的方式
    testClass(Main::class.java)

    //kotlin调用KotlinMain.class的方式
    testClass(KotlinMain::class)
}


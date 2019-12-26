package com.bkw.kotlin_study_1.course8

import java.sql.DriverManager.println


/**
 * by关键字实现动态代理
 * */
interface Animal {
    fun bark()
}

//Dog类实现Animal接口并实现了bark方法
class Dog : Animal {
    override fun bark() {
        println("汪汪..")
    }
}

class Zoo(animal: Animal) : Animal by animal {
    init {
        println("kotlin动态代理 -Zoo")
    }

    //动态代理重写dog的bark方法
    override fun bark() {
        println("大象席地而坐")
    }
}

fun main(args: Array<String>) {
    Zoo(Dog()).bark()  //如果Zoo对象不重写bark方法则输出汪汪
}


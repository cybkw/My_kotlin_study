package com.bkw.kotlin_study_1.course13
//解构
fun main(args: Array<String>) {
    val user = User(12, "bkw")
    val (age, name) = user

    println(age)
    println(name)

    val map1 = mapOf("key" to "bkw", "value" to "dad")

    for ((k, v) in map1) {
        println("$k-->$v")
    }
}
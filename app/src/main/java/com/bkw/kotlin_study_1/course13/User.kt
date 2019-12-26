package com.bkw.kotlin_study_1.course13

class User(var age: Int, var name: String) {
    operator fun component1() = age
    operator fun component2() = name
}
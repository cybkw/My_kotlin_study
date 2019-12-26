package com.bkw.kotlin_study_2


class User(var age: Int, var name: String) {
    operator fun component1() = age
    operator fun component2() = name
    operator fun component3() = name
}
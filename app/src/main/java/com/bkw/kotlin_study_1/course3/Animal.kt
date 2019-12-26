package com.bkw.kotlin_study_1.course3

open class Animal {
    open fun name() {
        println("animal")
    }

    fun printName(animal: Animal) {
        animal.name()
    }
}

fun main(args: Array<String>) {
    Dog().printName(Dog())
}
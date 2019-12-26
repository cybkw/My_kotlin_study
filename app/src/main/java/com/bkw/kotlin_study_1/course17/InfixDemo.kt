package com.bkw.kotlin_study_1.course17


/**
 * Created by ZhangTao on 18/7/6.
 */
sealed class CompareResult {
    object LESS : CompareResult() {
        override fun toString(): String {
            return "小于"
        }
    }

    object MORE : CompareResult() {
        override fun toString(): String {
            return "大于"
        }
    }

    object EQUAL : CompareResult() {
        override fun toString(): String {
            return "等于"
        }
    }
}

fun String.a(){

}

/**
 * 一个函数的名字如果前面有".",那么点前面的就代表这个函数的接收者,
 * 适用infix关键修饰函数则表示可以使用中缀表达式使用这个函数,
 *
 * */
infix fun Int.vs(num: Int): CompareResult =
        //this就是表示调用者,如:5
        if (this - num < 0) {
            CompareResult.LESS
        } else if (this - num > 0) {
            CompareResult.MORE
        } else {
            CompareResult.EQUAL
        }

infix fun Double.vs(num: Int): CompareResult =
        if (this - num < 0) {
            CompareResult.MORE
        } else if (this - num > 0) {
            CompareResult.LESS
        } else {
            CompareResult.EQUAL
        }

infix fun Long.vs(num: Int): CompareResult =
        if (this - num < 0) {
            CompareResult.MORE
        } else if (this - num > 0) {
            CompareResult.LESS
        } else {
            CompareResult.EQUAL
        }

fun main(args: Array<String>) {
    println(5.vs(6))

    println(5 vs 3)
    "s".a()
}
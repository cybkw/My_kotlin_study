package com.bkw.kotlin_study_1.course5

class Test5 {

}

/**
 * 这段代码表示：
 * 如果isDebug为true,就打印日志
 * */
inline fun onlyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}




fun main(args: Array<String>) {
//    onlyif(true) {
//        println("打印日志")
//    }

    /**
     *
     * 这段代码的意思，首先声明了一个runnable的对象。
     * 同时，声明了一个参数为空，返回值为Unit的函数对象function。
     * 然后将runnable对象的run方法赋值给了函数对象function。
     *
     * 并将这个函数作为参数传递给onlyif函数
     * */
    val runnable = Runnable {
        println("Runnable :: run")
    }
    //函数是“一等公民”，可以直接使用对象::方法名来引用一个函数声明，
    // 而不是直接对象.方法名的方式调用该方法
    val function: () -> Unit
    function=runnable::run

    onlyif(true,function)
}
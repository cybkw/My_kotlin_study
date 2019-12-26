package com.bkw.kotlin_study_1.course14

fun main(args: Array<String>) {
//    one()

    forarray();
}

//循环集合
fun forarray() {
    val list = arrayListOf<Int>(1, 2, 3,4, 5, 6, 7, 8)
//    for (i in list) {
//        println(i)
//    }

    for ((index, int) in list.withIndex()) {
        println("位置:$index,值:($int)")
    }
}


fun one() {
    //普通循环 输出:1到10
//    for (i in 1..10) {
//        println(i)
//    }

    //实质上就是将 ..进行拆解 ,输出1到9
    for (i in 1 until 10) {
        println(i)
    }

    //输出:从10到1 适用于递减操作
//    for (i in 10 downTo 1) {
//        println(i)
//    }

    //step后面的数字代表循环的步长,输出1,3,5,7,9
//    for (i in 1..10 step 3) {
//        println(i)
//    }


    //参数为数次,循环执行次数; it为当前执行次数,输出0到9
    repeat(10) {
        print(it)
    }
}
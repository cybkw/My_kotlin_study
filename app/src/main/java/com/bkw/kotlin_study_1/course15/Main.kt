package com.bkw.kotlin_study_1.course15

/**
 * 集合操作符
 * */
fun main(args: Array<String>) {

    val list = arrayListOf<Char>('a', 'b', 'c', 'd')

    //得到集合中的 'a'字符
    //map 转换操作符,这里将char类型转为了int类型, 返回的是两个值相减的unitcode码的差
    val a = list.map { it - 'a' }
            //filter 比较两个字符的unitcode相减的差是否大于0
            .filter { it > 0 }
            //find 表示如果大于1就返回值 ,返回第一个符号条件的值
            //findLast 则返回最后一个符号条件的值
            .find { it > 1 }

    println(a)


    caozuofu()

    myOperator();
}

fun myOperator() {

    val list = listOf(1, 2, 3, 4);
//    list.convert {
//        it + 1
//    }.forEach {
//        println(it)
//    }
}

//inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<T> {
//
//    val list = mutableListOf()
//    for (item in this) list.add(action(item))
//    return list
//}

fun caozuofu() {
    val strs = arrayOf("a", "b", "c", "d")
    val index = arrayOf(2, 3, 4, 1, 5, 8, 6, 7)

    index
            .filter {
                it < strs.size
            }
            .map {
                strs[it]
            }
            .reduce { s, s1 ->
                "$s$s1"
            }
            .also {
                println("密码是:$it");
            }
}


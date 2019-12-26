package com.bkw.kotlin_study_1.course7

class Test7 {


    //伴生对象，一定要写在一个类的内部。
    companion object {
        fun sayM() {
            println("xxx")
        }
    }
}


object D {
    @JvmStatic
    fun sayS() {

    }
}

/**
 * 使用伴生对象声明一个单例（推荐）
 * */
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance;
        }
    }

    private object Holder {
        val instance = Single();
    }
}

package com.bkw.kotlin_study_1.course16

data class User(var name: String)

fun main(args: Array<String>) {

    val user = User("bkw")

    //let与run都会返回闭包的执行结果,区别在于let有闭包参数,而run没有闭包参数
    val letResult = user.let { "let:${it.javaClass}" }
    println(letResult)

    val runResult = user.run { "run:${user.javaClass}" }
    println(runResult)

    //also和apply适用于链式调用,如:对user对象进行操作后再对变量赋值或者函数调用等.
    //also和apply都不返回闭包的执行结果,区别在于also有闭包参数,而apply没有闭包参数
    user.also {
        it
        println("also::${it.javaClass}")
    }
            .apply { }

    user.apply {
        println("apply::${this.javaClass}")
    }


    //适用于判断
    //takeIf的闭包返回一个判断结果,为false时,takeIf会返回空
    val any = (user.takeIf { it.name.length > 0 }?.also { println("takeIf,姓名为:${user.name}") }
            ?: println("姓名为空"))
    println("takeIf判断结果:$any")

    //takeUnless与takeIf刚好相反,闭包的判断结果,为true时函数会返回空
    user.takeUnless { user.name.isNotEmpty() }?.also { println("姓名为空") }
            ?: println("姓名为:${user.name}")

    //重复执行当前闭包
    repeat(5){
        println(user.name +",次数:"+it)
    }

    //适用场景,操作对象,修改对象
    //with比较特殊,不是一扩展方法的形式存在的,而是一个顶级函数
    with(user){
        this.name="cy"
    }
    println(user.name)
}
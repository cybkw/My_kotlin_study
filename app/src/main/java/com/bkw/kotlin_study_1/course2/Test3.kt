package com.bkw.kotlin_study_1.course2

class Test3 {


}


object child {
    @JvmField
    var name: String = "bkw"

    //只有类的命名对象和伴生对象中的成员才能用@JvmStatic
    @JvmStatic
    fun sayMsg() {
        println("我是kotlin的静态方法")
    }
}


fun main(args: Array<String>) {
    //在Kotlin中调用A类的方法
//    val a = A()
    //调用a类的putNumber只会打印基本数据类型，因为在kotlin中没有Integer这个类。
//    a.putNumber(123)

//    function1("")

    val age = 18
    val name = "bkw"

//    println("我叫%d,我今年%d岁",name,age)  //编译时出错
    println("我叫$name,今年$age" + "岁")  //正确
}


fun function1(str: String) {
    //第一个为String! String感叹号这个类型只有在kotlin调用java时候编译器自己推断声明的，不能手动声明
    //String!=""; 不能执行，非安全
    val fm1 = A.format(str)
    //不可变 ,运行这里会报错，因为我们传入的是空字符串，这个是不可为空
    val fm2: String = A.format(str)
    //可空的String类型。 空安全的，真正使用也安全
    val fm3: String? = A.format(str)
}


object Utils{
    @JvmStatic
    fun sayMsg(msg:String?){
        println("$msg")
    }
}
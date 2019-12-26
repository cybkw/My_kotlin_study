package com.bkw.kotlin_study_1_sample

val TITLE = "播放器标题"
val MESSAGE = "播放器消息"

class VIPPlayer(var title: String?, var message: String?) : PlayerView {

    init {
        title = title ?: TITLE
        message = message ?: MESSAGE
        println("主构造方法:"+title+","+message)
    }

    constructor() : this(TITLE, MESSAGE) {
        println("无参构造方法")
    }

    constructor(message: String?) : this(TITLE, MESSAGE) {
        println("一个参数的参构造方法")
    }

    override fun getPlayButton() {
        println("VIP button")
    }

    override fun showView() {
        println("显示会员定制播放器")
    }
}
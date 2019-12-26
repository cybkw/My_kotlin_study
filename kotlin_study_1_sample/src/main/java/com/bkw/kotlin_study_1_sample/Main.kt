package com.bkw.kotlin_study_1_sample

fun main(args: Array<String>) {
    val user = User(1, "bkw",PlayerViewType.VIP("VIP播放器","VIP"))
    PlayerUI.get().showPlayer(user)
}
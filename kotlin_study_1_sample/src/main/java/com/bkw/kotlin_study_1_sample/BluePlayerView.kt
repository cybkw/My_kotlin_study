package com.bkw.kotlin_study_1_sample

class BluePlayerView : PlayerView {
    override fun showView() {
        println("显示蓝色播放器")
    }

    override fun getPlayButton() {
        println("显示蓝色Button")
    }

}
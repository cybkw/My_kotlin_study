package com.bkw.kotlin_study_1_sample

interface PlayerView {
    fun getPlayButton()

    fun showView()
}

class GreenPlayerView : PlayerView {
    override fun getPlayButton() {
        println("显示绿色按钮")
    }

    override fun showView() {
        println("显示绿色播放器")
    }
}

class MediaPlayerView(playerView: PlayerView) : PlayerView by playerView


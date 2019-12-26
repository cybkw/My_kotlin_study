package com.bkw.kotlin_study_1.course6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bkw.kotlin_study_1.R

open class Main6Activity : AppCompatActivity(), View.OnClickListener {

    init {
        //init块用于初始化，比如在构造函数中执行一些语句
        println("构造函数初始化 init")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        findViewById<View>(R.id.tv_text).setOnClickListener(this)
    }

    override fun onClick(v: View?) {

    }
}


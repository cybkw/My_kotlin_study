package com.bkw.kotlin_study_1.course6

import android.support.v7.app.AppCompatActivity
import android.view.View

class Test6 {
}

/**
 * 如：Activity
 * 如果有父类 用冒号 :父类
 * */
open class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onClick(v: View?) {
    }
}
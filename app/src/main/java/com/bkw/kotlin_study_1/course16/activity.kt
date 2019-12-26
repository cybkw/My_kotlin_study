package com.bkw.kotlin_study_1.course16

import android.app.Activity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.TextView
import com.bkw.kotlin_study_1.R

class MyActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var tv1: TextView = TextView(this)
        var tv2:TextView =TextView(this);

        setTextView(tv1)
    }

    fun setTextView(textView: TextView){
        with(textView){
            textView.setText("我是with函数,统一设置text风格")
            textView.setTextColor(ContextCompat.getColor(context, R.color.abc_background_cache_hint_selector_material_dark))
        }
    }
}
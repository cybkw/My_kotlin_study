package com.bkw.kotlin_study_1.course6

import android.content.Context
import android.util.AttributeSet
import android.view.View

class TestView : View {
    constructor(context: Context) : super(context) {
        println("次级构造函数");
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        println("次级构造函数");
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        println("次级构造函数");
    }
}
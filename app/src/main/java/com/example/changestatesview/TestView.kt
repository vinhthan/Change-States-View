package com.example.changestatesview

import android.content.Context
import android.util.AttributeSet
import com.example.changestatesview.databinding.LayoutCustomBinding

class TestView(context: Context, attributeSet: AttributeSet): BaseCustomView<LayoutCustomBinding>(context, attributeSet) {
    override fun layoutRes(): Int = R.layout.layout_custom

    override fun initView() {

    }


}
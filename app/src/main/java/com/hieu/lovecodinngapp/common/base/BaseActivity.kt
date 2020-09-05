package com.hieu.lovecodinngapp.common.base

import android.app.Activity
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager

open class BaseActivity : Activity() {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm: InputMethodManager =
                getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }

}
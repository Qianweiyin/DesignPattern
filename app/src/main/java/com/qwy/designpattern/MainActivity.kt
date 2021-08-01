package com.qwy.designpattern

import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity


/**
 *
 * https://zhuanlan.zhihu.com/p/34625448
 *
 *
 */

//https://segmentfault.com/q/1010000002573504
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        var scrollView = findViewById<View>(R.id.scrollview) as ScrollView

        scrollView.viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {

            override fun onGlobalLayout() {
                // If the scrollView can scroll, disable the accept menu item button
                if (scrollView.canScrollVertically(1) || scrollView.canScrollVertically(-1)) {
                    println("11111111111111")
                } else {
                    println("2222222222222")

                }
                // Remove itself after onGlobalLayout is first called or else it would be called about a million times per second
                scrollView.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })
    }



}
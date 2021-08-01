package com.qwy.designpattern;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private ScrollView scrollView;
    private LinearLayout llPrice;
    private LinearLayout llPrice2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qian_linearlayout02);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        llPrice = (LinearLayout) findViewById(R.id.llPrice);
        llPrice2 = (LinearLayout) findViewById(R.id.llPrice2);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (scrollView.canScrollVertically(1) || scrollView.canScrollVertically(-1)) {
                    Log.e("Qwy", "canScroll ");
                    //可以滑动
                    llPrice.setVisibility(View.GONE);
                    llPrice2.setVisibility(View.VISIBLE);
                } else {
                    Log.e("Qwy", "not not ");
                    //不可以滑动
                    llPrice.setVisibility(View.VISIBLE);
                    llPrice2.setVisibility(View.GONE);

                }

                scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);

            }

        });
    }

}

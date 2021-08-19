package com.qwy.designpattern;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestActivity extends AppCompatActivity {

    private TextView detail3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qian_linearlayout02);
        detail3 = (TextView) findViewById(R.id.detail3);

//        String protocolTxt = "[url]用户协议[url]查看";
//        String protocolTxt = "用户协议用户协议查看";
//        String protocolTxt = "[url]用户协议用户协议查看";
        String protocolTxt = "查看[url]用户协议[url]";


        detail3.setText(makeSpannable(protocolTxt, "\\[url]"));

    }

    //    https://stackoverflow.com/questions/40006444/spannablestringbuilder-replace-content-with-regex
    public SpannableStringBuilder makeSpannable(String text, String regex) {

        StringBuffer sb = new StringBuffer();
        SpannableStringBuilder spannable = new SpannableStringBuilder();


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sb.setLength(0); // clear

            matcher.appendReplacement(sb, "");
            spannable.append(sb.toString());
            Log.e("Qwy", "sb.toString() 1  :" + sb.toString());

            // "[url]用户协议[url]查看"
//            int start = 0;
//            int end = sb.toString().length();


            //查看[url]用户协议[url]
            int start = spannable.length();
            int end = start + spannable.length();


            Log.e("Qwy", "spannable.length(): " + spannable.length());
            Log.e("Qwy", "sb.toString(): " + sb.toString());
            Log.e("Qwy", "start: " + start);
            Log.e("Qwy", "end: " + end);

            spannable.setSpan(new ForegroundColorSpan(Color.RED), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        }

        sb.setLength(0);
        matcher.appendTail(sb);
        Log.e("Qwy", "sb.toString() 2 :" + sb.toString());

        spannable.append(sb.toString());
        return spannable;
    }


}

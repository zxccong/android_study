package com.dynamicg.myapplication;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mTv4 = findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加下划线
        mTv4.getPaint().setAntiAlias(true);//去除锯齿

        TextView mTv5 = findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //添加下划线

        TextView mTv6 = findViewById(R.id.tv_6);
        //用HTML添加下划线
        mTv6.setText(Html.fromHtml("<u>How are you?</u>"));

    }
}

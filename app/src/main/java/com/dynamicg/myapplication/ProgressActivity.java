package com.dynamicg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.dynamicg.myapplication.util.ToastUtil;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar progressBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressBar3 = findViewById(R.id.pb3);
        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.sendEmptyMessage(0);
            }
        });

        Button btnProgressDialog1 = findViewById(R.id.btn_progress_dialog1);
        Button btnProgressDialog2 = findViewById(R.id.btn_progress_dialog2);
        btnProgressDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog1 = new ProgressDialog(ProgressActivity.this);
                progressDialog1.setTitle("提示");
                progressDialog1.setMessage("正在加载");
                progressDialog1.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        ToastUtil.showMsg(ProgressActivity.this,"cancel...");
                    }
                });
                progressDialog1.show();
            }
        });
        btnProgressDialog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog2 = new ProgressDialog(ProgressActivity.this);
                progressDialog2.setTitle("提示");
                progressDialog2.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog2.setMessage("正在下载...");
                progressDialog2.setButton(DialogInterface.BUTTON_POSITIVE, "可以", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                progressDialog2.show();
            }
        });

    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(progressBar3.getProgress() < 100){
//                progressBar3.setProgress(progressBar3.getProgress()+5);
                handler.postDelayed(runnable,500);
            }else{
                ToastUtil.showMsg(ProgressActivity.this,"加载完成!");
            }
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            progressBar3.setProgress(progressBar3.getProgress()+5);
            handler.sendEmptyMessage(0);
        }
    };
}

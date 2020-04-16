package com.dynamicg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        Button LoginBtn = findViewById(R.id.btn_login);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this,"登录成功!",Toast.LENGTH_SHORT).show();
            }
        });

        EditText EtUserName = findViewById(R.id.et_1);
        EtUserName.addTextChangedListener(new TextWatcher() {
            /*在文字改变前*/
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            /*在文字改变时（常用）*/
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext",s.toString());
            }
            /*文字改变当中*/
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

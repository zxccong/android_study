package com.dynamicg.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dynamicg.myapplication.fragment.ContainActivity;
import com.dynamicg.myapplication.gridview.GridViewActivity;
import com.dynamicg.myapplication.jump.AActivity;
import com.dynamicg.myapplication.listview.ListViewActivity;
import com.dynamicg.myapplication.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;

    private Button mBtnTextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转TextView演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnTextButton = findViewById(R.id.btn_button);
        mBtnTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转Button演示界面
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btnEditText = findViewById(R.id.btn_edittext);
        btnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到EditText界面
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

        Button btnRadioButton = findViewById(R.id.btn_radiobutton);
        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到RadioButton界面
                Intent intent = new Intent(MainActivity.this,RadioActivity.class);
                startActivity(intent);
            }
        });

        Button btnCheckBox = findViewById(R.id.btn_checkbox);
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到CheckBox界面
                Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        Button btnImageView = findViewById(R.id.btn_image_view);
        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到ImageView界面
                Intent intent = new Intent(MainActivity.this,ImageViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnListView = findViewById(R.id.btn_list_view);
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到ListView界面
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnGridView = findViewById(R.id.btn_grid_view);
        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到GridView界面
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnRecyclerView = findViewById(R.id.btn_recycler_view);
        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到RecyclerView界面
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnWebView = findViewById(R.id.btn_web_view);
        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到WebView界面
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        Button btnToast = findViewById(R.id.btn_toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Toast界面
                Intent intent = new Intent(MainActivity.this,ToastActivity.class);
                startActivity(intent);
            }
        });

        Button btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Dialog界面
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });

        Button btnProgress = findViewById(R.id.btn_progress);
        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Progress界面
                Intent intent = new Intent(MainActivity.this,ProgressActivity.class);
                startActivity(intent);
            }
        });

        Button btnCustomDialog = findViewById(R.id.btn_custom_dialog);
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到CustomDialog界面
                Intent intent = new Intent(MainActivity.this,CustomDialogActivity.class);
                startActivity(intent);
            }
        });

        Button btnPopUpWindow = findViewById(R.id.btn_pop_up_window);
        btnPopUpWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到PopUpWindow界面
                Intent intent = new Intent(MainActivity.this,PopUpWindowActivity.class);
                startActivity(intent);
            }
        });

        Button btnLifeCycle = findViewById(R.id.btn_lifecycle);
        btnLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到LifeCycle演示界面
                Intent intent = new Intent(MainActivity.this,LifeCycleActivity.class);
                startActivity(intent);
            }
        });

        Button btnJump = findViewById(R.id.btn_jump);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到LifeCycle演示界面
                Intent intent = new Intent(MainActivity.this, AActivity.class);
                startActivity(intent);
            }
        });

        Button btnFragment = findViewById(R.id.btn_fragment);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Fragment演示界面
                Intent intent = new Intent(MainActivity.this, ContainActivity.class);
                startActivity(intent);
            }
        });
    }

}

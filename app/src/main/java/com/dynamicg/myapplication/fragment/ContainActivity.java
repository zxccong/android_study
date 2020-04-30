package com.dynamicg.myapplication.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dynamicg.myapplication.R;

public class ContainActivity extends AppCompatActivity {

    private Fragment aFragment, bFragment;
    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contain);

        aFragment = new AFragment();
        aFragment = AFragment.newInsance("我是参数");
        getFragmentManager().beginTransaction().add(R.id.fl_container,aFragment).commitAllowingStateLoss();

        mBtnChange = findViewById(R.id.btn_change);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                getFragmentManager().beginTransaction().replace(R.id.fl_container,aFragment).commitAllowingStateLoss();
            }
        });
    }
}

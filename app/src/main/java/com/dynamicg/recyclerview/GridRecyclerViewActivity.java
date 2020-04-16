package com.dynamicg.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dynamicg.myapplication.R;

public class GridRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);
        RecyclerView RvGrid = findViewById(R.id.rv_grid);
        //一行展示3个Item
        RvGrid.setLayoutManager(new GridLayoutManager(GridRecyclerViewActivity.this,3));
        RvGrid.setAdapter(new GridAdapter(GridRecyclerViewActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void OnClick(int pos) {
                Toast.makeText(GridRecyclerViewActivity.this,"click..."+pos, Toast.LENGTH_SHORT).show();
            }
        }));
    }
}

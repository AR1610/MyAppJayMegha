package com.myappjaymegha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;
    String strLang[] = {"Android","Java",".net","PHP","C","C++","IOS","Python",
            "Android","Java",".net","PHP","C","C++","IOS","Python",
            "Android","Java",".net","PHP","C","C++","IOS","Python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.grid_view);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, R.layout.raw_grid,R.id.tv_data,strLang);

        gridView.setAdapter(arrayAdapter);

    }
}
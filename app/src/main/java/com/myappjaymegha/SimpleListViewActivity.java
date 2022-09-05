package com.myappjaymegha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListViewActivity extends AppCompatActivity {
ListView listView;
String strLang[] = {"Android","Java",".net","PHP","C","C++","IOS","Python",
        "Android","Java",".net","PHP","C","C++","IOS","Python",
        "Android","Java",".net","PHP","C","C++","IOS","Python"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang);
        listView.setAdapter(arrayAdapter);

    }
}
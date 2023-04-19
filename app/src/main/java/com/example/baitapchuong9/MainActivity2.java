package com.example.baitapchuong9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    private Spinner spCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spCategory=findViewById(R.id.spCategory);
        String arr[]=getResources().getStringArray(R.array.categorys);
        spCategory.setAdapter(new ArrayAdapter<String>(this,R.layout.item_spinner,arr));
    }
}
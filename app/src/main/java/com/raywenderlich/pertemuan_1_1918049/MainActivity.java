package com.raywenderlich.pertemuan_1_1918049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Biodata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Biodata(View view){
        Intent a = new Intent(MainActivity.this,
                Biodata.class);
        startActivity(a);
    }
}
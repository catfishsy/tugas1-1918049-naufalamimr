package com.raywenderlich.pertemuan_1_1918049;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        EditText alas = (EditText) findViewById(R.id.lay_alas);
        EditText tinggi = (EditText) findViewById(R.id.lay_tinggi);
        TextView hasil = (TextView) findViewById(R.id.layh_hasil);

        Button luas = (Button) findViewById(R.id.hitungluas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float a = tofloat(alas.getText().toString().trim());
                Float t = tofloat(tinggi.getText().toString().trim());

                hasil.setText("" + 0.5 *a*t);
            }
        });
    }

    private Float tofloat(String a){
        try {
            return Float.parseFloat(a);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
package com.raywenderlich.pertemuan_1_1918049;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        EditText nama = (EditText) findViewById(R.id.lay_nama);
        EditText nim = (EditText) findViewById(R.id.lay_nim);
        EditText jurusan = (EditText) findViewById(R.id.lay_jurusan);
        EditText angkatan = (EditText) findViewById(R.id.lay_angkatan);

        TextView nama_h = (TextView) findViewById(R.id.layh_nama);
        TextView nim_h = (TextView) findViewById(R.id.layh_nim);
        TextView jurusan_h = (TextView) findViewById(R.id.layh_jurusan);
        TextView angkatan_h = (TextView) findViewById(R.id.layh_angkatan);

        Button tampil = (Button) findViewById(R.id.tampilbiodata);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString().trim();
                String nim1 = nim.getText().toString().trim();
                String jurusan1 = jurusan.getText().toString().trim();
                String angkatan1 = angkatan.getText().toString().trim();

                nama_h.setText(nama1);
                nim_h.setText(nim1);
                jurusan_h.setText(jurusan1);
                angkatan_h.setText(angkatan1);
            }
        });
    }


}
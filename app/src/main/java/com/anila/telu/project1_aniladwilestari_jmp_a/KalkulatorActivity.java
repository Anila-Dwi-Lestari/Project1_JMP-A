package com.anila.telu.project1_aniladwilestari_jmp_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        getSupportActionBar().setTitle("Aplikasi Kalkulator");

        EditText etAngka1 = findViewById(R.id.et_angka1);
        EditText etAngka2 = findViewById(R.id.et_angka2);

        Button bTambah = findViewById(R.id.b_tambah);
        Button bKurang = findViewById(R.id.b_kurang);
        Button bKali = findViewById(R.id.b_kali);
        Button bBagi = findViewById(R.id.b_bagi);
        Button bClear = findViewById(R.id.b_clear);

        TextView tvHasil = findViewById(R.id.tv_hasil);

        bTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    //Ambil Edit Teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //Lakukan Operasi
                    double hasil = angka1 + angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    //Ambil Edit Teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //Lakukan Operasi
                    double hasil = angka1 - angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    //Ambil Edit Teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //Lakukan Operasi
                    double hasil = angka1 * angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    //Ambil Edit Teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //Lakukan Operasi
                    double hasil = angka1 / angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAngka1.setText("");
                etAngka2.setText("");
                tvHasil.setText("");
            }
        });
    }
}
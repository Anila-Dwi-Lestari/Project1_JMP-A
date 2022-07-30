package com.anila.telu.project1_aniladwilestari_jmp_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        getSupportActionBar().setTitle("Aplikasi Mobile");

        EditText etNama = findViewById(R.id.et_nama);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                Toast.makeText(NamaActivity.this, "Annyeong, " + nama, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

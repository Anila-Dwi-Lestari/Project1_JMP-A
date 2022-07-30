package com.anila.telu.project1_aniladwilestari_jmp_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class NegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        getSupportActionBar().setTitle("Aplikasi List View");

        String[] negara = getResources().getStringArray(R.array.daftar_negara);

        ListView lvNegara = findViewById(R.id.lv_negara);
        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NegaraActivity.this, "Clicked "+negara[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
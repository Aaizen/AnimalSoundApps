package com.plankton.animalsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beranda extends AppCompatActivity {
    private Button btn_peliharaan, btn_buas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btn_peliharaan = findViewById(R.id.peliharaan);
        btn_peliharaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(beranda.this, MainActivity.class);
                startActivity(is);


        btn_buas = findViewById(R.id.buass);
        btn_buas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ib = new Intent(beranda.this, buas.class);
                startActivity(ib);
            }
        });
            }
        });
    }
}

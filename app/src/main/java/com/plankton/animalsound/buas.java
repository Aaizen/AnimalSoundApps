package com.plankton.animalsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buas extends AppCompatActivity {
    MediaPlayer playerberuang, playergajah, playersinga, playermacan, playerular, playerserigala;

    Button beruang, gajah, singa, macan, ular, serigala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buas);

        playerberuang = MediaPlayer.create(this, R.raw.bear);
        playergajah = MediaPlayer.create(this, R.raw.gajahaha);
        playersinga =  MediaPlayer.create(this, R.raw.lion);
        playermacan = MediaPlayer.create(this, R.raw.macann);
        playerular = MediaPlayer.create(this, R.raw.snakehiss);
        playerserigala= MediaPlayer.create(this, R.raw.wolf6);

        beruang = findViewById(R.id.but_beruang);
        gajah = findViewById(R.id.but_gajah);
        singa = findViewById(R.id.but_singa);
        macan = findViewById(R.id.but_macan);
        ular = findViewById(R.id.but_ular);
        serigala = findViewById(R.id.but_serigala);

        beruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerberuang.start();
            }
        });
        gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playergajah.start();
            }
        });
        singa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playersinga.start();
            }
        });
        macan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playermacan.start();
            }
        });
        ular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerular.start();
            }
        });
        serigala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerserigala.start();
            }
        });
    }
}

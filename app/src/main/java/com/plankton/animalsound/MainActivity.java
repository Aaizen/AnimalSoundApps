package com.plankton.animalsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer playerkucing, playersapi, playeranjing, playerkatak, playerayam, playermonyet;

    Button kucing, sapi, anjing, katak, ayam, monyet;
    private  Button aktiv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playerkucing = MediaPlayer.create(this, R.raw.cat);
        playersapi = MediaPlayer.create(this, R.raw.cow);
        playeranjing = MediaPlayer.create(this, R.raw.dog3);
        playerkatak = MediaPlayer.create(this, R.raw.frog);
        playerayam = MediaPlayer.create(this, R.raw.ayam);
        playermonyet = MediaPlayer.create(this, R.raw.monkey2);

        kucing = findViewById(R.id.but_kucing);
        sapi = findViewById(R.id.but_sapi);
        anjing = findViewById(R.id.but_anjing);
        katak = findViewById(R.id.but_katak);
        ayam = findViewById(R.id.but_ayam);
        monyet = findViewById(R.id.but_monyet);

        aktiv2 = findViewById(R.id.btn_next);

        kucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerkucing.start();
                }
        });
        sapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playersapi.start();
            }
        });
        anjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeranjing.start();
            }
        });
        katak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerkatak.start();
            }
        });
        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerayam.start();
            }
        });
        monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playermonyet.start();
            }
        });

        aktiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(is);
            }
        });
    }
}

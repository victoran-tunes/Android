package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnJogar,btnSair,btnCreditos;
    public static MediaPlayer mp,mp2,gameover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mp = MediaPlayer.create(this,R.raw.inicial);
        mp2 = MediaPlayer.create(this,R.raw.principal);
        gameover = MediaPlayer.create(this,R.raw.gameover);
        mp.start();
        btnSair = findViewById(R.id.btnSair);
        btnCreditos = findViewById(R.id.btnCreditos);
        btnJogar = findViewById(R.id.btnJogar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirT2();
            }//void onClick
        });//Click Listener

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sair();
            }//void onClick
        });//Click Listener

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                creditos();
            }//void onClick
        });//Click Listener
    }//OnCreate

    private void abrirT2(){
        Intent janela = new Intent(this, Tela2.class);
        startActivity(janela);
        mp.stop();
    }//abrirT1

    private void sair(){
        finishAffinity();
        mp.stop();
        mp2.stop();
    }

    private void creditos(){
        Intent janela = new Intent(this, Creditos.class);
        startActivity(janela);
    }


}//MAIN
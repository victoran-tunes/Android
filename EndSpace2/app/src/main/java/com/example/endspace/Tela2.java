package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.Sedna.Sedna;

public class Tela2 extends AppCompatActivity {
    Button btnEris,btnSedna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        getSupportActionBar().hide();
        MainActivity.mp2.start();
        btnEris = findViewById(R.id.btneris);
        btnSedna = findViewById(R.id.btnSedna);

        btnEris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirEris();
                finish();
            }//void onClick
        });//OnclickListener

        btnSedna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirSedna();
            finish();
            }//void onClick
        });//OnclickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirEris(){
        Intent janela = new Intent(this, Eris.class);
        startActivity(janela);
    }

    public void abrirSedna(){
        Intent janela = new Intent(this, Sedna.class);
        startActivity(janela);
    }
}
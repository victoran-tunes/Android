package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.R;

public class Sedna extends AppCompatActivity {
    Button btnCoordenada1, btnCoordenada2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedna);
        getSupportActionBar().hide();

        btnCoordenada1 = findViewById(R.id.btnCoordenada1);
        btnCoordenada2 = findViewById(R.id.btnCoordenada2);

        btnCoordenada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirCoordenada1();
            finish();
            }//void onClick
        });//onClickListener

        btnCoordenada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirCoordenada2();
            finish();
            }//void onClick
        });//onClickListener


    }//onCreate
    public void abrirCoordenada1(){
        Intent janela = new Intent(this, CoordenadaUm.class);
        startActivity(janela);
    }

    public void abrirCoordenada2(){
        Intent janela = new Intent(this, CoordenadaDois.class);
        startActivity(janela);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }
}//class
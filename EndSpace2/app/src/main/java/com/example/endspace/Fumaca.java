package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fumaca extends AppCompatActivity {
    Button btnApito,btnRSangue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fumaca);
        getSupportActionBar().hide();



        btnApito = findViewById(R.id.btnApito);
        btnRSangue = findViewById(R.id.btnRSangue);

        btnApito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirApito();
                finish();
            }//void onClick
        });//onClickListener


        btnRSangue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSangue();
                finish();
            }//void onClick
        });//onClickListener



    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }



    public void abrirApito(){
        Intent janela = new Intent(this, Apito.class);
        startActivity(janela);
    }


    public void abrirSangue(){
        Intent janela = new Intent(this, Sangue.class);
        startActivity(janela);
    }
}

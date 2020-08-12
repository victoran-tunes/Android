package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sangue extends AppCompatActivity {
    Button btnFumaca,btnNave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangue);
        getSupportActionBar().hide();



        btnFumaca = findViewById(R.id.btnFumaca);
        btnNave = findViewById(R.id.btnNave);

        btnFumaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirFumaça();
                finish();
            }//void onClick
        });//onClickListener


        btnNave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirNave();
            finish();
            }//void onClick
        });//onClickListener



    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }



    public void abrirFumaça(){
        Intent janela = new Intent(this, Fumaca.class);
        startActivity(janela);
    }


    public void abrirNave(){
        Intent janela = new Intent(this, Tela2.class);
        startActivity(janela);
    }


}//class
package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Eris extends AppCompatActivity {
    Button btnFumaca,btnsangue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eris);
        getSupportActionBar().hide();

        btnFumaca = findViewById(R.id.btnFumaca);
        btnsangue = findViewById(R.id.btnsangue);

        btnFumaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirFumaca();
                finish();
            }
        });

        btnsangue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirsangue();
                finish();
            }
        });


    }//on create


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirFumaca(){
        Intent janela = new Intent(this, Fumaca.class);
        startActivity(janela);
    }

    public void abrirsangue(){
        Intent janela = new Intent(this, Sangue.class);
        startActivity(janela);
    }


}//main
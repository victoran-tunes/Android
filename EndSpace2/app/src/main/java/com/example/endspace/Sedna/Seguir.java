package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.Eris;
import com.example.endspace.R;
import com.example.endspace.Tela2;

public class Seguir extends AppCompatActivity {
    Button btnLevarMsg,btnNlevarMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguir);
        getSupportActionBar().hide();

        btnLevarMsg = findViewById(R.id.btnLevarMsg);
        btnNlevarMsg = findViewById(R.id.btnNlevarMsg);

        btnLevarMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirLevarMsg();
                finish();
            }//void onClick
        });//OnclickListener

        btnNlevarMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirNLevarMsg();
                finish();
            }//void onClick
        });//OnclickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirLevarMsg(){
        Intent janela = new Intent(this, LevarMsg.class);
        startActivity(janela);
    }

    public void abrirNLevarMsg(){
        Intent janela = new Intent(this, Eris.class);
        startActivity(janela);
    }

}
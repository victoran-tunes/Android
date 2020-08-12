package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.R;
import com.example.endspace.Tela2;

public class NSeguir extends AppCompatActivity {
    Button btnConversar,btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_seguir);
        getSupportActionBar().hide();

        btnConversar = findViewById(R.id.btnConversar);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnConversar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirConversa();
                finish();
            }//void onClick
        });//OnclickListener

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirVoltar();
                finish();
            }//void onClick
        });//OnclickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirConversa(){
        Intent janela = new Intent(this, Conversa.class);
        startActivity(janela);
    }

    public void abrirVoltar(){
        Intent janela = new Intent(this, Seguir.class);
        startActivity(janela);
    }

}
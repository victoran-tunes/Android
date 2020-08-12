package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.R;

public class CoordenadaUm extends AppCompatActivity {
    Button btnSeguir,btnNSeguir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenada_um);
        getSupportActionBar().hide();

        btnSeguir = findViewById(R.id.btnSeguir);
        btnNSeguir = findViewById(R.id.btnNSeguir);

        btnSeguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirSeguir();
            finish();
            }//void onClick
        });//onClickListener

        btnNSeguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrirNSeguir();
            finish();
            }
        });
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirSeguir(){
        Intent janela = new Intent(this, Seguir.class);
        startActivity(janela);
    }

    public void abrirNSeguir(){
        Intent janela = new Intent(this, NSeguir.class);
        startActivity(janela);
    }

}//class
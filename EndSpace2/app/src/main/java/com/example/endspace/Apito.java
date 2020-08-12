package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Apito extends AppCompatActivity {
    Button btnDiario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apito);
        getSupportActionBar().hide();



        btnDiario = findViewById(R.id.btnDiario);

        btnDiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDiario();
                finish();
            }//void onClick
        });//onClick Listener

    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirDiario(){
        Intent janela = new Intent(this, Diario.class);
        startActivity(janela);
    }
}//Class
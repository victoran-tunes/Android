package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.R;

public class CoordenadaDois extends AppCompatActivity {
    Button btnConversa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenada_dois);
        getSupportActionBar().hide();

        btnConversa = findViewById(R.id.btnConversa);
        btnConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirConversar();
                finish();
            }//void onClick
        });//onClickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }
    public void abrirConversar(){
        Intent janela = new Intent(this, Conversa.class);
        startActivity(janela);
    }
}//Class
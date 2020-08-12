package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.R;

public class Conversa extends AppCompatActivity {
    Button btnEquipamento,btnSemEquipamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);
        getSupportActionBar().hide();

        btnEquipamento = findViewById(R.id.btnEquipamento);
        btnSemEquipamento = findViewById(R.id.btnSemEquipamento);

        btnEquipamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirEquipamento();
                finish();
            }//void onClick
        });//OnclickListener

        btnSemEquipamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSemEquipamento();
                finish();
            }//void onClick
        });//OnclickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }

    public void abrirEquipamento(){
        Intent janela = new Intent(this, Equipamento.class);
        startActivity(janela);
    }

    public void abrirSemEquipamento(){
        Intent janela = new Intent(this, SemEquipamento.class);
        startActivity(janela);
    }

}
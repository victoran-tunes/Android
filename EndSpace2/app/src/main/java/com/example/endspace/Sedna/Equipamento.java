package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.MainActivity;
import com.example.endspace.R;

public class Equipamento extends AppCompatActivity {
    Button btnReiniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipamento);
        MainActivity.gameover.start();
        MainActivity.mp2.stop();
        getSupportActionBar().hide();

        btnReiniciar = findViewById(R.id.btnReiniciar);


        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirReiniciar();
                finish();
            }//void onClick
        });//OnclickListener
    }//onCreate

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }



    public void abrirReiniciar(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        MainActivity.gameover.stop();
    }

}
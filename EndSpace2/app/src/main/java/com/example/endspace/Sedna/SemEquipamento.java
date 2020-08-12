package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.MainActivity;
import com.example.endspace.R;

public class SemEquipamento extends AppCompatActivity {
    Button btnResett;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_equipamento);
        getSupportActionBar().hide();
        btnResett = findViewById(R.id.btnResett);
        MainActivity.gameover.start();
        MainActivity.mp2.stop();
        btnResett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirReiniciar();
                finish();
                MainActivity.gameover.stop();
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

    }

}
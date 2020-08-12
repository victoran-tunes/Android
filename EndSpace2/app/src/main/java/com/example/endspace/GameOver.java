package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameOver extends AppCompatActivity {
    Button btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        MainActivity.gameover.start();
        getSupportActionBar().hide();
        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              main();
              finish();
              MainActivity.gameover.stop();
            }//void onClick
        });//onClickListener
    }//onCreate

    public void main(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        MainActivity.mp2.stop();

    }//void main

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }
}//Class
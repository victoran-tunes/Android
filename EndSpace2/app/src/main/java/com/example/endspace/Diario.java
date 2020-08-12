package com.example.endspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Diario extends AppCompatActivity {
    Button btnFugir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);
        getSupportActionBar().hide();



        btnFugir = findViewById(R.id.btnFugir);

        btnFugir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameover();
                finish();
            }//void onClick
        });//onClickListener
    }//onCreate

    public void gameover(){
        Intent janela = new Intent(this, GameOver.class);
        MainActivity.mp2.stop();
        startActivity(janela);
    }//void gameover

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }
}//Class
package com.example.endspace.Sedna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.endspace.MainActivity;
import com.example.endspace.R;
import com.example.endspace.Tela2;

public class LevarMsg extends AppCompatActivity {
        Button btnreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levar_msg);
        getSupportActionBar().hide();
        MainActivity.mp2.stop();
        btnreset = findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Main();
            finish();
            }//void onClick
        });//onClickListener
    }//onCreate
    private void Main(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);

    }//abrirT2
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Se você não volta no tempo, não pode voltar no jogo também", Toast.LENGTH_SHORT).show();
    }
}//Class
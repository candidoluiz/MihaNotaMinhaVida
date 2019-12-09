package com.example.minhanota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnProximo;
    EditText ra;
    EditText nome;
    String txtRa;
    String txtAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProximo = findViewById(R.id.btn_proximo);
        ra =findViewById(R.id.txt_ra);
        nome = findViewById(R.id.txt_aluno);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proximo();
            }
        });
    }

    private void proximo() {
        txtAluno = nome.getText().toString();
        txtRa = ra.getText().toString();

        if (!txtRa.trim().equals("") && !txtAluno.trim().equals("")){
            Intent intent = new Intent(this, CursosActivity.class);
            intent.putExtra("ra", txtRa);
            intent.putExtra("aluno", txtAluno);
            startActivity(intent);
        }


    }


}

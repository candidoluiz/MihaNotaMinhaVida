package com.example.minhanota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CursosActivity extends AppCompatActivity {

    Button btnCursoProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        btnCursoProximo = findViewById(R.id.curso_btn_proximo);

        btnCursoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proximo();
            }
        });
    }

    private void proximo() {

        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }
}

package com.example.minhanota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    EditText telefone;
    Button ligar;
    String numTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        telefone = findViewById(R.id.form_txt_numero);
        ligar = findViewById(R.id.form_btn_ligar);

        ligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ligar();
            }
        });

    }

    private void ligar() {
        numTelefone = telefone.getText().toString();
        if (numTelefone!=null)
        {
            Uri uri = Uri.parse("tel:"+numTelefone);
            Intent intent = new Intent(Intent.ACTION_DIAL,uri);

            startActivity(intent);
        }
    }
}

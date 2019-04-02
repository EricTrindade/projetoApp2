package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio11 extends AppCompatActivity {

    private EditText nome, conta;
    private TextView tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio11);

        tela=findViewById(R.id.tela);
        nome=findViewById(R.id.nome);
        conta=findViewById(R.id.conta);

    }

    public void calcularConta (View et){

    }
}

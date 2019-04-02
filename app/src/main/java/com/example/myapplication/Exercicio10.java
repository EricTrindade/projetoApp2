package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio10 extends AppCompatActivity {

    private EditText idade;
    private TextView tela;
    double opcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio10);

        tela=findViewById(R.id.tela);
        idade=findViewById(R.id.idade);

    }
    public void verificacao (View et){
        opcao=Double.parseDouble(idade.getText().toString());

        if(opcao < 5) {
            tela.setText("Idade sem categoria");
        }
        if(opcao >= 5 && opcao <= 7){
            tela.setText("Infantil A");
        }if(opcao >= 8 && opcao <= 10){
            tela.setText("Infantil B");
        }if(opcao >= 11 && opcao <= 13){
            tela.setText("Juvenil A");
        }if(opcao >= 14 && opcao <= 17){
            tela.setText("Juvenil B");
        }else if(opcao >= 18){
            tela.setText("Sênior");
        }

    }
}

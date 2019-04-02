package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Exercicio11 extends AppCompatActivity {

    private EditText nome, conta;
    private TextView tela;
    String teste;
    double mult,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio11);

        tela=findViewById(R.id.tela);
        nome=findViewById(R.id.nome);
        conta=findViewById(R.id.conta);

    }

    public void calcularConta (View et){
    teste=nome.getText().toString();
    mult=Double.parseDouble(conta.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");

    if (teste.startsWith("a")||teste.startsWith("e")||teste.startsWith("i")||teste.startsWith("o")||teste.startsWith("u")){
        res=mult-(mult*0.3);
        tela.setText("Total a pagar: "+d.format(res));
    }else{
        tela.setText("Que pena! Nesta semana o desconto não é para seu nome, mas continue nos prestigiando que sua vez chegará.");
    }
    }
}

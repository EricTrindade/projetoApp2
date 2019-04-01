package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Exercicio9 extends AppCompatActivity {

    private EditText nome, av1, av2;
    private TextView tela;
    double media,n1,n2;
    String aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio9);

        tela=findViewById(R.id.tela);
        nome=findViewById(R.id.nome);
        av1=findViewById(R.id.av1);
        av2=findViewById(R.id.av2);
    }

    public void calcularMedia(View et){
        n1=Double.parseDouble(av1.getText().toString());
        n2=Double.parseDouble(av2.getText().toString());
        aluno=nome.getText().toString();
        media=(n1+n2)/2;

        DecimalFormat d = new DecimalFormat("0.00");

        if (media >= 7){
            tela.setText("O aluno "+aluno+" esta aprovado! com a media "+d.format(media));
        }if(media < 4){
            tela.setText("O aluno "+aluno+" esta reprovado! com a media "+d.format(media));
        }else if(media > 4 && media < 7){
            tela.setText("O aluno "+aluno+" esta de prova final! com a media "+d.format(media));
        }
    }
}

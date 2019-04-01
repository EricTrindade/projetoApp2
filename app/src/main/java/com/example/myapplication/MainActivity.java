package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText valorX;
    private TextView tela;
    double x;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorX=findViewById(R.id.valorX);
        tela=findViewById(R.id.tela);

    }
    public void calcularX(View et){
        x=Double.parseDouble(valorX.getText().toString());
        resultado= 8/(2-x);
        DecimalFormat d = new DecimalFormat("00.00");


        tela.setText("valor de Y: "+d.format(resultado));
    }

}

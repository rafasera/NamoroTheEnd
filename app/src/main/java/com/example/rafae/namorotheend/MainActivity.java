package com.example.rafae.namorotheend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // foi instanciado o metodo da classe Frases para trazer o nome das frases
    Frases minhaFrase = new Frases();

    public void alteraFrase(View view){

        // Random com limitador a partir da classe intanciada
        int numero = new Random().nextInt(minhaFrase.frase.length);

        // apresenta a frase
        TextView suaFrase = findViewById(R.id.txtFrase);
        suaFrase.setText(minhaFrase.frase[numero]);
    }


}

package com.example.rafae.namorotheend;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // foi instanciado o metodo da classe Frases para trazer o valor das frases
    Frases minhaFrase = new Frases();
    public String recebeFrase;

    public void alteraFrase(View view) {

        // Random com limitador a partir da classe intanciada
        int numero = new Random().nextInt(minhaFrase.frase.length);

        // apresenta a frase
        TextView suaFrase = (TextView) findViewById(R.id.txtFrase);
        suaFrase.setText(minhaFrase.frase[numero]);
        recebeFrase = (String) suaFrase.getText();
    }

    // Bloco para copiar a frase carregada.

    private void copyFrase() {
        // Gets a handle to the clipboard service.
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);

        // Criar um novo clip text que recebe o valor do clipboard
        ClipData clipData = ClipData.newPlainText("",recebeFrase);
        // Passa para o serviço de clipboard
        clipboard.setPrimaryClip(clipData);
        // Mensagem que indica que o texto foi copiado
        Toast.makeText(this, "Essa frase foi copiada: " + recebeFrase, Toast.LENGTH_LONG).show();

    }

    public void fraseCopiar(View view){
        copyFrase();

    }


}

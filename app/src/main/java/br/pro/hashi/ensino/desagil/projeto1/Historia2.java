package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Historia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia2);

        TextView textMorse = findViewById(R.id.text_morse);
        TextView texttraduc = findViewById(R.id.text_traduc);
        Button buttonwrite = findViewById(R.id.button_write);
        Button buttonbar = findViewById(R.id.button_bar);
        Button buttonspace = findViewById(R.id.button_space);
        Button buttondel = findViewById(R.id.button_delete);
        Translator tradutor = new Translator();
        StringBuilder sb = new StringBuilder();

        buttonwrite.setOnClickListener((view) -> {
            textMorse.append(".");
        });

        buttonwrite.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textMorse.append("-");
                return true;
            }
        });

        buttonspace.setOnClickListener((view) -> {
            sb.append(tradutor.morseToChar(textMorse.getText().toString()));
            texttraduc.setText(sb.toString());
            textMorse.setText("");
        });

        buttonbar.setOnClickListener((view) -> {
            sb.append(" ");
            texttraduc.setText(sb.toString());
        });

        buttondel.setOnClickListener((view) -> {
            if (textMorse.getText().toString().isEmpty()) {
                textMorse.setText("");
            } else {
                textMorse.setText(textMorse.getText().toString().substring(0, textMorse.length() - 1));
            }
        });

        buttondel.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                sb.delete(0,sb.length());
                texttraduc.setText(sb.toString());
                return true;
            }
        });
    }

}

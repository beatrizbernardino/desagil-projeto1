package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private void startHistoria1Activity(){
        Intent intent = new Intent(this, Historia1.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonExample1 = findViewById(R.id.button_example1);
        Button buttonExample2 = findViewById(R.id.button_example2);
        Button buttonExample3 = findViewById(R.id.button_example3);



        buttonExample1.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PreHistoria1.class);
            startActivity(intent);
            onPause();
        });

        buttonExample2.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, Historia2.class);
            startActivity(intent);
            onPause();
        });

        buttonExample3.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PreDict.class);
            startActivity(intent);
            onPause();
        });


    }
}

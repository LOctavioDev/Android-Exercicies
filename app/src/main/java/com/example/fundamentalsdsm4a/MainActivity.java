package com.example.fundamentalsdsm4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etValor1;
    private EditText etValor2;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValor1 = findViewById(R.id.etValor1);
        etValor2 = findViewById(R.id.etValor2);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1, n2, res;
                n1 = Integer.parseInt(etValor1.getText().toString());
                n2 = Integer.parseInt(etValor2.getText().toString());
                res = n1 + n2;
                Toast.makeText(MainActivity.this, "Resultado: " + res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
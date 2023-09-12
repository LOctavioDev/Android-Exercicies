package com.example.fundamentalsdsm4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etValo1;
    private EditText etValo2;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValo1 = findViewById(R.id.etValo1);
        etValo2 = findViewById(R.id.etValo2);
        btnAdd.setOnclickListener(new onCreatePanelView().OnClickListener){
            @Override
                    publi
        }
    }
}
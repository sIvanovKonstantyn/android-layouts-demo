package com.example.layoutapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView memView = findViewById(R.id.textMemView);
        TextView resultView = findViewById(R.id.textResultView);

        findViewById(R.id.buttonAdd).setOnClickListener(
                v -> memView.setText(addToStringsAsDigits("1", memView.getText().toString()))
        );

        findViewById(R.id.buttonMinus).setOnClickListener(
                v -> memView.setText(addToStringsAsDigits("-1", memView.getText().toString()))
        );

        findViewById(R.id.buttonAddToResult).setOnClickListener(
                v -> {
                    resultView.setText(
                            addToStringsAsDigits(
                                    resultView.getText().toString(),
                                    memView.getText().toString())
                    );

                    memView.setText("0");
                }
        );
    }

    private String addToStringsAsDigits(String s1, String s2) {
        return String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}
package com.example.imagica;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InstructActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruct);

        TextView instructionTextView = findViewById(R.id.instruction_text);
        instructionTextView.setText(getResources().getString(R.string.instruction));

        instructionTextView.setMovementMethod(new ScrollingMovementMethod());

    }
}

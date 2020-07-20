package com.example.imagica;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playbutton;
        playbutton= (Button) findViewById(R.id.playbutton);
        Button instruction;
        instruction= (Button) findViewById(R.id.instructbutton);
        Button exitbutton;
        exitbutton= (Button) findViewById(R.id.exitbutton);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(".PlayActivity");
                startActivity(intent);
            }
        });
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instructionIntent = new Intent(getApplicationContext(),InstructActivity.class);
                startActivity(instructionIntent);
            }
        });
        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });
    }

    }


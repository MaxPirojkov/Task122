package com.example.pirozhkov12;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result = findViewById(R.id.textView);
        final String currentResult;
        final String resultLast;
        final Intent intent = new Intent(this, MainActivity.class);

        Button butRight = findViewById(R.id.button2);
        butRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                result.append("http://wwww.myfiles.org/"+Integer.toString(new Random().nextInt(100) + 1));
            }
        });

        Button butLeft = findViewById(R.id.button);
        butLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        }


    }


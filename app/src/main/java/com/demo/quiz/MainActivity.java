package com.demo.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =  findViewById(R.id.editText);

        findViewById(R.id.btn_start).setOnClickListener(view -> {

            if (editText.getText().toString().trim().length()==0){
                Toast.makeText(MainActivity.this,"Please enter your name",Toast.LENGTH_SHORT).show();
                return;
            }

            UserUtil.getUser().setName(editText.getText().toString().trim());

            startActivity(new Intent(MainActivity.this, Question1Activity.class));
        });
    }
}
package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionFinishActivity extends AppCompatActivity {

    protected Button btn_new_quiz, btn_finish;

    protected TextView tv_score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_finish);

        btn_new_quiz = findViewById(R.id.btn_new_quiz);
        btn_finish = findViewById(R.id.btn_finish);
        tv_score = findViewById(R.id.tv_score);

        TextView tv_welcome = findViewById(R.id.tv_welcome);
        tv_welcome.setText("Congratulations " + UserUtil.getUser().getName() + "!");

        tv_score.setText(UserUtil.getUser().getScore() + "/5");

        btn_new_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserUtil.position++;

                startActivity(new Intent(QuestionFinishActivity.this, Question1Activity.class));
                finish();
            }
        });
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
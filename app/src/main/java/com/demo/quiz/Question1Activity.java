package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;


public class Question1Activity extends QuestionBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_process.setText("1/5");
        progress.setProgress(20);

        UserUtil.getUser().setScore(0);
    }

    @Override
    protected Question getQuestion() {
        return UserUtil.getQuestion(0);
    }

    @Override
    protected void next() {

        startActivity(new Intent(Question1Activity.this, Question2Activity.class));
        finish();
    }
}
package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;

public class Question3Activity extends QuestionBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_process.setText("3/5");
        progress.setProgress(60);

    }

    @Override
    protected Question getQuestion() {
        return UserUtil.getQuestion(2);
    }

    @Override
    protected void next() {
        startActivity(new Intent(Question3Activity.this, Question4Activity.class));
        finish();
    }

}
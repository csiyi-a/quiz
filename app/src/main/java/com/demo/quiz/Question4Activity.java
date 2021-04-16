package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;

public class Question4Activity extends QuestionBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_process.setText("4/5");
        progress.setProgress(80);

    }

    @Override
    protected Question getQuestion() {
        return UserUtil.getQuestion(3);
    }

    @Override
    protected void next() {
        startActivity(new Intent(Question4Activity.this, Question5Activity.class));
        finish();
    }

}
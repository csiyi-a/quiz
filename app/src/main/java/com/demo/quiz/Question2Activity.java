package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Question2Activity extends QuestionBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_process.setText("2/5");
        progress.setProgress(40);

    }

    @Override
    protected Question getQuestion() {
        return UserUtil.getQuestion(1);
    }

    @Override
    protected void next() {
        startActivity(new Intent(Question2Activity.this, Question3Activity.class));
        finish();
    }

}
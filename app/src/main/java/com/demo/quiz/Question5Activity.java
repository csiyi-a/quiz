package com.demo.quiz;

import android.content.Intent;
import android.os.Bundle;

public class Question5Activity extends QuestionBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_process.setText("5/5");
        progress.setProgress(100);

    }

    @Override
    protected Question getQuestion() {
        return UserUtil.getQuestion(4);
    }

    @Override
    protected void next() {
        startActivity(new Intent(Question5Activity.this,QuestionFinishActivity.class));
        finish();
    }

}
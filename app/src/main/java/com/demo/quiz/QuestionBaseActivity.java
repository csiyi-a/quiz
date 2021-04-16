package com.demo.quiz;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract class QuestionBaseActivity extends AppCompatActivity {

    protected Button btn_answer_1, btn_answer_2, btn_answer_3, btn_submit;
    protected int userAnswer;// 用户选择
    protected int answer;// 正常答案
    protected boolean hasSubmit;
    protected TextView tv_process;
    protected TextView tv_question_desc;
    protected ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_base);

        progress = findViewById(R.id.progress);
        tv_process = findViewById(R.id.tv_process);
        tv_question_desc = findViewById(R.id.tv_question_desc);

        btn_answer_1 = findViewById(R.id.btn_answer_1);
        btn_answer_2 = findViewById(R.id.btn_answer_2);
        btn_answer_3 = findViewById(R.id.btn_answer_3);
        btn_submit = findViewById(R.id.btn_submit);

        TextView tv_welcome = findViewById(R.id.tv_welcome);
        tv_welcome.setText("Welcome " + UserUtil.getUser().getName() + "!");

        btn_answer_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select(0);
            }
        });
        btn_answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select(1);
            }
        });
        btn_answer_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select(2);
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });


        Question question = getQuestion();

        tv_question_desc.setText(question.getTitle());


        btn_answer_1.setText(question.getAnswer1());
        btn_answer_2.setText(question.getAnswer2());
        btn_answer_3.setText(question.getAnswer3());

        answer = question.getAnswerPosition();

    }

    private void select(int position) {

        userAnswer = position;

        if (position == 0) {
            btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn));
        } else {
            btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }

        if (position == 1) {
            btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn));
        } else {
            btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }

        if (position == 2) {
            btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn));
        } else {
            btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }
    }

    private void setAnswerSelect() {

        if (answer == 0) {
            btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
        }

        if (answer == 1) {
            btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
        }

        if (answer == 2) {
            btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
        }
    }

    private void judgeUserSelect() {

        if (userAnswer == 0) {

            if (answer == 0) {

                btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
            } else {

                btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_false));
            }
        } else {
            btn_answer_1.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }

        if (userAnswer == 1) {

            if (answer == 1) {

                btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
            } else {

                btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_false));
            }
        } else {
            btn_answer_2.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }

        if (userAnswer == 2) {

            if (answer == 2) {

                btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_true));
            } else {

                btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_false));
            }
        } else {
            btn_answer_3.setBackground(QuestionBaseActivity.this.getResources().getDrawable(R.drawable.shape_btn_default));
        }

    }

    private void saveScore() {

        if (answer == userAnswer) {
            UserUtil.getUser().setScore(UserUtil.getUser().getScore() + 1);
        }

        Log.d("score ",UserUtil.getUser().getScore()+"");
    }

    private void submit() {

        judgeUserSelect();
        setAnswerSelect();


        if (!hasSubmit) {

            saveScore();

            hasSubmit = true;
            btn_submit.setText("Next");
        }else{

            next();
        }

    }

    protected abstract Question getQuestion();
    protected abstract void next();

}
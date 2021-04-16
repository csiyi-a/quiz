package com.demo.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserUtil
 * Description: 描述
 * Author: HuangGuoHua
 * Date: 2021/4/15 15:46
 */
public class UserUtil {

    public static int position;

    private static User user;
    private static List<Question> questionList1;
    private static List<Question> questionList2;
    private static List<Question> questionList3;

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public static Question getQuestion(int index) {

        init1();
        init2();
        init3();

        if (position>2){
            position = 0;
        }

        if (position == 0) {
            return questionList1.get(index);
        } else if (position == 1) {
            return questionList2.get(index);
        } else {
            return questionList3.get(index);
        }
    }

    private static void init1() {

        if (questionList1 != null) {
            return;
        }
        questionList1 = new ArrayList<>();


        Question question5 = new Question();
        question5.setTitle("Which can't be used to transfer data ?");
        question5.setAnswer1("Bundle");
        question5.setAnswer2("RecycleView");
        question5.setAnswer3("Intent");
        question5.setAnswerPosition(1);

        questionList1.add(question5);

        Question question4 = new Question();
        question4.setTitle("Which is one of the four components ?");
        question4.setAnswer1("service");
        question4.setAnswer2("intent");
        question4.setAnswer3("TextView");
        question4.setAnswerPosition(0);

        questionList1.add(question4);

        Question question3 = new Question();
        question3.setTitle("Which is not part of the activity lifecycle ?");
        question3.setAnswer1("onCreateView()");
        question3.setAnswer2("onResume()");
        question3.setAnswer3("onCreate()");
        question3.setAnswerPosition(0);

        questionList1.add(question3);

        Question question2 = new Question();
        question2.setTitle("What is not part of the activity launch mode is ?");
        question2.setAnswer1("standard");
        question2.setAnswer2("singleTop");
        question2.setAnswer3("newInstance");
        question2.setAnswerPosition(2);

        questionList1.add(question2);

        Question question = new Question();
        question.setTitle("What units are used for font size ?");
        question.setAnswer1("dp");
        question.setAnswer2("sp");
        question.setAnswer3("px");
        question.setAnswerPosition(1);

        questionList1.add(question);

    }

    private static void init2() {

        if (questionList2 != null) {
            return;
        }
        questionList2 = new ArrayList<>();


        Question question5 = new Question();
        question5.setTitle("Which can share data across processes ?");
        question5.setAnswer1("intent");
        question5.setAnswer2("aidl");
        question5.setAnswer3("bundle");
        question5.setAnswerPosition(1);

        questionList2.add(question5);

        Question question4 = new Question();
        question4.setTitle("Which does not belong to the layout ?");
        question4.setAnswer1("AbsoluteLayout");
        question4.setAnswer2("LinearLayout");
        question4.setAnswer3("BroadcastReceive");
        question4.setAnswerPosition(2);

        questionList2.add(question4);

        Question question3 = new Question();
        question3.setTitle("Which is not a property of a RelativeLayout ?");
        question3.setAnswer1("android:layout_centerInParent");
        question3.setAnswer2("android:singleLine");
        question3.setAnswer3("android:layout_alignParentTop");
        question3.setAnswerPosition(1);

        questionList2.add(question3);

        Question question2 = new Question();
        question2.setTitle("Which can not achieve dynamic list layout ?");
        question2.setAnswer1("ImageView");
        question2.setAnswer2("ListView");
        question2.setAnswer3("RecycleView");
        question2.setAnswerPosition(0);

        questionList2.add(question2);

        Question question = new Question();
        question.setTitle("Which can't do a popover ?");
        question.setAnswer1("PopupWindow");
        question.setAnswer2("Service");
        question.setAnswer3("AlertDialog");
        question.setAnswerPosition(1);

        questionList2.add(question);

    }

    private static void init3() {

        if (questionList3 != null) {
            return;
        }
        questionList3 = new ArrayList<>();


        Question question5 = new Question();
        question5.setTitle("Which property makes the activity landscape ?");
        question5.setAnswer1("launchMode=singleTop");
        question5.setAnswer2("screenOrientation=landscape");
        question5.setAnswer3("allowBackup=true");
        question5.setAnswerPosition(1);

        questionList3.add(question5);

        Question question4 = new Question();
        question4.setTitle("Which jump mode can be passing parameters by returned ?");
        question4.setAnswer1("startService");
        question4.setAnswer2("startActivity");
        question4.setAnswer3("startActivityForResult");
        question4.setAnswerPosition(2);

        questionList3.add(question4);

        Question question3 = new Question();
        question3.setTitle("What kind of popover will disappear automatically ?");
        question3.setAnswer1("Toast");
        question3.setAnswer2("AlertDialog");
        question3.setAnswer3("PopupWindow");
        question3.setAnswerPosition(0);

        questionList3.add(question3);

        Question question2 = new Question();
        question2.setTitle("Which component can run silently in the background ?");
        question2.setAnswer1("Activity");
        question2.setAnswer2("Service");
        question2.setAnswer3("BroadCast");
        question2.setAnswerPosition(1);

        questionList3.add(question2);

        Question question = new Question();
        question.setTitle("Which one doesn't belong in the Android database ?");
        question.setAnswer1("SQLite");
        question.setAnswer2("Mysql");
        question.setAnswer3("SharedPreferences");
        question.setAnswerPosition(1);

        questionList3.add(question);

    }

}

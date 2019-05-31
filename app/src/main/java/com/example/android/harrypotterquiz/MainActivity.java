package com.example.android.harrypotterquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText questionOneAnswer;

    CheckBox questionTwoAnswerOne;
    CheckBox questionTwoAnswerTwo;
    CheckBox questionTwoAnswerThree;
    CheckBox questionTwoAnswerFour;

    EditText questionThreeAnswer;

    CheckBox questionFourAnswerOne;
    CheckBox questionFourAnswerTwo;
    CheckBox questionFourAnswerThree;
    CheckBox questionFourAnswerFour;

    CheckBox questionFiveAnswerOne;
    CheckBox questionFiveAnswerTwo;
    CheckBox questionFiveAnswerThree;
    CheckBox questionFiveAnswerFour;

    EditText questionSixAnswer;

    EditText questionSevenAnswer;
    CheckBox questionEightAnswerOne;
    CheckBox questionEightAnswerTwo;
    CheckBox questionEightAnswerThree;
    CheckBox questionEightAnswerFour;

    EditText questionNineAnswer;

    EditText questionTenAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  calculateScore(View view) {
        String resultDisplay;
        int answerOneScore;
        int answerTwoScore;
        int answerThreeScore;
        int answerFourScore;
        int answerFiveScore;
        int answerSixScore;
        int answerSevenScore;
        int answerEightScore;
        int answerNineScore;
        int answerTenScore;
        int finalScore;

        String answerOne;
        questionOneAnswer = (EditText) this.findViewById(R.id.alanrickman);
        answerOne = questionOneAnswer.getText().toString();
        if (answerOne.equalsIgnoreCase("Alan Rickman")) {
            answerOneScore = 1;
        } else {
            answerOneScore = 0;
        }

        boolean dh;
        boolean cos;
        boolean ps;
        boolean poa;
        questionTwoAnswerOne = (CheckBox) this.findViewById(R.id.Deathly_Hollows);
        questionTwoAnswerTwo = (CheckBox) this.findViewById(R.id.Chamber_Of_Secrects);
        questionTwoAnswerThree = (CheckBox) this.findViewById(R.id.Philosophers_Stone);
        questionTwoAnswerFour = (CheckBox) this.findViewById(R.id.Prisoner_Of_Askaban);
        dh = questionTwoAnswerOne.isChecked();
        cos = questionTwoAnswerTwo.isChecked();
        ps = questionTwoAnswerThree.isChecked();
        poa = questionTwoAnswerFour.isChecked();
        if (ps) {
            answerTwoScore = 1;
        } else {
            answerTwoScore = 0;
        }

        String answerThree;
        questionThreeAnswer = (EditText) this.findViewById(R.id.dog);
        answerThree = questionThreeAnswer.getText().toString();
        if (answerThree.equalsIgnoreCase("three headed dog")) {
            answerThreeScore = 1;
        } else {
            answerThreeScore = 0;
        }

        boolean tenSickles;
        boolean eightSickles;
        boolean twelveSickles;
        boolean fourteenSickles;
        questionFourAnswerOne = (CheckBox)this.findViewById(R.id.ten_sickles);
        questionFourAnswerTwo = (CheckBox) this.findViewById(R.id.eight_sickles);
        questionFourAnswerThree = (CheckBox) this.findViewById(R.id.twelve_sickles);
        questionFourAnswerFour = (CheckBox) this.findViewById(R.id.fourteen_sickles);
        tenSickles = questionFourAnswerOne.isChecked();
        eightSickles= questionFourAnswerTwo.isChecked();
        twelveSickles= questionFourAnswerThree.isChecked();
        fourteenSickles = questionFourAnswerFour.isChecked();
        if(fourteenSickles){
            answerFourScore=1;
        }
        else{
            answerFourScore=0;
        }
        boolean feli;
        boolean veri;
        boolean amor;
        boolean poly;
        questionFiveAnswerOne = (CheckBox)this.findViewById(R.id.feli);
        questionFiveAnswerTwo = (CheckBox) this.findViewById(R.id.ver);
        questionFiveAnswerThree = (CheckBox) this.findViewById(R.id.amo);
        questionFiveAnswerFour = (CheckBox) this.findViewById(R.id.poly);
        feli = questionFiveAnswerOne.isChecked();
        veri= questionFiveAnswerTwo.isChecked();
        amor= questionFiveAnswerThree.isChecked();
        poly = questionFiveAnswerFour.isChecked();
        if(amor){
            answerFiveScore=1;
        }
        else{
            answerFiveScore=0;
        }
        String answerSix;
        questionSixAnswer = (EditText) this.findViewById(R.id.daily_prophet);
        answerSix = questionSixAnswer.getText().toString();
        if (answerSix.equalsIgnoreCase("Daily Prophet")) {
            answerSixScore = 1;
        } else {
            answerSixScore = 0;
        }

        String answerSeven;
        questionSevenAnswer = (EditText)this.findViewById(R.id.ravenclaw);
        answerOne = questionSevenAnswer.getText().toString();
        if (answerOne.equalsIgnoreCase("Ravenclaw")) {
            answerSevenScore = 1;
        } else {
            answerSevenScore = 0;
        }
        boolean eight;
        boolean six;
        boolean twelve;
        boolean seven;
        questionEightAnswerOne = (CheckBox)this.findViewById(R.id.eight);
        questionEightAnswerTwo = (CheckBox) this.findViewById(R.id.six);
        questionEightAnswerThree = (CheckBox) this.findViewById(R.id.twelve);
        questionEightAnswerFour = (CheckBox) this.findViewById(R.id.seven);
        eight = questionEightAnswerOne.isChecked();
        six= questionEightAnswerTwo.isChecked();
        twelve= questionEightAnswerThree.isChecked();
        seven = questionEightAnswerFour.isChecked();
        if(seven){
            answerEightScore=1;
        }
        else {
            answerEightScore = 0;
        }

        String answerNine;
        questionNineAnswer = (EditText)this.findViewById(R.id.expecto);
        answerNine = questionNineAnswer.getText().toString();
        if (answerNine.equalsIgnoreCase("Expecto Patronum")|| answerNine.equals("Patronous Charm")) {
            answerNineScore = 1;
        } else {
            answerNineScore = 0;
        }

        String answerTen;
        questionTenAnswer = (EditText)this.findViewById(R.id.jean);
        answerTen = questionTenAnswer.getText().toString();
        if (answerTen.equalsIgnoreCase("Jean")) {
            answerTenScore = 1;
        } else {
            answerTenScore = 0;
        }

        finalScore = answerOneScore + answerTwoScore + answerThreeScore + answerFourScore + answerFiveScore+
                answerSixScore + answerSevenScore + answerEightScore + answerNineScore + answerTenScore;

        if(finalScore== 10) {
            resultDisplay = "Hurray! You are a true Harry Potter Fan. You scored " + finalScore + " out of 10";
        }
        else{
            resultDisplay = "Try Again. You scored " + finalScore + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();

    }

    }


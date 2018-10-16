package com.example.truefalsequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class TrueFalseActivity extends AppCompatActivity {

    private Button truebutton;
    private Button falsebutton;
    private TextView question;
    private List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);

        wireWidgets();
        setListeners();
        initiateQuestions();
    }

    private void initiateQuestions() {
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.questions);
        String jsonString = readTextFile(XmlFileInputStream);

        // create a gson object
        Gson gson = new Gson();
        // read your json file into an array of questions
        Question[] questions =  gson.fromJson(jsonString, Question[].class);
        // convert your array to a list using the Arrays utility class
        questionList = Arrays.asList(questions);
        // verify that it read everything properly
        Log.d("WORKING", "onCreate: " + questionList.toString());

        question.setText(questionList.get(0).toString());
    }

    private void wireWidgets() {
        truebutton = findViewById(R.id.button_main_true);
        falsebutton = findViewById(R.id.button_main_false);
        question = findViewById(R.id.button_main_question);
    }

    private void setListeners() {
        truebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTrueAnswer();
            }
        });
        falsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkFalseAnswer();
            }
        });
    }

    private void checkFalseAnswer() {
    }

    private void checkTrueAnswer() {

    }

    private void showScoreScreen() {
        //add screen and score here
    }

    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }
}

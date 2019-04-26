package hfad.com.mygroupassignment;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TakingQuizActivity extends AppCompatActivity {

    DatabaseHelper mDatabaseHelper;
    private INFS1609 mINFS1609;
    private TextView Question1;
    private RadioGroup RadioGroup1;
    private RadioButton Choice1A;
    private RadioButton Choice1B;
    private RadioButton Choice1C;
    private RadioButton Choice1D;

    private TextView Question2;
    private RadioGroup RadioGroup2;
    private RadioButton Choice2A;
    private RadioButton Choice2B;
    private RadioButton Choice2C;
    private RadioButton Choice2D;

    private TextView Question3;
    private RadioGroup RadioGroup3;
    private RadioButton Choice3A;
    private RadioButton Choice3B;
    private RadioButton Choice3C;
    private RadioButton Choice3D;

    private Button submit_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_quiz);

        mDatabaseHelper = new DatabaseHelper(this);
        Intent intent = getIntent();
        final int position = intent.getIntExtra(DetailActivity.MESSAGE, 0);
        mINFS1609 = INFS1609.getINFS1609().get(position);
        RadioGroup1 = findViewById(R.id.radio_group_1);
        Question1 = findViewById(R.id.question1);
        Choice1A = findViewById(R.id.question1_a);
        Choice1B = findViewById(R.id.question1_b);
        Choice1C = findViewById(R.id.question1_c);
        Choice1D = findViewById(R.id.question1_d);


        Question2 = findViewById(R.id.question2);
        RadioGroup2 = findViewById(R.id.radio_group_2);
        Choice2A = findViewById(R.id.question2_a);
        Choice2B = findViewById(R.id.question2_b);
        Choice2C = findViewById(R.id.question2_c);
        Choice2D = findViewById(R.id.question2_d);

        Question3 = findViewById(R.id.question3);
        RadioGroup3 = findViewById(R.id.radio_group_3);
        Choice3A = findViewById(R.id.question3_a);
        Choice3B = findViewById(R.id.question3_b);
        Choice3C = findViewById(R.id.question3_c);
        Choice3D = findViewById(R.id.question3_d);
        submit_button = findViewById(R.id.submit_button);


        Question1.setText(mINFS1609.getQuiz().get(0).getQuestion());
        Choice1A.setText(mINFS1609.getQuiz().get(0).getOptionA());
        Choice1B.setText(mINFS1609.getQuiz().get(0).getOptionB());
        Choice1C.setText(mINFS1609.getQuiz().get(0).getOptionC());
        Choice1D.setText(mINFS1609.getQuiz().get(0).getOptionD());

        Question2.setText(mINFS1609.getQuiz().get(1).getQuestion());
        Choice2A.setText(mINFS1609.getQuiz().get(1).getOptionA());
        Choice2B.setText(mINFS1609.getQuiz().get(1).getOptionB());
        Choice2C.setText(mINFS1609.getQuiz().get(1).getOptionC());
        Choice2D.setText(mINFS1609.getQuiz().get(1).getOptionD());

        final int quizSize = mINFS1609.getQuiz().size();

        if (quizSize == 2) {
            Question3.setVisibility(View.GONE);
            Choice3A.setVisibility(View.GONE);
            Choice3B.setVisibility(View.GONE);
            Choice3C.setVisibility(View.GONE);
            Choice3D.setVisibility(View.GONE);

        } else {
            Question3.setText(mINFS1609.getQuiz().get(2).getQuestion());
            Choice3A.setText(mINFS1609.getQuiz().get(2).getOptionA());
            Choice3B.setText(mINFS1609.getQuiz().get(2).getOptionB());
            Choice3C.setText(mINFS1609.getQuiz().get(2).getOptionC());
            Choice3D.setText(mINFS1609.getQuiz().get(2).getOptionD());
        }



        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = 0;

                int selectedId1 = RadioGroup1.getCheckedRadioButtonId();
                RadioButton btn1 = findViewById(selectedId1);

                int selectedId2 = RadioGroup2.getCheckedRadioButtonId();
                RadioButton btn2 = findViewById(selectedId2);

                if (btn1.getText().equals(mINFS1609.getQuiz().get(0).getAnswer())) {
                    result ++;
                }
                if (btn2.getText().equals(mINFS1609.getQuiz().get(1).getAnswer())) {
                    result ++;
                }

                if (quizSize == 3) {
                    int selectedId3 = RadioGroup3.getCheckedRadioButtonId();
                    RadioButton btn3 = findViewById(selectedId3);


                    if (btn3.getText().equals(mINFS1609.getQuiz().get(2).getAnswer())) {
                        result ++;
                    }


                }

                float final_result = (float)result / (float)quizSize * 100;

                System.out.println("======================================" + final_result);
                mDatabaseHelper.updateCourse(mINFS1609.getWeek_id(),(int) final_result);

//                ArrayList<Integer> input = new ArrayList<>();
//                input.add(mINFS1609.getWeek_id());
//                input.add((int)final_result);
//                mDatabaseHelper.insertCourse(input);
                Cursor getData = mDatabaseHelper.getData();
                ArrayList<Integer> week_data = new ArrayList<>();
                ArrayList<Integer> result_data = new ArrayList<>();
                while(getData.moveToNext()) {
                    week_data.add(getData.getInt(0));
                    result_data.add(getData.getInt(1));
                }

                System.out.println("==========TAKING QUIZ ACTIVITY==============");
                for (int i = 0; i < week_data.size(); i ++) {
                    System.out.println("WEEK = " + week_data.get(i) + " RESULT = " + result_data.get(i));
                }

                launchCongratulationActivity(final_result);
            }
        });

    }


    public void launchCongratulationActivity (float result) {
        Intent intent = new Intent(this,Congratulation.class);

        intent.putExtra("hello", result);

        startActivity(intent);
    }



}

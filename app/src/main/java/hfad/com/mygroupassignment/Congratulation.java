package hfad.com.mygroupassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Congratulation extends AppCompatActivity {

    private TextView result;
    private TextView congrats;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);

        result = findViewById(R.id.result);
        back = findViewById(R.id.back_button);
        congrats = findViewById(R.id.congratulation_text);

        Intent intent = getIntent();
        final float final_result = intent.getFloatExtra("hello",0);

        if (final_result == 0.0) {

            congrats.setText("Try Again!");
        }

        result.setText(String.valueOf((int)final_result) + "%");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchMainActivity();
            }
        });
    }

    public void launchMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }
}

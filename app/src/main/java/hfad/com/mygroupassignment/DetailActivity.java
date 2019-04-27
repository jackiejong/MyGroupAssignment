package hfad.com.mygroupassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {

    public static final String MESSAGE = "MESSAGE";
    private INFS1609 mINFS1609;
    private TextView tv_week_id;
    private TextView tv_week_title;
    private TextView tv_content_title1;
    private TextView tv_content_title2;
    private TextView tv_content_title3;
    private TextView tv_content1;
    private TextView tv_content2;
    private TextView tv_content3;
    private TextView tv_date;
    private Button mQuizButton;


    private TextView qotd;
    private TextView qotdAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        // Initialization
        tv_content_title1 = findViewById(R.id.content_title1);
        tv_content_title2 = findViewById(R.id.content_title2);
        tv_content_title3 = findViewById(R.id.content_title3);
        tv_content1 = findViewById(R.id.content1);
        tv_content2 = findViewById(R.id.content2);
        tv_content3 = findViewById(R.id.content3);
        mQuizButton = findViewById(R.id.quiz_button);
        qotd = findViewById(R.id.qotd);
        qotdAuthor = findViewById(R.id.qotd_author);


        // Getting Intent Message from Detail Activity
        Intent intent = getIntent();
        final int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mINFS1609 = INFS1609.getINFS1609().get(position);
        setTitle(mINFS1609.getWeek_title());


        tv_content_title1.setText(mINFS1609.getContent_title1());
        tv_content_title2.setText(mINFS1609.getContent_title2());
        tv_content_title3.setText(mINFS1609.getContent_title3());
        tv_content1.setText(mINFS1609.getContent1());
        tv_content2.setText(mINFS1609.getContent2());
        tv_content3.setText(mINFS1609.getContent3());


        loadDataList();
        mQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchTakingQuizActivity(position);
            }
        });


    }


    // To launch Taking Quiz Activity
    public void launchTakingQuizActivity(int position) {
        Intent intent = new Intent(this, TakingQuizActivity.class);
        intent.putExtra(MESSAGE, position);
        startActivity(intent);
    }



    // API Connection
    private void loadDataList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://quotesondesign.com/wp-json/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        QuoteClient service = retrofit.create(QuoteClient.class);

        Call<List<Quote>> call = service.getData();


        // Async
        call.enqueue(new Callback<List<Quote>>() {
            @Override
            public void onResponse(Call<List<Quote>> call, Response<List<Quote>> response) {
                qotd.setText(response.body().get(0).getContent());
                qotdAuthor.setText(response.body().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<List<Quote>> call, Throwable t) {
                Toast.makeText(DetailActivity.this, "Unable to load quotes", Toast.LENGTH_SHORT).show();
            }
        });



    }
}

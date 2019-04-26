package hfad.com.mygroupassignment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Initialize
    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs1609.beers.MESSAGE";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    DatabaseHelper mDatabaseHelper;
    ArrayList<INFS1609> course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mDatabaseHelper = new DatabaseHelper(this);
        //These two methods below at the very start of the program if we want to delete previous data
        //mDatabaseHelper.drop();
        //mDatabaseHelper.initialize();

        // Initialise the course and update the Class data from Database
        course = INFS1609.getINFS1609();
        update();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recyclerview stuff
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        CourseAdapter.RecyclerViewClickListener listener = new CourseAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };

        mAdapter = new CourseAdapter(course, listener);
        mRecyclerView.setAdapter(mAdapter);

    }

    // To launch Detail Activity
    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);



    }

    // Method to update data from Database to the Class
    public void update() {
        Cursor getData = mDatabaseHelper.getData();
        ArrayList<Integer> week_data = new ArrayList<>();
        ArrayList<Integer> result_data = new ArrayList<>();
        while(getData.moveToNext()) {
            week_data.add(getData.getInt(0));
            result_data.add(getData.getInt(1));
        }

        for(int i = 0; i < week_data.size(); i ++) {
            course.get(week_data.get(i) - 1).setQuiz_result(result_data.get(i));
        }
    }


}

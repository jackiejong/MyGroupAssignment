package hfad.com.mygroupassignment;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String COURSE_TABLE_NAME = "course";
    private static final String COL1 = "week_id";
    private static final String COL9 = "quiz_result";



    private static final String QUIZ_TABLE_NAME = "quiz";
    private static final String QUIZ_COL0 = "week_id";
    private static final String QUIZ_COL7 = "result";

    public DatabaseHelper(Context context) {
        super(context, COURSE_TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createCourseTable = "CREATE TABLE " + COURSE_TABLE_NAME
                + " (" + COL1 + " INTEGER PRIMARY KEY, "
                + COL9 + " INTEGER) ";

/*
        String createQuizTable = "CREATE TABLE " + QUIZ_TABLE_NAME
                + " (" + QUIZ_COL0 + " INTEGER, "
                + QUIZ_COL7 + " INTEGER)";
*/
        //db.execSQL(createQuizTable);
        db.execSQL(createCourseTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + COURSE_TABLE_NAME);
        //db.execSQL("DROP TABLE IF EXISTS " + QUIZ_TABLE_NAME);
        onCreate(db);
    }


    public boolean insertCourse (ArrayList<String> input) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, Integer.parseInt(input.get(0)));
        contentValues.put(COL9, Integer.parseInt(input.get(1)));

        Log.d(TAG, "addData: Adding data to " + COURSE_TABLE_NAME);
        long result = db.insert(COURSE_TABLE_NAME, null, contentValues);

        if (result == -1 ) {
            return false;
        } else {
            return true;
        }

    }
/*

    public boolean insertQuiz (ArrayList<String> input) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(QUIZ_COL0, Integer.parseInt(input.get(0)));
        contentValues.put(QUIZ_COL7, Integer.parseInt(input.get(1)));

        Log.d(TAG,"addData: Adding data to " + QUIZ_TABLE_NAME);
        long result = db.insert(QUIZ_TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }

*/
    public Cursor getData() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + COURSE_TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public Cursor getCustomData (String query) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery(query, null);
        return data;
    }



}

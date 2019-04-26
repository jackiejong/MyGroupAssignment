package hfad.com.mygroupassignment;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public boolean insertCourse (ArrayList<Integer> input) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, input.get(0));
        contentValues.put(COL9, input.get(1));

        Log.d(TAG, "addData: Adding data to " + COURSE_TABLE_NAME);
        long result = db.insert(COURSE_TABLE_NAME, null, contentValues);

        if (result == -1 ) {
            return false;
        } else {
            return true;
        }

    }


    public void initialize() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        ArrayList<Integer> a5 = new ArrayList<>();
        ArrayList<Integer> a6 = new ArrayList<>();
        ArrayList<Integer> a7 = new ArrayList<>();
        ArrayList<Integer> a8 = new ArrayList<>();
        ArrayList<Integer> a9 = new ArrayList<>();
        ArrayList<Integer> a10 = new ArrayList<>();

        a1.add(1);
        a2.add(2);
        a3.add(3);
        a4.add(4);
        a5.add(5);
        a6.add(6);
        a7.add(7);
        a8.add(8);
        a9.add(9);
        a10.add(10);

        a1.add(0);
        a2.add(0);
        a3.add(0);
        a4.add(0);
        a5.add(0);
        a6.add(0);
        a7.add(0);
        a8.add(0);
        a9.add(0);
        a10.add(0);

        insertCourse(a1);
        insertCourse(a2);
        insertCourse(a3);
        insertCourse(a4);
        insertCourse(a5);
        insertCourse(a6);
        insertCourse(a7);
        insertCourse(a8);
        insertCourse(a9);
        insertCourse(a10);












    }

    public void drop() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + COURSE_TABLE_NAME);
        //db.execSQL("DROP TABLE IF EXISTS " + QUIZ_TABLE_NAME);
        onCreate(db);
    }


/*


 */

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

    public boolean updateCourse (int week, int marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, week);
        contentValues.put(COL9,marks);
        db.update(COURSE_TABLE_NAME, contentValues, "WEEK_ID = ?", new String[] {String.valueOf(week)} );
        return true;
    }

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

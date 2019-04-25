package hfad.com.mygroupassignment;

import java.util.ArrayList;

public class Quiz {

    private int week_id;
    private int question_no;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;

    public Quiz(int question_no, String question, String answer) {
        this.question_no = question_no;
        this.question = question;

        this.answer = answer;
    }

    public Quiz(int week_id, int question_no, String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        this.week_id = week_id;
        this.question_no = question_no;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }

    public int getWeek_id() {
        return week_id;
    }

    public void setWeek_id(int week_id) {
        this.week_id = week_id;
    }

    public int getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(int question_no) {
        this.question_no = question_no;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static ArrayList<Quiz> getQuizWeek1() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(1, 1, "An object is an instance of a  ___ ,","Method", "Parameter","Class", "Subclass","Class"));
        mQuiz.add(new Quiz(1, 2,"A ___ is a blueprint for an object", "Class","Method","Object","Instance","Class"));
        return mQuiz;
    }

    public static ArrayList<Quiz> getQuizWeek2() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(2,1,"____ represents an entity in the real world that can be distinctly identified.","An Object","A class","Main method", "Blueprint","An Object"));
        mQuiz.add(new Quiz(2,2,"What is a class? ","An integer value","Sequence of characters","A type of variable that can contain fractions and integers","A particular kind of object that can contain related methods and variables","A particular kind of object that can contain related methods and variables"));
        mQuiz.add(new Quiz(2,2,"___ and ___ are defined in classes ","Classes, objects","Objects, instances","Methods, fields","Constructors, methods","Methods, fields"));


        return mQuiz;
    }

    public static ArrayList<Quiz> getQuizWeek3() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(3,1,"What is a primitive data type?","Pre-defined java information","The thing created in the computer’s memory that is described by a class"
        ,"Program written in Java that describes object", "A memory location that holds data/information", "Pre-defined java information"));
        mQuiz.add(new Quiz(3,2, "What IS NOT a data type in Java?", "byte", "short", "int", "String","String"));
        mQuiz.add(new Quiz(3,3,"How many primitive data types are there? ","6","7","8","9", "8"));


        return mQuiz;
    }

    public static ArrayList<Quiz> getQuizWeek4() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(4,1,"if(10<9) System.out.println(“print me please?”);", "print me please?", "Error", "System.out.println","10<9","Error"));
        mQuiz.add(new Quiz(4,2,"What does && mean?","Both conditions X and Y must be true", "Only either one of X and Y needs to be true", "None of X and Y is true", "None of the above", "Both conditions X and Y must be true"));
        mQuiz.add(new Quiz(4,3,"What does == mean?", "Contains", "Does not contain", "Equals", "Does not equal", "Equals"));


        return mQuiz;
    }


    public static ArrayList<Quiz> getQuizWeek5() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(5,1,"What is a loop?", "A structure that allows repeated execution of a block of statements.",
                "The block of statements that executes when the Boolean expression that controls the loop is true.",
                "A loop that executes a specific number of times is a definite loop or a counted loop.",
                "A loop in which the final number of loops is unknown.","What is a loop?\", \"A structure that allows repeated execution of a block of statements."));
        mQuiz.add(new Quiz(5,2,"What statement is faster to execute","If-else","Switch","System.out.println","Scanner","Switch"));
        mQuiz.add(new Quiz(5,3,"A while loop ___", "executes a specific number of times is a definite loop or a counted loop.","determines whether loop execution continues.",
                "Never ends",
                "Executes a body of statements continually as long as the Boolean expression that controls entry into the loop continues to be true.","Executes a body of statements continually as long as the Boolean expression that controls entry into the loop continues to be true."));

        return mQuiz;
    }


    public static ArrayList<Quiz> getQuizWeek6() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(6,1,"What is the return type of a method that does not return any value?","int", "float","void","double","void"));
        mQuiz.add(new Quiz(6,2,"What is the process of defining more than one method in a class differentiated by method signature?","Function overriding","Function overloading","Function doubling","None of the above", "Function overloading"));

        return mQuiz;
    }


    public static ArrayList<Quiz> getQuizWeek7() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(7,1,"Which of the following is not true about Arrays","An Array is always an object","Length of the array can be changed after the creation of it","Arrays can be declared in numeric and string variables","None of the above","Length of the array can be changed after the creation of it"));
        mQuiz.add(new Quiz(7,2,"How do you instantiate an array in Java?","int arr[] = new int(3);","int arr[];","int arr[] = new int[3];","int arr() = new int(3);","int arr[] = new int[3];"));
        mQuiz.add(new Quiz(7,3,"Which of these best describes an array?","A data structure that shows a hierarchical behavior", "Container of objects of similar types", "Container of objects of mixed types",
                "All of the mentioned", "Container of objects of similar types"));

        return mQuiz;
    }


    public static ArrayList<Quiz> getQuizWeek8() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(8, 1, "Which of the following is a correct way to declare a multidimensional array in Java?", "int[][] arr;",
                "int arr[][];", "int []arr[];", "All of the above", "All of the above"));
        mQuiz.add(new Quiz(8, 2, "Which of these is an incorrect Statement?"
                , "It is necessary to use new operator to initialize an array"
                , "Array can be initialized using comma separated expressions surrounded by curly braces"
                , "Array can be initialized when they are declared"
                , "None of the mentioned", "It is necessary to use new operator to initialize an array"));

        return mQuiz;
    }


    public static ArrayList<Quiz> getQuizWeek9() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(9,1,"Which definition best describes an object?","Instance of a class","Instance of itself","Child of a class","Overview of a class","Instance of a class"));
        mQuiz.add(new Quiz(9,2, "How many objects can be declared of a specific class in a single program?","32768","127","1","As many as you want", "As many as you want"));
        mQuiz.add(new Quiz(9, 3,"Which among the following is false?", "Object must be created before using members of a class","Memory for an object is allocated only after its constructor is called","Objects can’t be passed by reference","Objects size depends on its class data members","Objects can’t be passed by reference"));


        return mQuiz;


    }

    public static ArrayList<Quiz> getQuizWeek10() {
        ArrayList<Quiz> mQuiz = new ArrayList<>();

        mQuiz.add(new Quiz(10,1, "Which among the following is called first, automatically, whenever an object is created?"
        , "Class", "Constructor", "New","Trigger","Constructor"));
        mQuiz.add(new Quiz(10,2,"Which among the following is not a necessary condition for constructors?","Its name must be same as that of class"
        ,"It must not have any return type","It must contain a definition body","It can contains arguments","It must contain a definition body"));
        return mQuiz;
    }

}

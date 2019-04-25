package hfad.com.mygroupassignment;

import java.util.ArrayList;
import java.util.HashMap;

public class INFS1609 {

    private int week_id;
    private String week_title;
    private String content_title1;
    private String content_title2;
    private String content_title3;
    private String content1;
    private String content2;
    private String content3;
    private int quiz_result;
    private String date;
    private ArrayList<Quiz> quiz;


    public int getWeek_id() {
        return week_id;
    }

    public void setWeek_id(int week_id) {
        this.week_id = week_id;
    }

    public String getWeek_title() {
        return week_title;
    }

    public void setWeek_title(String week_title) {
        this.week_title = week_title;
    }

    public String getContent_title1() {
        return content_title1;
    }

    public void setContent_title1(String content_title1) {
        this.content_title1 = content_title1;
    }

    public String getContent_title2() {
        return content_title2;
    }

    public void setContent_title2(String content_title2) {
        this.content_title2 = content_title2;
    }

    public String getContent_title3() {
        return content_title3;
    }

    public void setContent_title3(String content_title3) {
        this.content_title3 = content_title3;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

    public int getQuiz_result() {
        return quiz_result;
    }

    public void setQuiz_result(int quiz_result) {
        this.quiz_result = quiz_result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Quiz> quiz) {
        this.quiz = quiz;
    }

    public INFS1609(int week_id, String week_title, String content_title1, String content_title2, String content_title3, String content1, String content2, String content3, int quiz_result, String date, ArrayList<Quiz> quiz) {
        this.week_id = week_id;
        this.week_title = week_title;
        this.content_title1 = content_title1;
        this.content_title2 = content_title2;
        this.content_title3 = content_title3;
        this.content1 = content1;
        this.content2 = content2;
        this.content3 = content3;
        this.quiz_result = quiz_result;
        this.date = date;
        this.quiz = quiz;
    }

    public INFS1609(int week_id, String week_title, String content_title1, String content_title2, String content_title3, String content1, String content2, String content3, int quiz_result, String date) {
        this.week_id = week_id;
        this.week_title = week_title;
        this.content_title1 = content_title1;
        this.content_title2 = content_title2;
        this.content_title3 = content_title3;
        this.content1 = content1;
        this.content2 = content2;
        this.content3 = content3;
        this.quiz_result = quiz_result;
        this.date = date;
    }

    public INFS1609(int week_id, String date, String week_title, String content1) {
        this.week_id = week_id;
        this.date = date;
        this.week_title = week_title;
        this.content1 = content1;

    }

    public INFS1609(int week_id, String date, String week_title, String content1, ArrayList<Quiz> quiz) {
        this.week_id = week_id;
        this.date = date;
        this.week_title = week_title;
        this.content1 = content1;
        this.quiz = quiz;
    }


    public static ArrayList<INFS1609> getDummyINFS1609() {
        ArrayList<INFS1609> INFS1609a = new ArrayList<>();

        INFS1609a.add(new INFS1609(1, "18 February", "Introduction & Android Fundamentals","Android Studio, Git & App basics"));
        INFS1609a.add(new INFS1609(2,"25 February", "Activities, Lifecycle & Intents", "Activities & Intents"));
        INFS1609a.add(new INFS1609(3, "4 March", "Layouts & UI", "Designing UI"));
        INFS1609a.add(new INFS1609(4,"11 March", "Lists & Adapters", "Displaying items in a list"));
        INFS1609a.add(new INFS1609(5,"18 March","Fragments & Multi-layout Apps","Fragments for Multi-layout Apps"));
        INFS1609a.add(new INFS1609(6, "25 March","APIs, Permissions & Libraries", "APIs & JSON"));
        INFS1609a.add(new INFS1609(7, "1 April", "Networking", "Networking"));
        INFS1609a.add(new INFS1609(8, "8 April", "Threads & Async Tasks", "Asynce Tasks"));
        INFS1609a.add(new INFS1609(9, "15 April", "Data Saving", "Database"));
        INFS1609a.add(new INFS1609(10, "22 April", "Outlook & Course Summary","Revision"));
        return INFS1609a;
    }


    public static ArrayList<INFS1609> getINFS1609() {
        ArrayList <INFS1609> mINFS1609 = new ArrayList<>();
        mINFS1609.add(new INFS1609(1, "Intro to Java Programming", "What is programming?", "Why Java?", "Anatomy of a Java Program ","Programming are the instructions given to a computer. Computers do not understand human languages; thus, computer languages are needed in order to communicate with them. Programs are written using programming languages, which will be ”translated” into machine codes for execution. The programming process allows humans to write instructions in an English-like way. A software program called a compiler then “transforms” the English-like text into instructions that the computer understands. ",
                "•\tWidely use “blue collar” programming language \n" +
                        "•\tWell established coding conventions – good for learning \n" +
                        "•\tJava is used in Android apps, server applications in financial services industry, web applications etc. \n" +
                        "•\tScalability and compatibility (platform independent) \n","•\tClass name \n" +
                "•\tMain method \n" +
                "•\tStatements \n" +
                "•\tStatement terminator \n" +
                "•\tReserved words \n" +
                "•\tComments \n" +
                "•\tBlocks \n", 0, "18 February", Quiz.getQuizWeek1()));



        mINFS1609.add(new INFS1609(2, "OO Programming (Part I)", "What is an Object?","Variables", "Methods ",
                "An object is an encapsulation of data together with procedures that manipulate the data and functions that return information about the data",
                "A value attached to an object that can represent data of different types. When you declare a variable, you need to tell the compiler two things:\n" +
                        "The name of the variable\n" +
                        "The type of data it can store\n",
                "Functions or behaviors that a class (and its instances) can do ",0,"25 February",Quiz.getQuizWeek2()));


        mINFS1609.add(new INFS1609(3, "OO Programming (Part II)","Primitive data types"
        , "Reference types (to an object)", "Type Casting"
                , "A type predefined by Java and is named by a reserved keyword. The String class is not a primitive data type\n" +
                "the new keyword isn’t used to initialize a variable of primitive type – primitives are special data types (not an object created from a class) \n"
        ,"It holds a memory reference to an object \n" +
                "Any instantiable class as well as arrays. String, Scanner, Random, int [ ], String[ ] , etc. \n" +
                "“Automatic” conversion \n" +
                "officially called as the Assignment Conversion \n" +
                "Assign a value to a numeric variable whose type supports a larger range of values \n" +
                "E.g., you can assign a long to a float variable \n",
                "an operation that converts a value of one data type into a value of another data type ",
                0,"4 March", Quiz.getQuizWeek3()));


        mINFS1609.add(new INFS1609(4, "Selection", "Common errors in elementary programming","The boolean type", "The if conditional statement",
                "Unbalanced or missing parentheses \n" +
                        "Capitalisation of keywords (e.g., class) or other case sensitive errors \n" +
                        "Confusing assignment operator (=) with the comparison operator (==)\n","A boolean type is simply true or false \n" +
                "Very useful to use with relational operators to compare two values \n","Selectively execute part of a program \n" +
                "Syntax: \n" +
                "if(condition) statement; \n" +
                "Condition is a Boolean expression. If the condition is true, then the statement is executed. \n",0,"11 March", Quiz.getQuizWeek4()));


        mINFS1609.add(new INFS1609(5,"Selection & Loop","The switch statement","The while loop","A do-while loop","When to use the switch statement?\n" +
                "A sequence of comparisons needed to be made against several constant alternatives\n" +
                "A switch statement evaluates an expression to determine a value and then matches that value with one of several possible cases \n","When to use a while loop?\n" +
                "Repeat statement(s) for an unknown number of times until a condition becomes false \n","replaces a while loop if the loop body has to be executed before testing the continuation condition ",0,"18 March", Quiz.getQuizWeek5()));




        mINFS1609.add(new INFS1609(6, "Methods","Introduction to Methods","Why do we use methods?","Returning Values","A method is a collection of statements that are grouped together to perform an operation\n" +
                "•\tWhen invoked, a method executes an operation and generates an output. \n" +
                "•\tIt may take in an input or it may simply just execute an operation.\n" +
                "•\tIt may generate an output on the console and/or simply return a value to the main method.\n",
                "•\tMakes the code easier to read - modular code\n" +
                        "•\tReduce complexity\n" +
                        "•\tReduce redundant code from re-use\n",
                "•\tIf the method returns a value, ensure the return keyword is used within the method body\n" +
                        "•\tAny line of code after the return keyword will not be executed because the work has been handed back and the application has exited the method\n",0,"25 March",Quiz.getQuizWeek6()));


        mINFS1609.add(new INFS1609(7, "Single Dimensional Arrays", "Introduction","Instantiating Arrays - Method I", "Instantiating Arrays - Methord II",
                "•\tJava array is an object the contains elements of similar data type. It is a data structure where we store similar elements. We can store only fixed set of elements in a java array.\n" +
                        "•\tJava follows a 0-index system,\n" +
                        " i.e. START COUNTING FROM 0!!\n",
                "int[] myIntArray = new int[4];\n" +
                        "myIntArray[0] = 24;\n" +
                        "myIntArray[1] = 8;\n" +
                        "myIntArray[2] = 7;\n" +
                        "myIntArray[3] = 12;\n","int[] myIntArray = {24, 8, 7, 12};", 0, "1 April",Quiz.getQuizWeek7()));



        mINFS1609.add(new INFS1609(8,"Multidimensional Arrays","Introduction","Initializing a Multi-Dimensional Array - Method I",

                "Initializing a Multi-Dimensional Array - Method II","Best way to think of it: A variable that can hold many values but:\n" +
                "•\tThe maximum amount of values is fixed –established during declaration\n" +
                "•\tEach value must be of the same data type.\n" +
                "•\tIn Java, the first dimension of an array is 0, not 1!\n" +
                "•\tdataType[] arrayName= new dataType[maxDimension];\n" +
                "•\tdataType[] arrayName= {value1, value2, value3};\n" +
                "•\t\n" +
                "Arrays can have an infinite number of dimensions, however, it is rare that you would need any more than 2 dimensions. \n","int[][] twoDimensionalArray = new int[2][2];\n" +
                "myIntArray[0][0] = 1\n" +
                "myIntArray[0][1] = 2\n" +
                "myIntArray[1][0] = 3\n" +
                "myIntArray[1][1] = 4\n","int[][] twoDimensionalArray = { {1,2}, {3,4} }",0,"8 April", Quiz.getQuizWeek8()));



        mINFS1609.add(new INFS1609(9,"Thinking in Objects (Part I)","Introduction","What is an Object","Object as an Instance of a Class",
                "An object is supposed to represent an entity in the real world\n" +
                        "o\tI.e student, desk, laptop etc.\n",
                "Like any real world entity:\n" +
                        "o\tit has characteristics (properties)\n" +
                        "o\tit serves a purpose/does something (methods).\n" +
                        "e.g. for the object 'Author'\n","•\tThink of a class as a kind of blueprint\n" +
                "•\tIt gives us the structure for something\n" +
                "•\tIt might define things like room, size, colour, style\n" +
                "•\tKey to note here is that its not tangible, its like a virtual cookie cutter. Its used to make something tangible\n" +
                "•\tIn programming terms, objects  are instantiated from our class\n" +
                "•\tE.g.; \n",0,"15 April", Quiz.getQuizWeek9()
                ));


        mINFS1609.add(new INFS1609(10, "Thinking in Objects (Part II)", "Constructors","Access Modifiers","Getters & Setters",
                "When we need to create the objects, we use something called the constructor.\n" +
                        "\n" +
                        "Constructors: \n" +
                        "•\tDeals with the general initialisation of a class, by Instantiating an object from a class. \n" +
                        "•\tTo invoke superclass constructor in subclass we use : Super(); \n" +
                        "•\tConstructors are special methods, tasked with creating new objects from a class.\n" +
                        "•\tTheir name is EXACTLY THE SAME as their class. \n" +
                        "•\tIts not returning anything (no return type)\n" +
                        "•\tDon’t put void!\n" +
                        "•\tIf not defined, an default no-args constructor is implicitly defined\n",

                "Access modifiers change access permissions. There are 4 types, Public, Private, Default and Protected",
                "\uF09A\tWhen your data fields are private (why? Encapsulation) how can we access them?                   Answer: Getters and setters\n" +
                        "\uF09A\tThey’re basically methods which you can use to manipulate data in your objects\n",0, "22 April", Quiz.getQuizWeek10()));


        return mINFS1609;
    }









}

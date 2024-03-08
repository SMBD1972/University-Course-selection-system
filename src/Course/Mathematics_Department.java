import java.util.Scanner;


public class Mathematics_Department {
    public static int Calculus2Capacity = 220;
    public static int BasicsOfMathematicsCapacity = 60;
    public static int Differential_EquationsCapacity = 200;
    public String CourseName;
    private String ProfName;
    private String CourseCode;
    public int Capacity;
    private int numberOfCourse;
    private double ClassStartTime;
    private double ClassEndTime;
    private double ExamTime;
    private String TypeOfCourse;
    String ClaasDay;
    String ExamDay;
    public static String courseNameNew;
    public static String profNameNew;
    public static String courseCodeNew;
    public static int capacityNew;
    public static int courseNumberNew;
    public static double startTimeNew;
    public static double endTimeNew;
    public static String classDayNew;
    public static double examTimeNew;
    public static String examDayNew;
    public static String courseTypeNew;


    public Mathematics_Department(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
        this.Capacity = Capacity;
//        this.=Capacity;
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.numberOfCourse = numberOfCourse;
        this.ClassStartTime = ClassSatrtTime;
        this.ClassEndTime = ClassEndTime;
        this.ExamTime = ExamTime;
        this.ProfName = ProfName;
        this.TypeOfCourse = TypeOfCourse;
        this.ClaasDay = ClassDay;
        this.ExamDay = ExamDay;
    }


    public String DisplayInfo() {
        System.out.println("CourseName : " + CourseName + " / " + "ProfName : " + ProfName + " / " + "Code Of Course : " + CourseCode + " / " + "Capacity : " + Capacity + " / " + "numberOfCourse : " + numberOfCourse + " / " + "time : From " + ClassStartTime + " to " + ClassEndTime + " at " + ClaasDay + " / " + "ExamTime : " + ExamTime + " in " + ExamDay + " / " + "Type Of Course : " + TypeOfCourse);
        return null;
    }

    static Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2", "Pournaki ", "22016", Calculus2Capacity, 4, 10.30, 12.30, "Saturday & Monday", 9, "1403/3/24", "Special Course");
    static Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics", "Ardeshir ", "22142", BasicsOfMathematicsCapacity, 4, 10.30, 12.30, "Sunday & Tuesday", 9, "1403/3/22", "Special Course");
    static Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations", "Qajar ", "22034", Differential_EquationsCapacity, 3, 9, 10.30, "Saturday & Monday", 15, "1403/3/22", "Special Course");


    public static void ShowMCourse() {


        System.out.println("These are Math Department Courses:");
        Calculus2.DisplayInfo();
        BasicsOfMathematics.DisplayInfo();
        Differential_Equations.DisplayInfo();


    }
}

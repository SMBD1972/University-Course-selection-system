package Course;

import java.util.Scanner;

public class Mechanical_Engineering {
    private String CourseName;
    private String ProfName;
    private int CourseCode;
    private int Capacity;
    private int numberOfCourse;
    private double ClassStartTime;
    private double ClassEndTime;
    private double ExamTime;
    private String TypeOfCourse;
    String ClaasDay;
    String ExamDay;
    public static int Thermodynamics2Capacity = 35;
    public static int StaticCapacity = 43;
    public static int ResistanceOfMaterials2Capacity = 37;

    public Mechanical_Engineering(String CourseName, String ProfName, int CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
        this.Capacity = Capacity;
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

    public void DisplayInfo() {
        System.out.println("CourseName : " + CourseName + " / " + "ProfName : " + ProfName + " / " + "Code Of Course : " + CourseCode + " / " + "Capacity : " + Capacity + " / " + "numberOfCourse : " + numberOfCourse + " / " + "time : From " + ClassStartTime + " to " + ClassEndTime + " at " + ClaasDay + " / " + "ExamTime : " + ExamTime + " in " + ExamDay + " / " + "Type Of Course : " + TypeOfCourse);
    }

    static Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2", "Saieedi", 28162, Thermodynamics2Capacity, 3, 9, 10.5, "Sunday & Tuesaday", 15.5, "1403/03/30", "Special Course");
    static Mechanical_Engineering Static = new Mechanical_Engineering("Static", "Mohammadi", 28261, StaticCapacity, 3, 13.5, 15, "Saturday & Monday ", 15.5, "1403/03/22", "Special Course");
    static Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2", "Movahedi", 28263, ResistanceOfMaterials2Capacity, 2, 10.5, 12.5, "Saturday", 9, "1403/03/26", "Special Course");

    public static void ShowMECourse() {
        System.out.println("These are Mechanical Engineering Department Courses:");
        Thermodynamics2.DisplayInfo();
        Static.DisplayInfo();
        ResistanceOfMaterials2.DisplayInfo();
    }
}

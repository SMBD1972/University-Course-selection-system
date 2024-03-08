package Course;

import java.util.Scanner;

public class Computer_Engineering {
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
    public static int Advance_ProgrammingCapacity = 200;
    public static int Logic_CircuitsCapacity = 95;
    public static int Discrete_StructuresCapacity = 200;

    public Computer_Engineering(String CourseName, String ProfName, int CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
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

    static Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming", "Fazli", 40244, Advance_ProgrammingCapacity, 3, 13.30, 15, "Sunday & Tuesday", 9, "1403/4/3", "Special Course");
    static Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits", "Hesabi", 40212, Logic_CircuitsCapacity, 3, 9, 10.30, "Sunday & Tuesday", 15, "1403/3/24", "Special Course");
    static Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures", "Zarabi Zadeh", 40115, Discrete_StructuresCapacity, 3, 10.30, 12, "Sunday & Tuesday", 9, "1403/3/22", "Special Course");

    public static void ShowCECourse() {

        System.out.println("These are Computer Engineering Department Courses:");
        Advance_Programming.DisplayInfo();
        Logic_Circuits.DisplayInfo();
        Discrete_Structures.DisplayInfo();
    }
}

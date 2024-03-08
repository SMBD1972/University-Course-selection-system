package Course;

import java.util.Scanner;

public class Electrical_Engineering {
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
    public static int ElectromagnetismCapacity = 38;
    public static int Electronics2Capacity = 70;
    public static int BasicsOfElectricalEngineering2Capacity = 33;

    public Electrical_Engineering(String CourseName, String ProfName, int CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
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

    static Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism", "Memarian", 25733, ElectromagnetismCapacity, 3, 9, 10.30, "Sunday & Tuesday", 15, "1403/3/29", "Special Course");
    static Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2", "Fakhar Zadeh", 25032, Electronics2Capacity, 3, 9.30, 10, "Sunday & Tuesday", 9, "1403/4/3", "Special Course");
    static Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2", "Vafaiee", 25093, BasicsOfElectricalEngineering2Capacity, 3, 16.30, 18, "Sunday & Tuesday", 15, "1403/4/3", "Special Course");

    public static void ShowEECourse() {

        System.out.println("These are Electrical Engineering Department Courses:");
        Electromagnetism.DisplayInfo();
        Electronics2.DisplayInfo();
        BasicsOfElectricalEngineering2.DisplayInfo();
    }
}

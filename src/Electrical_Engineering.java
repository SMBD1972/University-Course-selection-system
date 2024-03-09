import java.util.Scanner;

public class Electrical_Engineering {
    public String CourseName;
    public String ProfName;
    public String CourseCode;
    public int Capacity;
    public int numberOfCourse;
    public double ClassStartTime;
    public double ClassEndTime;
    public double ExamTime;
    public String TypeOfCourse;
    String ClaasDay;
    String ExamDay;
    public static int ElectromagnetismCapacity = 38;
    public static int Electronics2Capacity = 70;
    public static int BasicsOfElectricalEngineering2Capacity = 33;

    public Electrical_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
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
    public Electrical_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay) {
        this.Capacity = Capacity;
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.numberOfCourse = numberOfCourse;
        this.ClassStartTime = ClassSatrtTime;
        this.ClassEndTime = ClassEndTime;
        this.ExamTime = ExamTime;
        this.ProfName = ProfName;
        this.ClaasDay = ClassDay;
        this.ExamDay = ExamDay;
    }

    public void DisplayInfo() {
        System.out.println("CourseName : " + CourseName + " / " + "ProfName : " + ProfName + " / " + "Code Of Course : " + CourseCode + " / " + "Capacity : " + Capacity + " / " + "numberOfCourse : " + numberOfCourse + " / " + "time : From " + ClassStartTime + " to " + ClassEndTime + " at " + ClaasDay + " / " + "ExamTime : " + ExamTime + " in " + ExamDay + " / " + "Type Of Course : " + TypeOfCourse);
    }

    static Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism", "Memarian", "25733", ElectromagnetismCapacity, 3, 9, 10.30, "Sunday & Tuesday", 15, "1403/3/29", "Special Course");
    static Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2", "Fakhar Zadeh", "25032", Electronics2Capacity, 3, 9.30, 10, "Sunday & Tuesday", 9, "1403/4/3", "Special Course");
    static Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2", "Vafaiee", "25093", BasicsOfElectricalEngineering2Capacity, 3, 16.30, 18, "Sunday & Tuesday", 15, "1403/4/3", "Special Course");

    public static void ShowEECourse() {

        System.out.println("These are Electrical Engineering Department Courses:");
        Electromagnetism.DisplayInfo();
        Electronics2.DisplayInfo();
        BasicsOfElectricalEngineering2.DisplayInfo();
        for (int i = 0; i< Manager.ElectricalCourse.size(); i++) {
            Manager.ElectricalCourse.get(i).DisplayInfo();
        }
    }
    public static void DeleteElectromagnetismIncreaseCapacity(){
        Electromagnetism.Capacity++;
    }
    public static void DeleteElectronics2IncreaseCapacity(){
        Electronics2.Capacity++;
    }
    public static void DeleteBasicsOfElectricalEngineering2IncreaseCapacity(){
        BasicsOfElectricalEngineering2.Capacity++;
    }
    public static void AddElectromagnetismDecreaseCapacity(){
        Electromagnetism.Capacity--;
    }
    public static void AddElectronics2DecreaseCapacity(){
        Electronics2.Capacity--;
    }
    public static void AddBasicsOfElectricalEngineering2DecreaseCapacity(){
        BasicsOfElectricalEngineering2.Capacity--;
    }
    public static void IncreaseElectromagnetism(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Electromagnetism.Capacity+=a;
        System.out.println("The Capacity of Electromagnetism increased by " + a +". Now the capacity of Electromagnetism is " + Electromagnetism.Capacity);

    }
    public static void IncreaseAddCourseByAdmin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Manager.ElecClassMake.Capacity+=a;
        System.out.println("The Capacity of Electromagnetism increased by " + a +". Now the capacity of Electromagnetism is " + Manager.ElecClassMake.Capacity);

    }
    public static void IncreaseElectronics2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Electronics2.Capacity+=a;
        System.out.println("The Capacity of Electronics2 increased by " + a +". Now the capacity of Electronics2 is " + Electronics2.Capacity);

    }
    public static void IncreaseBasicsOfElectricalEngineering2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        BasicsOfElectricalEngineering2.Capacity+=a;
        System.out.println("The Capacity of BasicsOfElectricalEngineering2 increased by " + a +". Now the capacity of BasicsOfElectricalEngineering2 is " + BasicsOfElectricalEngineering2.Capacity);

    }



    public static int Electromagnetism(){

        return 220 ;
    }
    public static int Electronics2(){
        return 60;
    }
    public static int BasicsOfElectricalEngineering2(){
        return 200;
    }

    public static int CourseCapacityElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.Capacity;
    }
    public static int CourseCapacityElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 10 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.Capacity;
    }
    public static int CourseCapacityBasicsOfElectrical2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.Capacity;
    }
    public static double CourseExamTimeElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.ExamTime;

    }
    public static String CourseExamDayElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.ExamDay;
    }
    public static String CourseExamDayElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 10 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.ExamDay;
    }
    public static double CourseExamTimeElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 10 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.ExamTime;
    }
    public static double CourseExamTimeBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.ExamTime;

    }
    public static String CourseExamDayBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.ExamDay;
    }
    public static double CourseStartTimeElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.ClassStartTime;
    }
    public static double CourseEndTimeElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.ClassEndTime;
    }
    public static double CourseStartTimeElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 11 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.ClassStartTime;
    }
    public static double CourseEndTimeElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 11 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.ClassEndTime;
    }
    public static double CourseStartTimeBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30, 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.ClassStartTime;
    }
    public static double CourseEndTimeBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.ClassEndTime;
    }
    public static String ClassDayElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.ClaasDay;
    }
    public static String ClassDayElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 10 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.ClaasDay;
    }
    public static String ClassDayBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.ClaasDay;
    }
    public static int NumberOfCourseElectromagnetism(){
        Electrical_Engineering Electromagnetism = new Electrical_Engineering("Electromagnetism" , "Memarian" , "25733" , ElectromagnetismCapacity , 3 ,9 , 10.30  , "Sunday & Tuesday" , 15 , "1403/3/29" , "Special Course");
        return Electromagnetism.numberOfCourse;
    }
    public static int NumberOfCourseElectronics2(){
        Electrical_Engineering Electronics2 = new Electrical_Engineering("Electronics 2" , "Fakhar Zadeh" , "25032" , Electronics2Capacity , 3 ,9.30 , 10 , "Sunday & Tuesday" , 9 , "1403/4/3" ,"Special Course" );
        return Electronics2.numberOfCourse;
    }
    public static int NumberOfCourseBasicsOfElectricalEngineering2(){
        Electrical_Engineering BasicsOfElectricalEngineering2 = new Electrical_Engineering("Basics of electrical engineering 2" , "Vafaiee" , "25093" , BasicsOfElectricalEngineering2Capacity , 3 ,16.30 , 18 , "Sunday & Tuesday" , 15 , "1403/4/3" , "Special Course");
        return BasicsOfElectricalEngineering2.numberOfCourse;
    }
}

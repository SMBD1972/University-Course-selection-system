import java.util.Scanner;

public class Mechanical_Engineering {
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
    public static int Thermodynamics2Capacity = 35;
    public static int StaticCapacity = 43;
    public static int ResistanceOfMaterials2Capacity = 37;

    public Mechanical_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
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
    public Mechanical_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay) {
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

    static Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2", "Saieedi", "28162", Thermodynamics2Capacity, 3, 9, 10.5, "Sunday & Tuesaday", 15.5, "1403/03/30", "Special Course");
    static Mechanical_Engineering Static = new Mechanical_Engineering("Static", "Mohammadi", "28261", StaticCapacity, 3, 13.5, 15, "Saturday & Monday ", 15.5, "1403/03/22", "Special Course");
    static Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2", "Movahedi", "28263", ResistanceOfMaterials2Capacity, 2, 10.5, 12.5, "Saturday", 9, "1403/03/26", "Special Course");

    public static void ShowMECourse() {
        System.out.println("These are Mechanical Engineering Department Courses:");
        Thermodynamics2.DisplayInfo();
        Static.DisplayInfo();
        ResistanceOfMaterials2.DisplayInfo();
//        PublicCourseMechanical_Engineering.
        for (int i = 0; i< Manager.MechanicCourse.size(); i++) {
            Manager.MechanicCourse.get(i).DisplayInfo();
        }
    }
    public static void DeleteThermodynamics2IncreaseCapacity(){
        Thermodynamics2.Capacity++;
    }
    public static void DeleteStaticIncreaseCapacity(){
        Static.Capacity++;
    }
    public static void DeleteResistanceOfMaterials2IncreaseCapacity(){
        ResistanceOfMaterials2.Capacity++;
    }
    public static void AddThermodynamics2DecreaseCapacity(){
        Thermodynamics2.Capacity--;
    }
    public static void AddStaticDecreaseCapacity(){
        Static.Capacity--;
    }
    public static void AddResistanceOfMaterials2DecreaseCapacity(){
        ResistanceOfMaterials2.Capacity--;
    }
    public static void IncreaseThermodynamics2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Thermodynamics2.Capacity+=a;
        System.out.println("The Capacity of Thermodynamics2 increased by " + a +". Now the capacity of Thermodynamics2 is " + Thermodynamics2.Capacity);

    }
    public static void IncreaseAddCourseByAdmin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Manager.MechClassMake.Capacity+=a;
        System.out.println("The Capacity of Thermodynamics2 increased by " + a +". Now the capacity of Thermodynamics2 is " + Manager.MechClassMake.Capacity);

    }
    public static void IncreaseStatic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Static.Capacity+=a;
        System.out.println("The Capacity of Static increased by " + a +". Now the capacity of Static is " + Static.Capacity);

    }
    public static void IncreaseBasicsOfElectricalEngineering2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        ResistanceOfMaterials2.Capacity+=a;
        System.out.println("The Capacity of ResistanceOfMaterials2 increased by " + a +". Now the capacity of ResistanceOfMaterials2 is " + ResistanceOfMaterials2.Capacity);

    }



    public static int Thermodynamics2(){

        return 220 ;
    }
    public static int Static(){
        return 60;
    }
    public static int ResistanceOfMaterials2(){
        return 200;
    }
    public static int CourseCapacityThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.Capacity;
    }
    public static int CourseCapacityStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.Capacity;
    }
    public static int CourseCapacityResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.Capacity;
    }
    public static double CourseExamTimeThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.ExamTime;

    }
    public static String CourseExamDayThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.ExamDay;
    }
    public static String CourseExamDayStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.ExamDay;
    }
    public static double CourseExamTimeStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.ExamTime;
    }
    public static double CourseExamTimeResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.ExamTime;

    }
    public static String CourseExamDayResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.ExamDay;
    }
    public static double CourseStartTimeThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.ClassStartTime;
    }
    public static double CourseEndTimeThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.ClassEndTime;
    }
    public static double CourseStartTimeStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.ClassStartTime;
    }
    public static double CourseEndTimeStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.ClassEndTime;
    }
    public static double CourseStartTimeResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.ClassStartTime;
    }
    public static double CourseEndTimeResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.ClassEndTime;
    }
    public static String ClassDayThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.ClaasDay;
    }
    public static String ClassDayStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.ClaasDay;
    }
    public static String ClassDayResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.ClaasDay;
    }
    public static int NumberOfCourseThermodynamics2(){
        Mechanical_Engineering Thermodynamics2 = new Mechanical_Engineering("Thermodynamics 2" , "Saieedi" , "28162" , Thermodynamics2Capacity , 3 ,9 , 10.5 , "Sunday & Tuesaday" , 15.5, "1403/03/30" , "Special Course" );
        return Thermodynamics2.numberOfCourse;
    }
    public static int NumberOfCourseStatic(){
        Mechanical_Engineering Static = new Mechanical_Engineering("Static" , "Mohammadi" , "28261" , StaticCapacity , 3 ,13.5 , 15 , "Saturday & Monday " , 15.5 , "1403/03/22" , "Special Course");
        return Static.numberOfCourse;
    }
    public static int NumberOfCourseResistanceOfMaterials2(){
        Mechanical_Engineering ResistanceOfMaterials2 = new Mechanical_Engineering("Resistance of materials 2" , "Movahedi" , "28263" , ResistanceOfMaterials2Capacity , 2 ,10.5 , 12.5 , "Saturday" , 9 , "1403/03/26" , "Special Course");
        return ResistanceOfMaterials2.numberOfCourse;
    }
}

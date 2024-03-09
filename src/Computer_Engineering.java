import java.util.ArrayList;
import java.util.Scanner;

public class Computer_Engineering {
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
    public static int Advance_ProgrammingCapacity = 200;
    public static int Logic_CircuitsCapacity = 95;
    public static int Discrete_StructuresCapacity = 200;
    ArrayList<Computer_Engineering> ComputerCourse = new ArrayList<Computer_Engineering>();


    public Computer_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
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
    public Computer_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay) {
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

    static Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming", "Fazli", "40244", Advance_ProgrammingCapacity, 3, 13.30, 15, "Sunday & Tuesday", 9, "1403/4/3", "Special Course");
    static Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits", "Hesabi", "40212", Logic_CircuitsCapacity, 3, 9, 10.30, "Sunday & Tuesday", 15, "1403/3/24", "Special Course");
    static Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures", "Zarabi Zadeh", "40115", Discrete_StructuresCapacity, 3, 10.30, 12, "Sunday & Tuesday", 9, "1403/3/22", "Special Course");

    public static void ShowCECourse() {

        System.out.println("These are Computer Engineering Department Courses:");
        Advance_Programming.DisplayInfo();
        Logic_Circuits.DisplayInfo();
        Discrete_Structures.DisplayInfo();
        for (int i = 0 ; i<Manager.ComputerCourse.size();i++) {
            Manager.ComputerCourse.get(i).DisplayInfo();
        }
    }
    public static void DeleteAdvance_ProgrammingIncreaseCapacity(){
        Advance_Programming.Capacity++;
    }
    public static void DeleteLogic_CircuitsIncreaseCapacity(){
        Logic_Circuits.Capacity++;
    }
    public static void DeleteDiscrete_StructuresIncreaseCapacity(){
        Discrete_Structures.Capacity++;
    }
    public static void AddAdvance_ProgrammingDecreaseCapacity(){
        Advance_Programming.Capacity--;
    }
    public  static void AddLogic_CircuitsDecreaseCapacity(){
        Logic_Circuits.Capacity--;
    }
    public  static void AddDiscrete_StructuresDecreaseCapacity(){
        Discrete_Structures.Capacity--;
    }
    public static void IncreaseAdvance_Programming(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Advance_Programming.Capacity+=a;
        System.out.println("The Capacity of Advance_Programming increased by " + a +". Now the capacity of Advance_Programming is " + Advance_Programming.Capacity);

    }
    public static void IncreaseLogic_Circuits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Logic_Circuits.Capacity+=a;
        System.out.println("The Capacity of Logic_Circuits increased by " + a +". Now the capacity of Logic_Circuits is " + Logic_Circuits.Capacity);

    }
    public static void IncreaseDiscrete_Structures(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Discrete_Structures.Capacity+=a;
        System.out.println("The Capacity of Discrete_Structures increased by " + a +". Now the capacity of Discrete_Structures is " + Discrete_Structures.Capacity);

    }
    public static void IncreaseAddCourseByAdmin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Manager.ComClassMake.Capacity+=a;
        System.out.println("The Capacity of Discrete_Structures increased by " + a +". Now the capacity of Discrete_Structures is " + Manager.ComClassMake.Capacity);

    }




    public static int Advance_Programming(){

        return 220 ;
    }
    public static int Logic_Circuits(){
        return 60;
    }
    public static int Discrete_Structures(){
        return 200;
    }
    public static int CourseCapacityAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");

        return Advance_Programming.Capacity;
    }
    public static int CourseCapacityLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.Capacity;
    }
    public static int CourseCapacityDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.Capacity;
    }
    public static double CourseExamTimeAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.ExamTime;

    }
    public static String CourseExamDayAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.ExamDay;
    }
    public static String CourseExamDayLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.ExamDay;
    }
    public static double CourseExamTimeLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.ExamTime;
    }
    public static double CourseExamTimeDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.ExamTime;

    }
    public static String CourseExamDayDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.ExamDay;
    }
    public static double CourseStartTimeAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.ClassStartTime;
    }
    public static double CourseEndTimeAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.ClassEndTime;
    }
    public static double CourseStartTimeLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.ClassStartTime;
    }
    public static double CourseEndTimeLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.ClassEndTime;
    }
    public static double CourseStartTimeDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.ClassStartTime;
    }
    public static double CourseEndTimeDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.ClassEndTime;
    }
    public static String ClassDayAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.ClaasDay;
    }
    public static String ClassDayLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.ClaasDay;
    }
    public static String ClassDayDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.ClaasDay;
    }

    public static int NumberOfCourseAdvance_Programming(){
        Computer_Engineering Advance_Programming = new Computer_Engineering("Advance Programming" , "Fazli" , "40244" , Advance_ProgrammingCapacity , 3 ,13.30 , 15 , "Sunday & Tuesday" , 9 , "1403/4/3" , "Special Course");
        return Advance_Programming.numberOfCourse;
    }
    public static int NumberOfCourseLogic_Circuits(){
        Computer_Engineering Logic_Circuits = new Computer_Engineering("Logic Circuits" , "Hesabi" , "40212" , Logic_CircuitsCapacity , 3 ,9 , 10.30 , "Sunday & Tuesday" , 15 , "1403/3/24" , "Special Course");
        return Logic_Circuits.numberOfCourse;

    }
    public static int NumberOfCourseDiscrete_Structures(){
        Computer_Engineering Discrete_Structures = new Computer_Engineering("discrete Structures" , "Zarabi Zadeh" , "40115" , Discrete_StructuresCapacity , 3 ,10.30 , 12 , "Sunday & Tuesday" , 9 , "1403/3/22" , "Special Course");
        return Discrete_Structures.numberOfCourse;
    }
}

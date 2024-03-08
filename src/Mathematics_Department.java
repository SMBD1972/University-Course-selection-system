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
    public static void DeleteCalculus2IncreaseCapacity(){
        Calculus2.Capacity++;
    }
    public static void DeleteBasicsOfMathematicsIncreaseCapacity(){
        BasicsOfMathematics.Capacity++;
    }
    public static void DeleteDifferential_EquationsIncreaseCapacity(){
        Differential_Equations.Capacity++;
    }
    public static void AddCalculus2DecreaseCapacity(){
        Calculus2.Capacity--;
    }
    public static void AddBasicsOfMathematicsDecreaseCapacity(){
        BasicsOfMathematics.Capacity--;
    }
    public static void AddDifferential_EquationsDecreaseCapacity(){
        Differential_Equations.Capacity--;
    }
    public static void IncreaseCalculus2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Calculus2.Capacity+=a;
        System.out.println("The Capacity of Calculus2 increased by " + a +". Now the capacity of Calculus2 is " + Calculus2.Capacity);

    }
    public static void IncreaseBasicsOfMathematics(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        BasicsOfMathematics.Capacity+=a;
        System.out.println("The Capacity of BasicsOfMathematics increased by " + a +". Now the capacity of BasicsOfMathematics is " + BasicsOfMathematics.Capacity);

    }
    public static void IncreaseDifferential_Equations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much do you want to increase the capacity ? ");
        int a = sc.nextInt();
        Differential_Equations.Capacity+=a;
        System.out.println("The Capacity of Differential_Equations increased by " + a +". Now the capacity of Differential_Equations is " + Differential_Equations.Capacity);

    }



    public static int Calculus2Capacity(){

        return 220 ;
    }
    public static int BasicsOfMathematicsCapacity(){
        return 60;
    }
    public static int Differential_Equations(){
        return 200;
    }
    public static int CourseCapacityCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.Capacity;
    }
    public static int CourseCapacityBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.Capacity;
    }
    public static int CourseCapacityDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.Capacity;
    }
    public static double CourseStartTimeCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.ClassStartTime ;

    }
    public static double CourseEndTimeCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.ClassEndTime;
    }
    public static double CourseStartTimeBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.ClassStartTime;
    }
    public static double CourseEndTimeBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.ClassEndTime;
    }
    public static double CourseStartTimeDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.ClassStartTime;
    }
    public static double CourseEndTimeDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.ClassEndTime;
    }
    public static String ClassDayCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.ClaasDay;
    }
    public static String ClassDayBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.ClaasDay;
    }
    public static String ClassDayDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.ClaasDay;
    }
    public static double CourseExamTimeCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.ExamTime;

    }
    public static String CourseExamDayBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.ExamDay;
    }
    public static String CourseExamDayCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.ExamDay;
    }
    public static double CourseExamTimeBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.ExamTime;
    }
    public static double CourseExamTimeDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.ExamTime;

    }
    public static String CourseExamDayDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.ExamDay;
    }






    public static String CourseCodeCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.CourseCode;
    }
    public static String CourseCodeBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.CourseCode;
    }
    public static String CpurseCodeDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.CourseCode;
    }
    public static int NumberOfCourseCalculus2(){
        Mathematics_Department Calculus2 = new Mathematics_Department("Calculus2" , "Pournaki " , "22016" , Calculus2Capacity , 4 ,10.30 , 12.30 , "Saturday & Monday" , 9 , "1403/3/24" , "Special Course");
        return Calculus2.numberOfCourse;

    }
    public static int NumberOfCourseBasicsOfMathematics(){
        Mathematics_Department BasicsOfMathematics = new Mathematics_Department("Basics Of Mathematics" , "Ardeshir " , "22142" , BasicsOfMathematicsCapacity , 4 ,10.30 , 12.30 , "Sunday & Tuesday" , 9 , "1403/3/22" ,"Special Course" );
        return BasicsOfMathematics.numberOfCourse;

    }
    public static int NumberOfCourseDifferential_Equations(){
        Mathematics_Department Differential_Equations = new Mathematics_Department("Differential Equations" , "Qajar " , "22034" , Differential_EquationsCapacity , 3 ,9 , 10.30 , "Saturday & Monday" , 15 , "1403/3/22" , "Special Course");
        return Differential_Equations.numberOfCourse;

    }

}

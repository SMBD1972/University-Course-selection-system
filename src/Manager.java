import java.util.*;

public class Manager {
    public static Mathematics_Department ClassMake ;
    public static Computer_Engineering ComClassMake;
    public static Electrical_Engineering ElecClassMake;
    public static Mechanical_Engineering MechClassMake;
    public static ArrayList<Mathematics_Department> MathCourse = new ArrayList<Mathematics_Department>();
    public static ArrayList<Computer_Engineering> ComputerCourse = new ArrayList<Computer_Engineering>();
    public static ArrayList<Electrical_Engineering> ElectricalCourse = new ArrayList<Electrical_Engineering>();
    public static ArrayList<Mechanical_Engineering> MechanicCourse = new ArrayList<Mechanical_Engineering>();




    static boolean ok = true;
    static boolean yes = true;

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


    public static void back() {
        ok = true;
    }


    public static void enter() {
        int StudentSumNumberOfCourse = 0;


//        int studentIDInput;
        String FullNameInput;
        ArrayList<String> StudentCourses = new ArrayList<String>();
        ArrayList<Double> CourseStarTimeArray = new ArrayList<Double>();
        ArrayList<Double> CourseEndTimeArray = new ArrayList<Double>();
        ArrayList<String> CourseDayArray = new ArrayList<String>();
        ArrayList<String> CourseExamDayArray = new ArrayList<String>();
        ArrayList<Double> CourseExamTimeArray = new ArrayList<Double>();
        int Calculus2Capacity = Mathematics_Department.CourseCapacityCalculus2();
        int BasicMathCapacity = Mathematics_Department.CourseCapacityBasicsOfMathematics();
        int Differential_EquationsCapacity = Mathematics_Department.CourseCapacityDifferential_Equations();
        int ApCapacity = Computer_Engineering.CourseCapacityAdvance_Programming();
        int Logic_CircuitsCapacity = Computer_Engineering.CourseCapacityLogic_Circuits();
        int Discrete_StructuresCapacity = Computer_Engineering.CourseCapacityDiscrete_Structures();
        int Electronics2Capacity = Electrical_Engineering.CourseCapacityElectronics2();
        int ElectromagnetismCapacity = Electrical_Engineering.CourseCapacityElectromagnetism();
        int BasicsOfElectrical2_Capacity = Electrical_Engineering.CourseCapacityBasicsOfElectrical2();
        int Thermodynamics2Capacity = Mechanical_Engineering.CourseCapacityThermodynamics2();
        int StaticCapacity = Mechanical_Engineering.CourseCapacityStatic();
        int ResistanceOfMaterials2Capacity = Mechanical_Engineering.CourseCapacityResistanceOfMaterials2();
        ArrayList<String> NameOfStudentInCourseCalculus2 = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseCalculus2 = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseBasicMath = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseBasicMath = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseDifferential_Equations = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseCDifferential_Equations = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseAP = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseAP = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseLogic_Circuits = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseLogic_Circuits = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseDiscrete_Structures = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseDiscrete_Structures = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseElectronics2 = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseElectronics2 = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseElectromagnetism = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseElectromagnetism = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseBasicsOfElectrical2 = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseBasicsOfElectrical2 = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseThermodynamics2 = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseThermodynamics2 = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseStatic = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseStatic = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseResistanceOfMaterials2 = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseResistanceOfMaterials2 = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseMathClassMAke = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseMathClassMake = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseComClassMake = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseComClassMake = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseElecMakeClass = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseElecMakeClass = new ArrayList<String>();
        ArrayList<String> NameOfStudentInCourseMechMakeClass = new ArrayList<String>();
        ArrayList<String> IdOfStudentInCourseMechMakeClass = new ArrayList<String>();



        boolean newYes = true;
        boolean Akbar=true;
        String StudentId = "402170092";
        String FullName = "SamanBadiee";
        do {


//        CourseStarTimeArray.add(null);
            do {


                Scanner sc = new Scanner(System.in);
                Random Question = new Random();
                boolean newOk = true;
                Boolean Asghar = true;
                Boolean TrueAnswerBack1 = true;
//            boolean newYes = true;
                do {
                    try {
                        System.out.println("Please choose your role  ");
                        System.out.println("1 : Admin");
                        System.out.println("2 : Student");
                        String role = sc.next();
                        if (role.equals("Admin") || role.equals("1")) {
                            System.out.println("Your role is Admin");
                            String AdminPassword = "138383";
                            String AdminUsername = "AdminSharif";
//                    Scanner sc = new Scanner(System.in);
//                    Random Question = new Random();
                            do {
                                do {
                                    try {
                                        System.out.println("Please enter your Username: ");
                                        String NewAdminUsername = sc.next();
                                        if (NewAdminUsername.equals(AdminUsername)) {
                                            System.out.println("True");
                                                System.out.println("Please enter your Password : ");
                                                String NewAdminPass = sc.next();
                                                if (NewAdminPass.equals(AdminPassword)) {
                                                    System.out.println("True");
                                                    Random dd = new Random();
                                                    int FirstNumber = dd.nextInt(10);
                                                    int SecondNumber = dd.nextInt(10);
                                                    System.out.println("Please Write a True answer to show that you are not bot !!");
                                                    System.out.println(FirstNumber + " + " + SecondNumber + " = ");
                                                    int TrueAnswer = sc.nextInt();
                                                    if (TrueAnswer == FirstNumber + SecondNumber) {
                                                        System.out.println("     #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#   ");
                                                        System.out.println("                    Welcome                  ");
                                                        System.out.println("     #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#   ");
                                                        boolean Add = true;



                                                        do {

                                                                System.out.println("             Main Menu              ");
                                                                System.out.println("1 : Add new Course for department");
                                                                System.out.println("2 : Increasing the capacity of courses");
                                                                System.out.println("3 : Add or Delete Student from Course : ");
                                                                System.out.println("4 : Show students enrolled in courses : ");
                                                                System.out.println("5 : Shows Department Courses");
                                                                sc.nextLine();
                                                                String NextAnswer = sc.nextLine();
                                                            if (NextAnswer.equals("Add new Course for department") || NextAnswer.equals("1")) {
                                                                System.out.println("You want to add new course for department. Please wait...");
                                                                System.out.println("Please choose a Department that you want to add course :  ");
                                                                System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                                String NewChooseDepartment = sc.next();
                                                                if (NewChooseDepartment.equals("Mathematics") || NewChooseDepartment.equals("1")) {
                                                                    System.out.println("Please enter name of the course :");
                                                                    courseNameNew = sc.next();
                                                                    System.out.println("Please enter name of the Professor: ");
                                                                    profNameNew = sc.next();
                                                                    System.out.println("Please enter code of course :");
                                                                    courseCodeNew = sc.next();
                                                                    System.out.println("Please enter Capacity : ");
                                                                    capacityNew = sc.nextInt();
                                                                    System.out.println("Please enter number of course : ");
                                                                    courseNumberNew = sc.nextInt();
                                                                    System.out.println("Please enter Class Start time : ");
                                                                    startTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter Class end time : ");
                                                                    endTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter day of the Class : ");
                                                                    classDayNew = sc.next();
                                                                    System.out.println("Please enter the time of exam : ");
                                                                    examTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter the day of exam : ");
                                                                    examDayNew = sc.next();
                                                                    System.out.println("Please enter the Course Type : ");
                                                                    courseTypeNew = sc.next();
                                                                     ClassMake = new Mathematics_Department(courseNameNew , profNameNew ,courseCodeNew , capacityNew , courseNumberNew , startTimeNew , endTimeNew , classDayNew , examTimeNew , examDayNew , courseTypeNew);

                                                                    MathCourse.add(ClassMake);
                                                                    System.out.println("New Course make successfully !! ");
                                                                } else if (NewChooseDepartment.equals("Computer Engineering") || NewChooseDepartment.equals("2")) {
                                                                    System.out.println("Please enter name of the course :");
                                                                    courseNameNew = sc.next();
                                                                    System.out.println("Please enter name of the Professor: ");
                                                                    profNameNew = sc.next();
                                                                    System.out.println("Please enter code of course :");
                                                                    courseCodeNew = sc.next();
                                                                    System.out.println("Please enter Capacity : ");
                                                                    capacityNew = sc.nextInt();
                                                                    System.out.println("Please enter number of course : ");
                                                                    courseNumberNew = sc.nextInt();
                                                                    System.out.println("Please enter Class Start time : ");
                                                                    startTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter Class end time : ");
                                                                    endTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter day of the Class : ");
                                                                    classDayNew = sc.next();
                                                                    System.out.println("Please enter the time of exam : ");
                                                                    examTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter the day of exam : ");
                                                                    examDayNew = sc.next();
                                                                    System.out.println("Please enter the Course Type : ");
                                                                    courseTypeNew = sc.next();

                                                                    ComClassMake = new Computer_Engineering(courseNameNew , profNameNew ,courseCodeNew , capacityNew , courseNumberNew , startTimeNew , endTimeNew , classDayNew , examTimeNew , examDayNew , courseTypeNew);
                                                                    System.out.println("New Course make successfully !! ");
                                                                    ComputerCourse.add(ComClassMake);

                                                                } else if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                                                    System.out.println("Please enter name of the course :");
                                                                    courseNameNew = sc.next();
                                                                    System.out.println("Please enter name of the Professor: ");
                                                                    profNameNew = sc.next();
                                                                    System.out.println("Please enter code of course :");
                                                                    courseCodeNew = sc.next();
                                                                    System.out.println("Please enter Capacity : ");
                                                                    capacityNew = sc.nextInt();
                                                                    System.out.println("Please enter number of course : ");
                                                                    courseNumberNew = sc.nextInt();
                                                                    System.out.println("Please enter Class Start time : ");
                                                                    startTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter Class end time : ");
                                                                    endTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter day of the Class : ");
                                                                    classDayNew = sc.next();
                                                                    System.out.println("Please enter the time of exam : ");
                                                                    examTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter the day of exam : ");
                                                                    examDayNew = sc.next();
                                                                    System.out.println("Please enter the Course Type : ");
                                                                    courseTypeNew = sc.next();
                                                                    ElecClassMake = new Electrical_Engineering(courseNameNew , profNameNew ,courseCodeNew , capacityNew , courseNumberNew , startTimeNew , endTimeNew , classDayNew , examTimeNew , examDayNew , courseTypeNew);
                                                                    System.out.println("New Course make successfully !! ");
                                                                    ElectricalCourse.add(ElecClassMake);

                                                                } else if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                                                    System.out.println("Please enter name of the course :");
                                                                    courseNameNew = sc.next();
                                                                    System.out.println("Please enter name of the Professor: ");
                                                                    profNameNew = sc.next();
                                                                    System.out.println("Please enter code of course :");
                                                                    courseCodeNew = sc.next();
                                                                    System.out.println("Please enter Capacity : ");
                                                                    capacityNew = sc.nextInt();
                                                                    System.out.println("Please enter number of course : ");
                                                                    courseNumberNew = sc.nextInt();
                                                                    System.out.println("Please enter Class Start time : ");
                                                                    startTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter Class end time : ");
                                                                    endTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter day of the Class : ");
                                                                    classDayNew = sc.next();
                                                                    System.out.println("Please enter the time of exam : ");
                                                                    examTimeNew = sc.nextDouble();
                                                                    System.out.println("Please enter the day of exam : ");
                                                                    examDayNew = sc.next();
                                                                    System.out.println("Please enter the Course Type : ");
                                                                    courseTypeNew = sc.next();
                                                                    MechClassMake = new Mechanical_Engineering(courseNameNew , profNameNew ,courseCodeNew , capacityNew , courseNumberNew , startTimeNew , endTimeNew , classDayNew , examTimeNew , examDayNew , courseTypeNew);
                                                                    System.out.println("New Course make successfully !! ");
                                                                    MechanicCourse.add(MechClassMake);

                                                                } else {
                                                                    System.out.println("Your input is not valid.Please try again !! ");
                                                                    newOk = true;
                                                                }

                                                            }
                                                        else if (NextAnswer.equals("Increasing the capacity of courses") || NextAnswer.equals("2")) {
                                                                boolean Hey = true;
                                                                do {
                                                                    System.out.println("YOu want to Increasing the capacity of courses . Please wait...");
                                                                    System.out.println("Please choose a Department :  ");
                                                                    System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                                    String NewChooseDepartment = sc.next();
                                                                    if (NewChooseDepartment.equals("Mathematics") || NewChooseDepartment.equals("1")) {
                                                                        Mathematics_Department.ShowMCourse();
                                                                        System.out.println("Choose Course : ");
                                                                        sc.nextLine();
                                                                        String ChooseCourse = sc.nextLine();
                                                                        if (ChooseCourse.equals("Calculus2") || ChooseCourse.equals(Mathematics_Department.CourseCodeCalculus2())) {
                                                                            Hey=false;

                                                                            Mathematics_Department.IncreaseCalculus2();
//                                            System.out.println("");
//                                            Mathematics_Department.IncreaseCapacityCalculus2();
//                                            Mathematics_Department.ShowMCourse();
//                                            CapacityCalculus2.add(0,240);

                                                                        } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals(Mathematics_Department.CourseCodeBasicsOfMathematics())) {
                                                                            Hey=false;

//                                            System.out.println("How much ?");
//                                            int a = sc.nextInt();
//                                            Mathematics_Department.IncreaseCapacityBasicsOfMathematics(a);                                                                            Hey=false;
//                                            Mathematics_Department.ShowMCourse();
                                                                            Mathematics_Department.IncreaseBasicsOfMathematics();

                                                                        } else if (ChooseCourse.equals("Differential_Equations") || ChooseCourse.equals(Mathematics_Department.CpurseCodeDifferential_Equations())) {
                                                                            Hey=false;

                                                                            Mathematics_Department.IncreaseDifferential_Equations();


                                                                        }else if (ChooseCourse.equals(ClassMake.CourseName)){
                                                                            Mathematics_Department.IncreaseAddCourseByAdmin();
                                                                            Hey=false;

                                                                        }
                                                                        else if (ChooseCourse.equals("Back")) {
                                                                            Hey=true;
//                                                                            newYes = false;
//                                                                            newOk = false;
                                                                            Asghar=false;
//                                                                            Add=false;
                                                                            break;

                                                                        }
                                                                    } else if (NewChooseDepartment.equals("Computer Engineering") || NewChooseDepartment.equals("2")) {
                                                                        Computer_Engineering.ShowCECourse();
                                                                        System.out.println("Choose Course : ");
                                                                        sc.nextLine();
                                                                        String ChooseCourse = sc.nextLine();
                                                                        if (ChooseCourse.equals("Advance_Programming") || ChooseCourse.equals("40244")) {
                                                                            Hey=false;

                                                                            Computer_Engineering.IncreaseAdvance_Programming();
                                                                        } else if (ChooseCourse.equals("LogicCircuits") || ChooseCourse.equals("40212")) {
                                                                            Hey=false;

                                                                            Computer_Engineering.IncreaseLogic_Circuits();
                                                                        } else if (ChooseCourse.equals("DiscreteStructures") || ChooseCourse.equals("40115")) {
                                                                            Hey=false;

                                                                            Computer_Engineering.IncreaseDiscrete_Structures();
                                                                        }
                                                                        else if (ChooseCourse.equals(ComClassMake.CourseName)){
                                                                            Computer_Engineering.IncreaseAddCourseByAdmin();
                                                                            Hey=false;

                                                                        }
                                                                        else if (ChooseCourse.equals("Back")) {
                                                                            Hey=true;
//                                                                            newYes = false;
//                                                                            newOk = false;
                                                                            Asghar=false;
//                                                                            Add=false;
                                                                            break;

                                                                        }


                                                                    } else if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                                                        Electrical_Engineering.ShowEECourse();
                                                                        System.out.println("Choose Course : ");
                                                                        sc.nextLine();
                                                                        String ChooseCourse = sc.nextLine();
                                                                        if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                                            Hey=false;

                                                                            Electrical_Engineering.IncreaseElectromagnetism();

                                                                        } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                                            Hey=false;

                                                                            Electrical_Engineering.IncreaseElectronics2();
                                                                        } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                                            Hey=false;

                                                                            Electrical_Engineering.IncreaseBasicsOfElectricalEngineering2();
                                                                        }
                                                                        else if (ChooseCourse.equals(ElecClassMake.CourseName)){
                                                                            Hey=false;
                                                                            Electrical_Engineering.IncreaseAddCourseByAdmin();
                                                                        }
                                                                        else if (ChooseCourse.equals("Back")) {
                                                                            Hey=true;
//                                                                            newYes = false;
//                                                                            newOk = false;
                                                                            Asghar=false;
//                                                                            Add=false;
                                                                            break;

                                                                        }

                                                                    } else if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                                                        Mechanical_Engineering.ShowMECourse();
                                                                        System.out.println("Choose Course : ");
                                                                        sc.nextLine();
                                                                        String ChooseCourse = sc.nextLine();
                                                                        if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                                            Hey=false;
                                                                            Mechanical_Engineering.IncreaseThermodynamics2();
                                                                        } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                                            Hey=false;

                                                                            Mechanical_Engineering.IncreaseStatic();
                                                                        } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                                            Hey=false;

                                                                            Mechanical_Engineering.IncreaseBasicsOfElectricalEngineering2();
                                                                        }
                                                                        else if (ChooseCourse.equals(MechClassMake.CourseName)){
                                                                            Hey=false;
                                                                            Mechanical_Engineering.IncreaseAddCourseByAdmin();
                                                                        }
                                                                        else if (ChooseCourse.equals("Back")) {
                                                                            Hey=true;
//                                                                            newYes = false;
//                                                                            newOk = false;
                                                                            Asghar=false;
//                                                                            Add=false;
                                                                            break;

                                                                        }

                                                                    }
                                                                    else {
                                                                        Asghar=false;
                                                                        break;
                                                                    }
                                                                }while (Hey);
                                                            } else if (NextAnswer.equals("Add or Delete Student from Course") || NextAnswer.equals("3")) {
                                                                boolean Gof = true;
                                                                do {

                                                                    System.out.println("What do you want to do ?");
                                                                    System.out.println("1 : Add Student");
                                                                    System.out.println("2 : Delete Student");
                                                                    String ToDO = sc.next();
                                                                    if (ToDO.equals("Add Student") || ToDO.equals("1")) {
                                                                        boolean Addy = true;
                                                                        do {
                                                                            System.out.println("Please enter student's StudentId : ");
                                                                            String StudentIDEnter = sc.next();
                                                                            if (StudentIDEnter.equals("402170092")) {
                                                                                System.out.println("Add Student to which Department ? ");
                                                                                System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                                                String ChooseDepartment = sc.next();
                                                                                if (ChooseDepartment.equals("Mathematics") || ChooseDepartment.equals("1")) {
                                                                                    boolean Hey = true;
                                                                                    do {
                                                                                        Addy = false;
                                                                                        Mathematics_Department.ShowMCourse();
                                                                                        System.out.println("Add to Which Course ?");
                                                                                        sc.nextLine();
                                                                                        String ChooseCourse = sc.nextLine();
                                                                                        if (ChooseCourse.equals("Calculus2") || ChooseCourse.equals(Mathematics_Department.CourseCodeCalculus2())) {
                                                                                            Hey = false;
                                                                                            Gof=false;
                                                                                            boolean rabbit = true;
                                                                                            if ((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeCalculus2())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeCalculus2())))
                                                                                                    && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeCalculus2())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayCalculus2())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {

                                                                                                if (StudentCourses.contains("Calculus2")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (rabbit) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseCalculus2()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                                                            StudentCourses.add("Calculus2");
                                                                                                            Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                                                            NameOfStudentInCourseCalculus2.add(FullName);
                                                                                                            IdOfStudentInCourseCalculus2.add(StudentId);

                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                                                            Calculus2Capacity -= 1;
                                                                                                            System.out.println("Calculus2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            rabbit = false;
                                                                                                            break;

                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) {
                                                                                                            System.out.println("You are not able to Add course cause of Class time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                                                            StudentCourses.add("Calculus2");
                                                                                                            NameOfStudentInCourseCalculus2.add(FullName);
                                                                                                            IdOfStudentInCourseCalculus2.add(StudentId);
                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                                                            Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                                                            Calculus2Capacity -= 1;
                                                                                                            System.out.println("Calculus2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            rabbit = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals("22142")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean goat = true;
                                                                                            if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeBasicsOfMathematics())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeBasicsOfMathematics())))
                                                                                                    && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeBasicsOfMathematics())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayBasicsOfMathematics())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("BasicsOfMathematics")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (goat) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseBasicsOfMathematics()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                                                            StudentCourses.add("BasicsOfMathematics");
                                                                                                            Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                                                            BasicMathCapacity -= 1;
                                                                                                            NameOfStudentInCourseBasicMath.add(FullName);
                                                                                                            IdOfStudentInCourseBasicMath.add(StudentId);
                                                                                                            System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            goat = true;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics())) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics()))) && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                                                            StudentCourses.add("BasicsOfMathematics");
                                                                                                            Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                                                            System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                                                            BasicMathCapacity -= 1;
                                                                                                            NameOfStudentInCourseBasicMath.add(FullName);
                                                                                                            IdOfStudentInCourseBasicMath.add(StudentId);
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            goat = true;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (ChooseCourse.equals("Differential_Equations") || ChooseCourse.equals("22034")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean zebra = true;
                                                                                            if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                                                    && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("DifferentialEquations")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (zebra) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseDifferential_Equations() > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                                                            StudentCourses.add("DifferentialEquations");
                                                                                                            NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                                                            IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                                                            Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                                                            System.out.println("Differential Equations added to your courses successfully !!");
                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                                                            CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                                                            CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                                                            CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                                                            CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                                                            StudentCourses.add("DifferentialEquations");
                                                                                                            Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                                                            IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                                                            System.out.println("Differential Equations added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                        }
                                                                                        else if (ChooseCourse.equals(ClassMake.CourseName)||ChooseCourse.equals(ClassMake.CourseCode)){
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean zebra = true;
                                                                                            if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                                                    && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains(ClassMake.CourseName)) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (zebra) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (StudentSumNumberOfCourse + ClassMake.numberOfCourse > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                                                            StudentCourses.add(ClassMake.CourseName);
                                                                                                            NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                                                            IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                                                            ClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                                                            System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ClassMake.ClassEndTime))
                                                                                                                || (((CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) &&
                                                                                                                (CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ClassMake.ClassStartTime)))) && (CourseDayArray.contains(ClassMake.ClaasDay))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                                                            StudentCourses.add(ClassMake.CourseName);
                                                                                                            NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                                                            IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                                                            ClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                                                            System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }


                                                                                        }
                                                                                            else if (ChooseCourse.equals("Back")||ChooseCourse.equals("Back1")){
                                                                                            Gof=true;
                                                                                            break;
                                                                                        }
                                                                                        else {
                                                                                            System.out.println("Your input is not valid!!");
                                                                                            Hey = true;
                                                                                            break;

                                                                                        }
                                                                                    } while (Hey);
                                                                                } else if (ChooseDepartment.equals("ComputerEngineering") || ChooseDepartment.equals("2")) {
                                                                                    boolean Hey = true;
                                                                                    do {
                                                                                        Addy = false;
                                                                                        Computer_Engineering.ShowCECourse();
                                                                                        System.out.println("Add to Which Course ?");
                                                                                        sc.nextLine();
                                                                                        String ChooseCourse = sc.nextLine();
                                                                                        if (ChooseCourse.equals("Advance_Programming") || ChooseCourse.equals("40244")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean lion = true;
                                                                                            if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeAdvance_Programming())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeAdvance_Programming())))
                                                                                                    && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeAdvance_Programming())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayAdvance_Programming())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("AdvanceProgramming")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (lion) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseAdvance_Programming()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                                                            StudentCourses.add("AdvanceProgramming");
                                                                                                            NameOfStudentInCourseAP.add(FullName);
                                                                                                            IdOfStudentInCourseAP.add(StudentId);
                                                                                                            Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                                                            ApCapacity -= 1;
                                                                                                            System.out.println("Advance Programming added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            lion = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                                                            Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                                                            StudentCourses.add("AdvanceProgramming");
                                                                                                            NameOfStudentInCourseAP.add(FullName);
                                                                                                            IdOfStudentInCourseAP.add(StudentId);
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                                                            ApCapacity -= 1;
                                                                                                            System.out.println("Advance Programming added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            lion = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                            }

                                                                                        } else if (ChooseCourse.equals("Logic_Circuits") || ChooseCourse.equals("40212")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean horse = true;
                                                                                            if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeLogic_Circuits())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeLogic_Circuits())))
                                                                                                    && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeLogic_Circuits())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayLogic_Circuits())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("LogicCircuits")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (horse) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseLogic_Circuits()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                                                            StudentCourses.add("LogicCircuits");
                                                                                                            NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                                                            IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                                                            Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                                                            Logic_CircuitsCapacity -= 1;
                                                                                                            System.out.println("Logic Circuits added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            horse = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                                                            StudentCourses.add("LogicCircuits");
                                                                                                            NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                                                            IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                                                            Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                                                            Logic_CircuitsCapacity -= 1;
                                                                                                            System.out.println("Logic Circuits added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            horse = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                        } else if (ChooseCourse.equals("Discrete_Structures") || ChooseCourse.equals("40115")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean donkey = true;
                                                                                            if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeDiscrete_Structures())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeDiscrete_Structures())))
                                                                                                    && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeDiscrete_Structures())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayDiscrete_Structures())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("DiscreteStructures")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (donkey) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseDiscrete_Structures()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                                                            StudentCourses.add("DiscreteStructures");
                                                                                                            NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                                                            IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                                                            Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                                                            Discrete_StructuresCapacity -= 1;
                                                                                                            System.out.println("discrete Structures added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            donkey = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                                                            CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                                                            CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                                                            CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                                                            CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                                                            StudentCourses.add("DiscreteStructures");
                                                                                                            NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                                                            IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                                                            Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                                                            System.out.println("discrete Structures added to your courses successfully !!");
                                                                                                            Discrete_StructuresCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            donkey = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                        }
                                                                                        else if (ChooseCourse.equals(ComClassMake.CourseName)||ChooseCourse.equals(ComClassMake.CourseCode)){
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean zebra = true;
                                                                                            if (((((CourseStarTimeArray.contains(ComClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ComClassMake.ClassEndTime)))
                                                                                                    && (CourseDayArray.contains(ComClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ComClassMake.ExamTime)) && (CourseExamDayArray.contains(ComClassMake.ExamDay)))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains(ComClassMake.CourseName)) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (zebra) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (StudentSumNumberOfCourse + ComClassMake.numberOfCourse > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ComClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                                                            StudentCourses.add(ComClassMake.CourseName);
                                                                                                            NameOfStudentInCourseComClassMake.add(FullName);
                                                                                                            IdOfStudentInCourseComClassMake.add(StudentId);
                                                                                                            ComClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                                                            System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ComClassMake.ClassEndTime))
                                                                                                                || (((CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) &&
                                                                                                                (CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ComClassMake.ClassStartTime)))) && (CourseDayArray.contains(ComClassMake.ClaasDay))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ComClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                                                            StudentCourses.add(ComClassMake.CourseName);
                                                                                                            NameOfStudentInCourseComClassMake.add(FullName);
                                                                                                            IdOfStudentInCourseComClassMake.add(StudentId);
                                                                                                            ComClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                                                            System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }


                                                                                        }
                                                                                        else if (ChooseCourse.equals("Back") || ChooseCourse.equals("Back1")){
                                                                                            Gof=true;
                                                                                            break;


                                                                                        }
                                                                                        else {
                                                                                            System.out.println("Your input is not valid!!");
                                                                                            Hey = true;
                                                                                            break;

                                                                                        }
                                                                                    } while (Hey);

                                                                                } else if (ChooseDepartment.equals("Electrical Engineering") || ChooseDepartment.equals("3")) {
                                                                                    boolean Hey = false;
                                                                                    do {
                                                                                        Addy = false;
                                                                                        Electrical_Engineering.ShowEECourse();
                                                                                        System.out.println("Add to Which Course ?");
                                                                                        sc.nextLine();
                                                                                        String ChooseCourse = sc.nextLine();
                                                                                        if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean caty = true;
                                                                                            if (((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectromagnetism())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectromagnetism())))
                                                                                                    && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism())))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectromagnetism())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectromagnetism())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {

                                                                                                if (StudentCourses.contains("Electromagnetism")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (caty) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectromagnetism()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            continue;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                                                            StudentCourses.add("Electromagnetism");
                                                                                                            NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                                                            IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                                                            Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                                                            ElectromagnetismCapacity -= 1;
                                                                                                            System.out.println("Electromagnetism added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            caty = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism()))) {
                                                                                                            System.out.println("You are not able to Add course cause of class time limit !! ");
                                                                                                            ok = true;
                                                                                                            break;

                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                                                            StudentCourses.add("Electromagnetism");
                                                                                                            NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                                                            IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                                                            Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                                                            ElectromagnetismCapacity -= 1;
                                                                                                            System.out.println("Electromagnetism added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            caty = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                            }

                                                                                        } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean doggy = true;
                                                                                            if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectronics2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectronics2())))
                                                                                                    && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectronics2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectronics2())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("Electronics2")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (doggy) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectronics2()) > 20)) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
//                                                                     continue;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                                                            StudentCourses.add("Electronics2");
                                                                                                            NameOfStudentInCourseElectronics2.add(FullName);
                                                                                                            IdOfStudentInCourseElectronics2.add(StudentId);
                                                                                                            Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();

                                                                                                            Electronics2Capacity -= 1;
                                                                                                            System.out.println("Electronics 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            doggy = false;
                                                                                                            break;

                                                                                                        } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) {
                                                                                                            System.out.println("You are not able to Add course cause of class time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                                                            StudentCourses.add("Electronics2");
                                                                                                            NameOfStudentInCourseElectronics2.add(FullName);
                                                                                                            IdOfStudentInCourseElectronics2.add(StudentId);
                                                                                                            Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();
                                                                                                            Electronics2Capacity -= 1;
                                                                                                            System.out.println("Electronics 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            doggy = false;
                                                                                                            break;

//
                                                                                                        }


                                                                                                    }
                                                                                                }


                                                                                            }

                                                                                        } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                                                            Gof=false;
                                                                                            boolean monkey = true;
                                                                                            if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())))
                                                                                                    && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;

                                                                                            } else {

                                                                                                if (StudentCourses.contains("BasicsOfElectricalEngineering2")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (monkey) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                                                            StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                                                            Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                                                            BasicsOfElectrical2_Capacity -= 1;
                                                                                                            NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                                                            IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                                                            System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            monkey = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                                                            CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                                                            CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                                                            CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                                                            CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                                                            StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                                                            Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                                                            BasicsOfElectrical2_Capacity -= 1;
                                                                                                            NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                                                            IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                                                            System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            monkey = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                        }
                                                                                        else if (ChooseCourse.equals(ElecClassMake.CourseName)||ChooseCourse.equals(ElecClassMake.CourseCode)){
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean zebra = true;
                                                                                            if (((((CourseStarTimeArray.contains(ElecClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ElecClassMake.ClassEndTime)))
                                                                                                    && (CourseDayArray.contains(ElecClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ElecClassMake.ExamTime)) && (CourseExamDayArray.contains(ElecClassMake.ExamDay)))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains(ElecClassMake.CourseName)) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (zebra) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (StudentSumNumberOfCourse + ElecClassMake.numberOfCourse > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                                                            StudentCourses.add(ElecClassMake.CourseName);
                                                                                                            NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                                                            IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                                                            ElecClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                                                            System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ElecClassMake.ClassEndTime))
                                                                                                                || (((CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) &&
                                                                                                                (CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassStartTime)))) && (CourseDayArray.contains(ElecClassMake.ClaasDay))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                                                            StudentCourses.add(ElecClassMake.CourseName);
                                                                                                            NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                                                            IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                                                            ElecClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                                                            System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }


                                                                                        }
                                                                                        else if (ChooseCourse.equals("Back")||ChooseCourse.equals("Back1")){
                                                                                            Gof=true;
                                                                                            break;
                                                                                        }
                                                                                        else {
                                                                                            System.out.println("Your input is not valid!!");
                                                                                            Hey = true;
                                                                                            break;

                                                                                        }
                                                                                    } while (Hey);


                                                                                } else if (ChooseDepartment.equals("Mechanical Engineering") || ChooseDepartment.equals("4")) {
                                                                                    boolean Hey = true;
                                                                                    do {
                                                                                        Addy = false;
                                                                                        Mechanical_Engineering.ShowMECourse();
                                                                                        System.out.println("Add to Which Course ?");
                                                                                        sc.nextLine();
                                                                                        String ChooseCourse = sc.nextLine();
                                                                                        if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean fox = true;
                                                                                            if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeThermodynamics2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeThermodynamics2())))
                                                                                                    && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeThermodynamics2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayThermodynamics2())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("Thermodynamics2")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (fox) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseThermodynamics2()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                                                            StudentCourses.add("Thermodynamics2");
                                                                                                            NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                                                            IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                                                            Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                                                            Thermodynamics2Capacity -= 1;
                                                                                                            System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            fox = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                                                            StudentCourses.add("Thermodynamics2");
                                                                                                            Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                                                            Thermodynamics2Capacity -= 1;
                                                                                                            NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                                                            IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                                                            System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            fox = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                        } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean koala = true;
                                                                                            if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeStatic())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeStatic())))
                                                                                                    && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeStatic())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayStatic())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("Static")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (koala) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i < CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseStatic()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                                                            StudentCourses.add("Static");
                                                                                                            NameOfStudentInCourseStatic.add(FullName);
                                                                                                            IdOfStudentInCourseStatic.add(StudentId);
                                                                                                            Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                                                            StaticCapacity -= 1;
                                                                                                            System.out.println("Static added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            koala = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                                                            StudentCourses.add("Static");
                                                                                                            NameOfStudentInCourseStatic.add(FullName);
                                                                                                            IdOfStudentInCourseStatic.add(StudentId);
                                                                                                            Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                                                            StaticCapacity -= 1;
                                                                                                            System.out.println("Static added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            koala = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean chicken = true;
                                                                                            if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())))
                                                                                                    && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2())))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains("ResistanceOfMaterials2")) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (chicken) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2()) > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;

                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                                                            StudentCourses.add("ResistanceOfMaterials2");
                                                                                                            NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                                                            IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                                                            Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                                                            ResistanceOfMaterials2Capacity -= 1;
                                                                                                            System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            chicken = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()))
                                                                                                                || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) &&
                                                                                                                (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                                                            CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                                                            CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                                                            CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                                                            CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                                                            StudentCourses.add("ResistanceOfMaterials2");
                                                                                                            NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                                                            IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                                                            Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                                                            StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                                                            ResistanceOfMaterials2Capacity -= 1;
                                                                                                            System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            chicken = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }else if (ChooseCourse.equals(MechClassMake.CourseName)||ChooseCourse.equals(MechClassMake.CourseCode)){
                                                                                            Gof=false;
                                                                                            Hey = false;
                                                                                            boolean zebra = true;
                                                                                            if (((((CourseStarTimeArray.contains(MechClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(MechClassMake.ClassEndTime)))
                                                                                                    && (CourseDayArray.contains(MechClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(MechClassMake.ExamTime)) && (CourseExamDayArray.contains(MechClassMake.ExamDay)))) {
                                                                                                System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                ok = true;
                                                                                            } else {
                                                                                                if (StudentCourses.contains(MechClassMake.CourseName)) {
                                                                                                    System.out.println("WARNING!! You picked this course.");
                                                                                                    back();
                                                                                                } else if (zebra) {
                                                                                                    CourseStarTimeArray.add(-1.3);
                                                                                                    CourseEndTimeArray.add(-2.43);
                                                                                                    for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                                        if (StudentSumNumberOfCourse + MechClassMake.numberOfCourse > 20) {
                                                                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                                            ok = true;
                                                                                                        } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                                            CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(MechClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                                                            StudentCourses.add(MechClassMake.CourseName);
                                                                                                            NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                                                            IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                                                            MechClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                                                            System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        } else if (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime && CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < MechClassMake.ClassEndTime))
                                                                                                                || (((CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) &&
                                                                                                                (CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > MechClassMake.ClassStartTime)))) && (CourseDayArray.contains(MechClassMake.ClaasDay))) {
                                                                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                                            ok = true;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                                                            CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                                                            CourseDayArray.add(MechClassMake.ClaasDay);
                                                                                                            CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                                                            CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                                                            StudentCourses.add(MechClassMake.CourseName);
                                                                                                            NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                                                            IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                                                            MechClassMake.Capacity--;
                                                                                                            StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                                                            System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                                            ok = true;
                                                                                                            yes = false;
                                                                                                            zebra = false;
                                                                                                            break;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }


                                                                                        }
                                                                                        else if (ChooseCourse.equals("Back")||ChooseCourse.equals("Back1")){
                                                                                            Gof=true;
                                                                                            break;
                                                                                        }
                                                                                        else {
                                                                                            System.out.println("Your input is not valid!!");
                                                                                            Hey = true;
                                                                                            break;

                                                                                        }
                                                                                    } while (Hey);

                                                                                }
                                                                            } else if (StudentIDEnter.equals("Back")) {
                                                                                Addy = false;
                                                                                Gof=false;

                                                                            } else if (StudentIDEnter.equals("Back1")) {
                                                                                Gof=true;
                                                                                break;

                                                                            } else {
                                                                                System.out.println("We do not have this student in our system. Please try Again!!");
                                                                                Addy = true;


                                                                            }


                                                                        } while (Addy);
                                                                    } else if (ToDO.equals("Delete Student") || ToDO.equals("2")) {
                                                                        boolean Addy = true;
                                                                        do {
                                                                            System.out.println("Please enter student's StudentId : ");
                                                                            String StudentIDEnter = sc.next();
                                                                            if (StudentIDEnter.equals("402170092")) {
                                                                                System.out.println("you want to Delete Course from your List. Please wait !!");
                                                                                System.out.println("Please enter the course that tou want to delete from your list : ");
                                                                                String DeleteAnswer = sc.next();
                                                                                if (StudentCourses.isEmpty()) {
                                                                                    Gof=false;
                                                                                    Addy=false;
                                                                                    System.out.println("You do not have any Courses in your List !!");
                                                                                } else if (StudentCourses.contains(DeleteAnswer)) {
                                                                                    StudentCourses.remove(DeleteAnswer);
                                                                                    if (DeleteAnswer.equals("Calculus2")) {
                                                                                        Addy=false;

                                                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseCalculus2();
                                                                                        Mathematics_Department.DeleteCalculus2IncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeCalculus2());
                                                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeCalculus2());
                                                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeCalculus2());
                                                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayCalculus2());
                                                                                        IdOfStudentInCourseCalculus2.remove(StudentId);
                                                                                        NameOfStudentInCourseCalculus2.remove(FullName);
                                                                                        Gof=false;
                                                                                    }
                                                                                    if (DeleteAnswer.equals("BasicsOfMathematics")) {
                                                                                        Gof=false;
                                                                                        Addy=false;

                                                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                                        Mathematics_Department.DeleteBasicsOfMathematicsIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                                        IdOfStudentInCourseBasicMath.remove(StudentId);
                                                                                        NameOfStudentInCourseBasicMath.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("DifferentialEquations")) {
                                                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                                        Mathematics_Department.DeleteDifferential_EquationsIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                                        IdOfStudentInCourseCDifferential_Equations.remove(StudentId);
                                                                                        Gof=false;
                                                                                        Addy=false;

                                                                                        NameOfStudentInCourseDifferential_Equations.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("AdvanceProgramming")) {
                                                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                                        Computer_Engineering.DeleteAdvance_ProgrammingIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                                        Gof=false;
                                                                                        Addy=false;

                                                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                                        IdOfStudentInCourseAP.remove(StudentId);
                                                                                        NameOfStudentInCourseAP.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("LogicCircuits")) {
                                                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                                        Computer_Engineering.DeleteLogic_CircuitsIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                                        Addy=false;
                                                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                                        IdOfStudentInCourseLogic_Circuits.remove(StudentId);

                                                                                        Gof=false;
                                                                                        NameOfStudentInCourseLogic_Circuits.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("DiscreteStructures")) {
                                                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                                        Computer_Engineering.DeleteDiscrete_StructuresIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                                        Addy=false;
                                                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                                        IdOfStudentInCourseDiscrete_Structures.remove(StudentId);

                                                                                        Gof=false;
                                                                                        NameOfStudentInCourseDiscrete_Structures.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("Electromagnetism")) {
                                                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                                        Electrical_Engineering.DeleteElectromagnetismIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectromagnetism());

                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseElectromagnetism.remove(StudentId);
                                                                                        NameOfStudentInCourseElectromagnetism.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("Electronics2")) {
                                                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectronics2();
                                                                                        Electrical_Engineering.DeleteElectronics2IncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectronics2());

                                                                                        Gof=false;
                                                                                        Addy=false;
                                                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectronics2());
                                                                                        IdOfStudentInCourseElectronics2.remove(StudentId);
                                                                                        NameOfStudentInCourseElectronics2.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("BasicsOfElectricalEngineering2")) {
                                                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                                        Electrical_Engineering.DeleteBasicsOfElectricalEngineering2IncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());

                                                                                        Gof=false;
                                                                                        Addy=false;
                                                                                        IdOfStudentInCourseBasicsOfElectrical2.remove(StudentId);
                                                                                        NameOfStudentInCourseBasicsOfElectrical2.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("Static")) {
                                                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseStatic();
                                                                                        Mechanical_Engineering.DeleteThermodynamics2IncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeStatic());
                                                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeStatic());
                                                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeStatic());
                                                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayStatic());
                                                                                        Addy=false;
                                                                                        IdOfStudentInCourseStatic.remove(StudentId);
                                                                                        Gof=false;
                                                                                        NameOfStudentInCourseStatic.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("Thermodynamics2")) {
                                                                                        Addy=false;
                                                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                                        Mechanical_Engineering.DeleteStaticIncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                                        IdOfStudentInCourseThermodynamics2.remove(StudentId);
                                                                                        Gof=false;
                                                                                        NameOfStudentInCourseThermodynamics2.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals("ResistanceOfMaterials2")) {
                                                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                                        Mechanical_Engineering.DeleteResistanceOfMaterials2IncreaseCapacity();
                                                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseResistanceOfMaterials2.remove(StudentId);
                                                                                        NameOfStudentInCourseResistanceOfMaterials2.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals(ClassMake.CourseName)||DeleteAnswer.equals(ClassMake.CourseCode)){
                                                                                        StudentSumNumberOfCourse -= ClassMake.numberOfCourse;
                                                                                        ClassMake.Capacity++;
                                                                                        CourseStarTimeArray.remove(ClassMake.ClassStartTime);
                                                                                        CourseEndTimeArray.remove(ClassMake.ClassEndTime);
                                                                                        CourseExamTimeArray.remove(ClassMake.ExamTime);
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(ClassMake.ExamDay);
                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseMathClassMake.remove(StudentId);
                                                                                        NameOfStudentInCourseMathClassMAke.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals(ComClassMake.CourseName)||DeleteAnswer.equals(ComClassMake.CourseCode)){
                                                                                        StudentSumNumberOfCourse -= ComClassMake.numberOfCourse;
                                                                                        ComClassMake.Capacity++;
                                                                                        CourseStarTimeArray.remove(ComClassMake.ClassStartTime);
                                                                                        CourseEndTimeArray.remove(ComClassMake.ClassEndTime);
                                                                                        CourseExamTimeArray.remove(ComClassMake.ExamTime);
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(ComClassMake.ExamDay);
                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseComClassMake.remove(StudentId);
                                                                                        NameOfStudentInCourseComClassMake.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals(ElecClassMake.CourseName)||DeleteAnswer.equals(ElecClassMake.CourseCode)){
                                                                                        StudentSumNumberOfCourse -= ElecClassMake.numberOfCourse;
                                                                                        ElecClassMake.Capacity++;
                                                                                        CourseStarTimeArray.remove(ElecClassMake.ClassStartTime);
                                                                                        CourseEndTimeArray.remove(ElecClassMake.ClassEndTime);
                                                                                        CourseExamTimeArray.remove(ElecClassMake.ExamTime);
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(ElecClassMake.ExamDay);
                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseElecMakeClass.remove(StudentId);
                                                                                        NameOfStudentInCourseElecMakeClass.remove(FullName);
                                                                                    }
                                                                                    if (DeleteAnswer.equals(MechClassMake.CourseName)||DeleteAnswer.equals(MechClassMake.CourseCode)){
                                                                                        StudentSumNumberOfCourse -= MechClassMake.numberOfCourse;
                                                                                        MechClassMake.Capacity++;
                                                                                        CourseStarTimeArray.remove(MechClassMake.ClassStartTime);
                                                                                        CourseEndTimeArray.remove(MechClassMake.ClassEndTime);
                                                                                        CourseExamTimeArray.remove(MechClassMake.ExamTime);
                                                                                        Addy=false;
                                                                                        CourseExamDayArray.remove(MechClassMake.ExamDay);
                                                                                        Gof=false;
                                                                                        IdOfStudentInCourseMechMakeClass.remove(StudentId);
                                                                                        NameOfStudentInCourseMechMakeClass.remove(FullName);
                                                                                    }
                                                                                    System.out.println("Delete course from your list successfully !!");
                                                                                } else if (!StudentCourses.contains(DeleteAnswer)) {
                                                                                    Gof=false;
                                                                                    Addy=false;

                                                                                    System.out.println("You do not have this course in your List !!");
                                                                                }
                                                                                else if (DeleteAnswer.equals("Back")) {
                                                                                    Addy = false;
                                                                                    Gof = false;

                                                                                } else if (DeleteAnswer.equals("Back1")) {
                                                                                    Gof = true;
                                                                                    break;

                                                                                }

                                                                                System.out.println("Your Courses are : " + StudentCourses);


                                                                            } else if (StudentIDEnter.equals("Back")) {
                                                                                Addy = false;
                                                                                Gof = false;

                                                                            } else if (StudentIDEnter.equals("Back1")) {
                                                                                Gof = true;
                                                                                break;

                                                                            }
                                                                        }while (Addy);
                                                                    }
                                                                    else {
                                                                        Gof=false;
                                                                    }

                                                                }while (Gof);
                                                            }else if (NextAnswer.equals("Show students enrolled in courses") || NextAnswer.equals("4")) {
                                                                boolean Z4 = true;
                                                            while (Z4){
                                                                System.out.println("Please enter the Department that you wnat to see enrolled student of : ");
                                                                System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                                String ChooseDepartment = sc.next();
                                                                if (ChooseDepartment.equals("Mathematics") || ChooseDepartment.equals("1")) {
                                                                    Mathematics_Department.ShowMCourse();
                                                                    System.out.println("Please enter the Course that you want to see enrolled student of : ");
                                                                    String ChooseCourse = sc.next();
                                                                    if (ChooseCourse.equals("Calculus2") || ChooseCourse.equals("22016")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseCalculus2.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseCalculus2 + "    " + IdOfStudentInCourseCalculus2);
                                                                        }
                                                                    } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals("22142")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseBasicMath.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseBasicMath + "    " + IdOfStudentInCourseBasicMath);
                                                                        }
                                                                    } else if (ChooseCourse.equals("Differential_Equations") || ChooseCourse.equals("22034")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseCDifferential_Equations.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseDifferential_Equations + "    " + IdOfStudentInCourseCDifferential_Equations);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals(ClassMake.CourseName)||ChooseCourse.equals(ClassMake.CourseCode)){
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseMathClassMake.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseMathClassMAke + "    " + IdOfStudentInCourseMathClassMake);
                                                                        }
                                                                    }
//                                                                    else if (ChooseCourse.equals("Back")) {
////                                                                        Addy = false;
////                                                                        Z4 = false;
//
//                                                                    }
                                                                    else if (ChooseCourse.equals("Back1")) {
                                                                        Z4 = true;
                                                                        break;

                                                                    }
                                                                    else {
                                                                        System.out.println("The input is not valid!!");
                                                                        Z4 = true;
                                                                        break;
                                                                    }

                                                                } else if (ChooseDepartment.equals("ComputerEngineering") || ChooseDepartment.equals("2")) {

                                                                    Computer_Engineering.ShowCECourse();
                                                                    System.out.println("Please enter the Course that you want to see enrolled student of : ");
                                                                    String ChooseCourse = sc.next();
                                                                    if (ChooseCourse.equals("Advance_Programming") || ChooseCourse.equals("40244")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseAP.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseAP + "    " + IdOfStudentInCourseAP);
                                                                        }
                                                                    } else if (ChooseCourse.equals("Logic_Circuits") || ChooseCourse.equals("40212")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseLogic_Circuits.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseLogic_Circuits + "    " + IdOfStudentInCourseLogic_Circuits);
                                                                        }
                                                                    } else if (ChooseCourse.equals("Discrete_Structures") || ChooseCourse.equals("40115")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseDiscrete_Structures.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseDiscrete_Structures + "    " + IdOfStudentInCourseDiscrete_Structures);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals(ComClassMake.CourseName)||ChooseCourse.equals(ComClassMake.CourseCode)){
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseComClassMake.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseComClassMake+ "    " + IdOfStudentInCourseComClassMake);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals("Back1")) {
                                                                        Z4 = true;
                                                                        break;

                                                                    }
                                                                    else {
                                                                        System.out.println("The input is not valid!!");
                                                                        Z4 = true;
                                                                        break;
                                                                    }
                                                                } else if (ChooseDepartment.equals("Electrical Engineering") || ChooseDepartment.equals("3")) {
                                                                    Electrical_Engineering.ShowEECourse();
                                                                    System.out.println("Please enter the Course that you want to see enrolled student of : ");
                                                                    String ChooseCourse = sc.next();
                                                                    if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseElectromagnetism.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseElectromagnetism + "    " + IdOfStudentInCourseElectromagnetism);
                                                                        }
                                                                    } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseElectronics2.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseElectronics2 + "    " + IdOfStudentInCourseElectronics2);
                                                                        }
                                                                    } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseBasicsOfElectrical2.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseBasicsOfElectrical2 + "    " + IdOfStudentInCourseBasicsOfElectrical2);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals(ElecClassMake.CourseName)||ChooseCourse.equals(ElecClassMake.CourseCode)){
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseElecMakeClass.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseElecMakeClass + "    " + IdOfStudentInCourseElecMakeClass);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals("Back1")) {
                                                                        Z4 = true;
                                                                        break;

                                                                    }
                                                                    else {
                                                                        System.out.println("The input is not valid!!");
                                                                        Z4 = true;
                                                                        break;
                                                                    }
                                                                } else if (ChooseDepartment.equals("Mechanical Engineering") || ChooseDepartment.equals("4")) {
                                                                    Mechanical_Engineering.ShowMECourse();
                                                                    System.out.println("Please enter the Course that you want to see enrolled student of : ");
                                                                    String ChooseCourse = sc.next();
                                                                    if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseThermodynamics2.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseThermodynamics2 + "    " + IdOfStudentInCourseThermodynamics2);
                                                                        }
                                                                    } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseStatic.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseStatic + "    " + IdOfStudentInCourseStatic);
                                                                        }
                                                                    } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseResistanceOfMaterials2.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseResistanceOfMaterials2 + "    " + IdOfStudentInCourseResistanceOfMaterials2);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals(MechClassMake.CourseName)||ChooseCourse.equals(MechClassMake.CourseCode)){
                                                                        System.out.println("The Registed Students are : ");
                                                                        for (int i = 0; i < IdOfStudentInCourseMechMakeClass.size(); i++) {
                                                                            System.out.println(NameOfStudentInCourseMechMakeClass + "    " + IdOfStudentInCourseMechMakeClass);
                                                                        }
                                                                    }
                                                                    else if (ChooseCourse.equals("Back1")) {
                                                                        Z4 = true;
                                                                        break;

                                                                    }
                                                                    else {
                                                                        System.out.println("The input is not valid!!");
                                                                        Z4 = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            } else if (NextAnswer.equals("Shows Department Courses") || NextAnswer.equals("5")) {
                                                                System.out.println("You want to see Department courses. Please wait...");
                                                                System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                                System.out.println("Please Choose department : ");
                                                                String ChooseDepartment = sc.next();
                                                                if (ChooseDepartment.equals("Mathematics") || ChooseDepartment.equals("1")) {
                                                                    Mathematics_Department.ShowMCourse();
                                                                } else if (ChooseDepartment.equals("ComputerEngineering") || ChooseDepartment.equals("2")) {
                                                                    Computer_Engineering.ShowCECourse();
                                                                } else if (ChooseDepartment.equals("Electrical Engineering") || ChooseDepartment.equals("3")) {
                                                                    Electrical_Engineering.ShowEECourse();
                                                                } else if (ChooseDepartment.equals("Mechanical Engineering") || ChooseDepartment.equals("4")) {
                                                                    Mechanical_Engineering.ShowMECourse();
                                                                }

                                                            } else if (NextAnswer.equals("Back")) {
                                                                System.out.println("You will back to Choose role again");
                                                                newYes = true;
                                                                newOk = false;
                                                                Asghar=false;
                                                                break;
                                                            } else {
                                                                System.out.println("It is a wrong input. Please try again !!");
                                                                newOk = true;
                                                            }

                                                        } while (newOk);
                                                    } else {
                                                        System.out.println("Your Password is not correct . Please try again !! ( You will back to choosing role again ) ");
                                                        newOk = false;
                                                        newYes = true;
                                                        break;
                                                    }
                                                } else if (NewAdminPass.equals("Back")) {
                                                    newYes = true;
                                                    break;
                                                } else if (NewAdminPass.equals("Back1")) {
                                                    Asghar = true;
                                                    break;
                                                }
                                            } else
                                            if (NewAdminUsername.equals("Back") || NewAdminUsername.equals("Back1")) {
                                                newYes = true;
                                                Asghar = false;
                                                break;
                                            } else {
                                                System.out.println("Your Username is not valid . Please try again !!");
                                                newOk = true;
                                            }

                                        } catch(InputMismatchException e){
                                            System.err.println("Exception : " + e);
                                            sc.nextLine();
                                            System.out.println("Please try again. Your input is not valid!");
                                        }

                                    } while (newOk) ;

                                } while (Asghar);


                        } else if (role.equals("Student") || role.equals("2")) {
                            System.out.println("Your role is Student");

                            System.out.print("Please enter Your StudentID : ");
                            String studentIDInput = sc.next();
                            if (studentIDInput.equals(StudentId)) {
                                System.out.println("True");
                                System.out.println("Please enter Your FullName : ");
                                FullNameInput = sc.next();
                                if (FullNameInput.equals("Back")) {
                                    back();
                                } else if (FullNameInput.equals(FullName)) {
                                    Random dd = new Random();
                                    int FirstNumber = dd.nextInt(10);
                                    int SecondNumber = dd.nextInt(10);
                                    System.out.println("Please Write a True answer to show that you are not bot !!");
                                    System.out.println(FirstNumber + " + " + SecondNumber + " = ");
                                    int TrueAnswer = sc.nextInt();
                                    if (TrueAnswer == FirstNumber + SecondNumber) {
                                        System.out.println("     #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#   ");
                                        System.out.println("            Welcome " + FullNameInput);
                                        System.out.println("     #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#   ");

                                        do {
                                            System.out.println("             Main Menu              ");
                                            System.out.println("1 : Add Course");
                                            System.out.println("2 : Delete Course");
                                            System.out.println("3 : Shows Department Courses");
                                            System.out.println("4 : Show my courses");
                                            System.out.println("** If you want to choose role , enter \"Back to choose role\"");
                                            sc.nextLine();
                                            String NextAnswer = sc.nextLine();
                                            if (NextAnswer.equals("Back")) {
                                                back();
                                            } else if (NextAnswer.equals("Add Course") || NextAnswer.equals("1")) {
                                                if (StudentSumNumberOfCourse >= 20) {
                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                    ok = true;

                                                } else {
                                                    System.out.println("You Want to Add Course to your List. Please wait !!");
                                                    System.out.println("From which department you want to add course? ");
                                                    System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                    String NewChooseDepartment = sc.next();
                                                    if (NewChooseDepartment.equals("Back")) {
                                                        back();
                                                    } else if (NewChooseDepartment.equals("Mathematics") || NewChooseDepartment.equals("1")) {
                                                    Mathematics_Department.ShowMCourse();
                                                    System.out.println("Choose Course : ");
                                                    sc.nextLine();
                                                    String ChooseCourse = sc.nextLine();
                                                    if (ChooseCourse.equals("Calculus2") || ChooseCourse.equals(Mathematics_Department.CourseCodeCalculus2())) {
                                                        boolean rabbit = true;
                                                        if ((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeCalculus2())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeCalculus2())))
                                                                && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeCalculus2())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayCalculus2())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {

                                                            if (StudentCourses.contains("Calculus2")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (rabbit) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseCalculus2()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                        StudentCourses.add("Calculus2");
                                                                        NameOfStudentInCourseCalculus2.add(FullName);
                                                                        IdOfStudentInCourseCalculus2.add(StudentId);
                                                                        Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                        Calculus2Capacity -= 1;
                                                                        System.out.println("Calculus2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        rabbit = false;
                                                                        break;

                                                                    } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()))
                                                                            || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) &&
                                                                            (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) {
                                                                        System.out.println("You are not able to Add course cause of Class time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                        StudentCourses.add("Calculus2");
                                                                        NameOfStudentInCourseCalculus2.add(FullName);
                                                                        IdOfStudentInCourseCalculus2.add(StudentId);
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                        Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                        Calculus2Capacity -= 1;
                                                                        System.out.println("Calculus2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        rabbit = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }

                                                    } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals(Mathematics_Department.CourseCodeBasicsOfMathematics())) {
                                                        boolean goat = true;
                                                        if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeBasicsOfMathematics())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeBasicsOfMathematics())))
                                                                && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeBasicsOfMathematics())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayBasicsOfMathematics())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("BasicsOfMathematics")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (goat) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseBasicsOfMathematics()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                        StudentCourses.add("BasicsOfMathematics");
                                                                        Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                        BasicMathCapacity -= 1;
                                                                        NameOfStudentInCourseBasicMath.add(FullName);
                                                                        IdOfStudentInCourseBasicMath.add(StudentId);
                                                                        System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        goat = true;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()))
                                                                            || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics())) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) &&
                                                                            (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics()))) && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                        StudentCourses.add("BasicsOfMathematics");
                                                                        Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                        System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                        BasicMathCapacity -= 1;
                                                                        NameOfStudentInCourseBasicMath.add(FullName);
                                                                        IdOfStudentInCourseBasicMath.add(StudentId);
                                                                        ok = true;
                                                                        yes = false;
                                                                        goat = true;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }

                                                    } else if (ChooseCourse.equals("DifferentialEquations") || ChooseCourse.equals(Mathematics_Department.CpurseCodeDifferential_Equations())) {
                                                        boolean zebra = true;
                                                        if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("DifferentialEquations")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (zebra) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseDifferential_Equations() > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                        StudentCourses.add("DifferentialEquations");
                                                                        NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                        IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                        Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                        System.out.println("Differential Equations added to your courses successfully !!");
                                                                        Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()))
                                                                            || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) &&
                                                                            (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                        CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                        CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                        CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                        CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                        StudentCourses.add("DifferentialEquations");
                                                                        Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                        Differential_EquationsCapacity -= 1;
                                                                        NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                        IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                        System.out.println("Differential Equations added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }

                                                    }
                                                    else if (ChooseCourse.equals(ClassMake.CourseName)||ChooseCourse.equals(ClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                        boolean zebra = true;
                                                        if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains(ClassMake.CourseName)) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (zebra) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (StudentSumNumberOfCourse + ClassMake.numberOfCourse > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                        StudentCourses.add(ClassMake.CourseName);
                                                                        NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                        IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                        ClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                        System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ClassMake.ClassEndTime))
                                                                            || (((CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) &&
                                                                            (CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ClassMake.ClassStartTime)))) && (CourseDayArray.contains(ClassMake.ClaasDay))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                        StudentCourses.add(ClassMake.CourseName);
                                                                        NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                        IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                        ClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                        System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }


                                                    }

                                                }
                                                if (NewChooseDepartment.equals("ComputerEngineering") || NewChooseDepartment.equals("2")) {
                                                    Computer_Engineering.ShowCECourse();
                                                    System.out.println("Choose Course : ");
                                                    sc.nextLine();
                                                    String ChooseCourse = sc.nextLine();
                                                    if (ChooseCourse.equals("AdvanceProgramming") || ChooseCourse.equals("40244")) {
                                                        boolean lion = true;
                                                        if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeAdvance_Programming())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeAdvance_Programming())))
                                                                && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeAdvance_Programming())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayAdvance_Programming())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("AdvanceProgramming")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (lion) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseAdvance_Programming()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                        StudentCourses.add("AdvanceProgramming");
                                                                        Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                        ApCapacity -= 1;
                                                                        NameOfStudentInCourseAP.add(FullName);
                                                                        IdOfStudentInCourseAP.add(StudentId);
                                                                        System.out.println("Advance Programming added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        lion = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()))
                                                                            || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) &&
                                                                            (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                        Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                        StudentCourses.add("AdvanceProgramming");
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                        ApCapacity -= 1;
                                                                        NameOfStudentInCourseAP.add(FullName);
                                                                        IdOfStudentInCourseAP.add(StudentId);
                                                                        System.out.println("Advance Programming added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        lion = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    } else if (ChooseCourse.equals("LogicCircuits") || ChooseCourse.equals("40212")) {
                                                        boolean horse = true;
                                                        if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeLogic_Circuits())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeLogic_Circuits())))
                                                                && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeLogic_Circuits())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayLogic_Circuits())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("LogicCircuits")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (horse) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseLogic_Circuits()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                        StudentCourses.add("LogicCircuits");
                                                                        Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                        Logic_CircuitsCapacity -= 1;
                                                                        NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                        IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                        System.out.println("Logic Circuits added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        horse = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()))
                                                                            || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) &&
                                                                            (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                        StudentCourses.add("LogicCircuits");
                                                                        Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                        Logic_CircuitsCapacity -= 1;
                                                                        NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                        IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                        System.out.println("Logic Circuits added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        horse = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (ChooseCourse.equals("DiscreteStructures") || ChooseCourse.equals("40115")) {
                                                        boolean donkey = true;
                                                        if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeDiscrete_Structures())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeDiscrete_Structures())))
                                                                && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeDiscrete_Structures())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayDiscrete_Structures())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("DiscreteStructures")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (donkey) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseDiscrete_Structures()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                        StudentCourses.add("DiscreteStructures");
                                                                        Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                        Discrete_StructuresCapacity -= 1;
                                                                        NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                        IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                        System.out.println("discrete Structures added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        donkey = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()))
                                                                            || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) &&
                                                                            (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                        CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                        CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                        CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                        CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                        StudentCourses.add("DiscreteStructures");
                                                                        Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                        System.out.println("discrete Structures added to your courses successfully !!");
                                                                        Discrete_StructuresCapacity -= 1;
                                                                        NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                        IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                        ok = true;
                                                                        yes = false;
                                                                        donkey = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if (ChooseCourse.equals(ComClassMake.CourseName)||ChooseCourse.equals(ComClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                        boolean zebra = true;
                                                        if (((((CourseStarTimeArray.contains(ComClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ComClassMake.ClassEndTime)))
                                                                && (CourseDayArray.contains(ComClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ComClassMake.ExamTime)) && (CourseExamDayArray.contains(ComClassMake.ExamDay)))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains(ComClassMake.CourseName)) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (zebra) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (StudentSumNumberOfCourse + ComClassMake.numberOfCourse > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ComClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                        StudentCourses.add(ComClassMake.CourseName);
                                                                        NameOfStudentInCourseComClassMake.add(FullName);
                                                                        IdOfStudentInCourseComClassMake.add(StudentId);
                                                                        ComClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                        System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ComClassMake.ClassEndTime))
                                                                            || (((CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) &&
                                                                            (CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ComClassMake.ClassStartTime)))) && (CourseDayArray.contains(ComClassMake.ClaasDay))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ComClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                        StudentCourses.add(ComClassMake.CourseName);
                                                                        NameOfStudentInCourseComClassMake.add(FullName);
                                                                        IdOfStudentInCourseComClassMake.add(StudentId);
                                                                        ComClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                        System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }


                                                    }
                                                }
                                                if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                                    Electrical_Engineering.ShowEECourse();
                                                    System.out.println("Choose Course : ");
                                                    sc.nextLine();
                                                    String ChooseCourse = sc.nextLine();
                                                    if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                        boolean caty = true;
                                                        if (((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectromagnetism())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectromagnetism())))
                                                                && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism())))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectromagnetism())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectromagnetism())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {

                                                            if (StudentCourses.contains("Electromagnetism")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (caty) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectromagnetism()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        continue;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                        StudentCourses.add("Electromagnetism");
                                                                        Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                        ElectromagnetismCapacity -= 1;
                                                                        NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                        IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                        System.out.println("Electromagnetism added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        caty = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()))
                                                                            || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) &&
                                                                            (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism()))) {
                                                                        System.out.println("You are not able to Add course cause of class time limit !! ");
                                                                        ok = true;
                                                                        break;

                                                                    } else {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                        StudentCourses.add("Electromagnetism");
                                                                        NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                        IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                        Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                        ElectromagnetismCapacity -= 1;
                                                                        System.out.println("Electromagnetism added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        caty = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                        boolean doggy = true;
                                                        if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectronics2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectronics2())))
                                                                && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectronics2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectronics2())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("Electronics2")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (doggy) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectronics2()) > 20)) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
//                                                                     continue;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                        StudentCourses.add("Electronics2");
                                                                        NameOfStudentInCourseElectronics2.add(FullName);
                                                                        IdOfStudentInCourseElectronics2.add(StudentId);
                                                                        Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();

                                                                        Electronics2Capacity -= 1;
                                                                        System.out.println("Electronics 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        doggy = false;
                                                                        break;

                                                                    } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()))
                                                                            || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) &&
                                                                            (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) {
                                                                        System.out.println("You are not able to Add course cause of class time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                        StudentCourses.add("Electronics2");
                                                                        NameOfStudentInCourseElectronics2.add(FullName);
                                                                        IdOfStudentInCourseElectronics2.add(StudentId);
                                                                        Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();
                                                                        Electronics2Capacity -= 1;
                                                                        System.out.println("Electronics 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        doggy = false;
                                                                        break;

//
                                                                    }


                                                                }
                                                            }


                                                        }
                                                    } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                        boolean monkey = true;
                                                        if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())))
                                                                && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;

                                                        } else {

                                                            if (StudentCourses.contains("BasicsOfElectricalEngineering2")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (monkey) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                        StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                        Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                        BasicsOfElectrical2_Capacity -= 1;
                                                                        NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                        IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                        System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        monkey = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()))
                                                                            || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) &&
                                                                            (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                        CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                        CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                        CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                        CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                        StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                        Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                        BasicsOfElectrical2_Capacity -= 1;
                                                                        NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                        IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                        System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        monkey = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if (ChooseCourse.equals(ElecClassMake.CourseName)||ChooseCourse.equals(ElecClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                        boolean zebra = true;
                                                        if (((((CourseStarTimeArray.contains(ElecClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ElecClassMake.ClassEndTime)))
                                                                && (CourseDayArray.contains(ElecClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ElecClassMake.ExamTime)) && (CourseExamDayArray.contains(ElecClassMake.ExamDay)))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains(ElecClassMake.CourseName)) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (zebra) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (StudentSumNumberOfCourse + ElecClassMake.numberOfCourse > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                        StudentCourses.add(ElecClassMake.CourseName);
                                                                        NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                        IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                        ElecClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                        System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ElecClassMake.ClassEndTime))
                                                                            || (((CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) &&
                                                                            (CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassStartTime)))) && (CourseDayArray.contains(ElecClassMake.ClaasDay))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                        CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                        StudentCourses.add(ElecClassMake.CourseName);
                                                                        NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                        IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                        ElecClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                        System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }


                                                    }
                                                }
                                                if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                                    Mechanical_Engineering.ShowMECourse();
                                                    System.out.println("Choose Course : ");
                                                    sc.nextLine();
                                                    String ChooseCourse = sc.nextLine();
                                                    if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                        boolean fox = true;
                                                        if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeThermodynamics2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeThermodynamics2())))
                                                                && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeThermodynamics2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayThermodynamics2())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("Thermodynamics2")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (fox) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseThermodynamics2()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                        StudentCourses.add("Thermodynamics2");
                                                                        Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                        Thermodynamics2Capacity -= 1;
                                                                        NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                        IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                        System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        fox = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()))
                                                                            || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) &&
                                                                            (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                        StudentCourses.add("Thermodynamics2");
                                                                        Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                        Thermodynamics2Capacity -= 1;
                                                                        NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                        IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                        System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        fox = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }

                                                    } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                        boolean koala = true;
                                                        if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeStatic())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeStatic())))
                                                                && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeStatic())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayStatic())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("Static")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (koala) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i < CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseStatic()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                        StudentCourses.add("Static");
                                                                        NameOfStudentInCourseStatic.add(FullName);
                                                                        IdOfStudentInCourseStatic.add(StudentId);
                                                                        Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                        StaticCapacity -= 1;
                                                                        System.out.println("Static added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        koala = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()))
                                                                            || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) &&
                                                                            (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                        StudentCourses.add("Static");
                                                                        NameOfStudentInCourseStatic.add(FullName);
                                                                        IdOfStudentInCourseStatic.add(StudentId);
                                                                        Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                        StaticCapacity -= 1;
                                                                        System.out.println("Static added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        koala = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                        boolean chicken = true;
                                                        if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())))
                                                                && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2())))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains("ResistanceOfMaterials2")) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (chicken) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2()) > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;

                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                        StudentCourses.add("ResistanceOfMaterials2");
                                                                        Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                        ResistanceOfMaterials2Capacity -= 1;
                                                                        NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                        IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                        System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        chicken = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()))
                                                                            || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) &&
                                                                            (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                        CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                        CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                        CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                        CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                        StudentCourses.add("ResistanceOfMaterials2");
                                                                        Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                        StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                        ResistanceOfMaterials2Capacity -= 1;
                                                                        NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                        IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                        System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                        ok = true;
                                                                        yes = false;
                                                                        chicken = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                    else if (ChooseCourse.equals(MechClassMake.CourseName)||ChooseCourse.equals(MechClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                        boolean zebra = true;
                                                        if (((((CourseStarTimeArray.contains(MechClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(MechClassMake.ClassEndTime)))
                                                                && (CourseDayArray.contains(MechClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(MechClassMake.ExamTime)) && (CourseExamDayArray.contains(MechClassMake.ExamDay)))) {
                                                            System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                            ok = true;
                                                        } else {
                                                            if (StudentCourses.contains(MechClassMake.CourseName)) {
                                                                System.out.println("WARNING!! You picked this course.");
                                                                back();
                                                            } else if (zebra) {
                                                                CourseStarTimeArray.add(-1.3);
                                                                CourseEndTimeArray.add(-2.43);
                                                                for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                    if (StudentSumNumberOfCourse + MechClassMake.numberOfCourse > 20) {
                                                                        System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                        ok = true;
                                                                    } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                        CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                        CourseDayArray.add(MechClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                        StudentCourses.add(MechClassMake.CourseName);
                                                                        NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                        IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                        MechClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                        System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    } else if (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime && CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < MechClassMake.ClassEndTime))
                                                                            || (((CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) &&
                                                                            (CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > MechClassMake.ClassStartTime)))) && (CourseDayArray.contains(MechClassMake.ClaasDay))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                        break;
                                                                    } else {
                                                                        CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                        CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                        CourseDayArray.add(MechClassMake.ClaasDay);
                                                                        CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                        CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                        StudentCourses.add(MechClassMake.CourseName);
                                                                        NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                        IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                        MechClassMake.Capacity--;
                                                                        StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                        System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                        ok = true;
                                                                        yes = false;
                                                                        zebra = false;
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                        }


                                                    }
                                                }
                                                if (NewChooseDepartment.equals("Finish") || NextAnswer.equals("Finish")) {
                                                    System.out.println("Your Courses are : " + StudentCourses + " . The total number of selected courses : " + StudentSumNumberOfCourse);

                                                    break;

                                                }
                                            }

                                            } else if (NextAnswer.equals("Delete Course") || NextAnswer.equals("2")) {
                                                System.out.println("you want to Delete Course from your List. Please wait !!");
                                                System.out.println("Please enter the course that tou want to delete from your list : ");
                                                String DeleteAnswer = sc.next();
                                                if (StudentCourses.isEmpty()) {
                                                    System.out.println("You do not have any Courses in your List !!");
                                                } else if (StudentCourses.contains(DeleteAnswer)) {
                                                    StudentCourses.remove(DeleteAnswer);
                                                    if (DeleteAnswer.equals("Calculus2")) {
                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseCalculus2();
                                                        Mathematics_Department.DeleteCalculus2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeCalculus2());
                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeCalculus2());
                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeCalculus2());
                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayCalculus2());
                                                        IdOfStudentInCourseCalculus2.remove(StudentId);
                                                        NameOfStudentInCourseCalculus2.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("BasicsOfMathematics")) {
                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                        Mathematics_Department.DeleteBasicsOfMathematicsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                        IdOfStudentInCourseBasicMath.remove(StudentId);
                                                        NameOfStudentInCourseBasicMath.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("DifferentialEquations")) {
                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                        Mathematics_Department.DeleteDifferential_EquationsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                        IdOfStudentInCourseCDifferential_Equations.remove(StudentId);
                                                        NameOfStudentInCourseDifferential_Equations.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("AdvanceProgramming")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                        Computer_Engineering.DeleteAdvance_ProgrammingIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                        IdOfStudentInCourseAP.remove(StudentId);
                                                        NameOfStudentInCourseAP.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("LogicCircuits")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                        Computer_Engineering.DeleteLogic_CircuitsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                        IdOfStudentInCourseLogic_Circuits.remove(StudentId);
                                                        NameOfStudentInCourseLogic_Circuits.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("DiscreteStructures")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                        Computer_Engineering.DeleteDiscrete_StructuresIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                        IdOfStudentInCourseDiscrete_Structures.remove(StudentId);
                                                        NameOfStudentInCourseDiscrete_Structures.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("Electromagnetism")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                        Electrical_Engineering.DeleteElectromagnetismIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                        IdOfStudentInCourseElectromagnetism.remove(StudentId);
                                                        NameOfStudentInCourseElectromagnetism.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("Electronics2")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectronics2();
                                                        Electrical_Engineering.DeleteElectronics2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectronics2());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectronics2());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectronics2());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectronics2());
                                                        IdOfStudentInCourseElectronics2.remove(StudentId);
                                                        NameOfStudentInCourseElectronics2.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("BasicsOfElectricalEngineering2")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                        Electrical_Engineering.DeleteBasicsOfElectricalEngineering2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                        IdOfStudentInCourseBasicsOfElectrical2.remove(StudentId);
                                                        NameOfStudentInCourseBasicsOfElectrical2.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("Static")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseStatic();
                                                        Mechanical_Engineering.DeleteThermodynamics2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeStatic());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeStatic());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeStatic());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayStatic());
                                                        IdOfStudentInCourseStatic.remove(StudentId);
                                                        NameOfStudentInCourseStatic.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("Thermodynamics2")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                        Mechanical_Engineering.DeleteStaticIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                        IdOfStudentInCourseThermodynamics2.remove(StudentId);
                                                        NameOfStudentInCourseThermodynamics2.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals("ResistanceOfMaterials2")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                        Mechanical_Engineering.DeleteResistanceOfMaterials2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                        IdOfStudentInCourseResistanceOfMaterials2.remove(StudentId);
                                                        NameOfStudentInCourseResistanceOfMaterials2.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals(ClassMake.CourseName)||DeleteAnswer.equals(ClassMake.CourseCode)){
                                                        StudentSumNumberOfCourse -= ClassMake.numberOfCourse;
                                                        ClassMake.Capacity++;
                                                        CourseStarTimeArray.remove(ClassMake.ClassStartTime);
                                                        CourseEndTimeArray.remove(ClassMake.ClassEndTime);
                                                        CourseExamTimeArray.remove(ClassMake.ExamTime);
//                                                        Addy=false;
                                                        CourseExamDayArray.remove(ClassMake.ExamDay);
//                                                        Gof=false;
                                                        IdOfStudentInCourseMathClassMake.remove(StudentId);
                                                        NameOfStudentInCourseMathClassMAke.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals(ComClassMake.CourseName)||DeleteAnswer.equals(ComClassMake.CourseCode)){
                                                        StudentSumNumberOfCourse -= ComClassMake.numberOfCourse;
                                                        ComClassMake.Capacity++;
                                                        CourseStarTimeArray.remove(ComClassMake.ClassStartTime);
                                                        CourseEndTimeArray.remove(ComClassMake.ClassEndTime);
                                                        CourseExamTimeArray.remove(ComClassMake.ExamTime);
//                                                        Addy=false;
                                                        CourseExamDayArray.remove(ComClassMake.ExamDay);
//                                                        Gof=false;
                                                        IdOfStudentInCourseComClassMake.remove(StudentId);
                                                        NameOfStudentInCourseComClassMake.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals(ElecClassMake.CourseName)||DeleteAnswer.equals(ElecClassMake.CourseCode)){
                                                        StudentSumNumberOfCourse -= ElecClassMake.numberOfCourse;
                                                        ElecClassMake.Capacity++;
                                                        CourseStarTimeArray.remove(ElecClassMake.ClassStartTime);
                                                        CourseEndTimeArray.remove(ElecClassMake.ClassEndTime);
                                                        CourseExamTimeArray.remove(ElecClassMake.ExamTime);
//                                                        Addy=false;
                                                        CourseExamDayArray.remove(ElecClassMake.ExamDay);
//                                                        Gof=false;
                                                        IdOfStudentInCourseElecMakeClass.remove(StudentId);
                                                        NameOfStudentInCourseElecMakeClass.remove(FullName);
                                                    }
                                                    if (DeleteAnswer.equals(MechClassMake.CourseName)||DeleteAnswer.equals(MechClassMake.CourseCode)){
                                                        StudentSumNumberOfCourse -= MechClassMake.numberOfCourse;
                                                        MechClassMake.Capacity++;
                                                        CourseStarTimeArray.remove(MechClassMake.ClassStartTime);
                                                        CourseEndTimeArray.remove(MechClassMake.ClassEndTime);
                                                        CourseExamTimeArray.remove(MechClassMake.ExamTime);
//                                                        Addy=false;
                                                        CourseExamDayArray.remove(MechClassMake.ExamDay);
//                                                        Gof=false;
                                                        IdOfStudentInCourseMechMakeClass.remove(StudentId);
                                                        NameOfStudentInCourseMechMakeClass.remove(FullName);
                                                    }
                                                    System.out.println("Delete course from your list successfully !!");
                                                } else if (!StudentCourses.contains(DeleteAnswer)) {
                                                    System.out.println("You do not have this course in your List !!");
                                                }
                                                System.out.println("Your Courses are : " + StudentCourses);

                                            } else if (NextAnswer.equals("Shows Department Courses") || NextAnswer.equals("3")) {
                                                System.out.println("You want to see departments courses . Please Choose a Department that you want :");
                                                System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                String ChooseDepartment = sc.next();
                                                if (ChooseDepartment.equals("Back")) {
                                                    back();
                                                } else if (ChooseDepartment.equals("Mathematics") || ChooseDepartment.equals("1")) {
                                                    Mathematics_Department.ShowMCourse();
                                                } else if (ChooseDepartment.equals("ComputerEngineering") || ChooseDepartment.equals("2")) {
                                                    Computer_Engineering.ShowCECourse();
                                                } else if (ChooseDepartment.equals("Electrical Engineering") || ChooseDepartment.equals("3")) {
                                                    Electrical_Engineering.ShowEECourse();
                                                } else if (ChooseDepartment.equals("Mechanical Engineering") || ChooseDepartment.equals("4")) {
                                                    Mechanical_Engineering.ShowMECourse();
                                                }

                                                do {


                                                    System.out.println("Now what do you want to do? ");
                                                    System.out.println("1 : Add Course : ");
                                                    System.out.println("2 : Delete Course : ");
                                                    System.out.println("3 : Show my courses : ");
                                                    System.out.println("4 : Back to Main Menu : ");
                                                    System.out.println("5 : Back one step : ");
                                                    String NewAnswer = sc.next();
                                                    if (NewAnswer.equals("1") || NewAnswer.equals("Add Course")) {
                                                        if (StudentSumNumberOfCourse >= 20) {
                                                            System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                            back();
                                                        } else {
                                                            System.out.println("From which department you want to add course? ");
                                                            System.out.println("( 1: Mathematics , 2 : Computer Engineering ,  3 : Electrical Engineering ,  4 : Mechanical Engineering ) ");
                                                            String NewChooseDepartment = sc.next();
                                                            if (NewChooseDepartment.equals("Back")) {
                                                                back();
                                                            } else if (NewChooseDepartment.equals("Mathematics") || NewChooseDepartment.equals("1")) {
                                                                Mathematics_Department.ShowMCourse();
                                                                System.out.println("Choose Course : ");
                                                                sc.nextLine();
                                                                String ChooseCourse = sc.nextLine();
                                                                if (ChooseCourse.equals("Calculus2") || ChooseCourse.equals(Mathematics_Department.CourseCodeCalculus2())) {
                                                                    boolean rabbit = true;
                                                                    if ((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeCalculus2())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeCalculus2())))
                                                                            && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeCalculus2())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayCalculus2())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {

                                                                        if (StudentCourses.contains("Calculus2")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (rabbit) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseCalculus2()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                                    StudentCourses.add("Calculus2");
                                                                                    NameOfStudentInCourseCalculus2.add(FullName);
                                                                                    IdOfStudentInCourseCalculus2.add(StudentId);
                                                                                    Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                                    Calculus2Capacity -= 1;
                                                                                    System.out.println("Calculus2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    rabbit = false;
                                                                                    break;

                                                                                } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeCalculus2()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeCalculus2()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeCalculus2()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeCalculus2())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayCalculus2()))) {
                                                                                    System.out.println("You are not able to Add course cause of Class time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeCalculus2());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeCalculus2());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayCalculus2());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayCalculus2());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeCalculus2());
                                                                                    StudentCourses.add("Calculus2");
                                                                                    NameOfStudentInCourseCalculus2.add(FullName);
                                                                                    IdOfStudentInCourseCalculus2.add(StudentId);
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseCalculus2();
                                                                                    Mathematics_Department.AddCalculus2DecreaseCapacity();
                                                                                    Calculus2Capacity -= 1;
                                                                                    System.out.println("Calculus2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    rabbit = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }

                                                                } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals(Mathematics_Department.CourseCodeBasicsOfMathematics())) {
                                                                    boolean goat = true;
                                                                    if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeBasicsOfMathematics())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeBasicsOfMathematics())))
                                                                            && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeBasicsOfMathematics())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayBasicsOfMathematics())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("BasicsOfMathematics")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (goat) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseBasicsOfMathematics()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                                    StudentCourses.add("BasicsOfMathematics");
                                                                                    Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                                    BasicMathCapacity -= 1;
                                                                                    NameOfStudentInCourseBasicMath.add(FullName);
                                                                                    IdOfStudentInCourseBasicMath.add(StudentId);
                                                                                    System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    goat = true;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeBasicsOfMathematics())) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeBasicsOfMathematics()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeBasicsOfMathematics()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeBasicsOfMathematics()))) && (CourseDayArray.contains(Mathematics_Department.ClassDayBasicsOfMathematics()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayBasicsOfMathematics());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                                    StudentCourses.add("BasicsOfMathematics");
                                                                                    Mathematics_Department.AddBasicsOfMathematicsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                                    System.out.println("Basics Of Mathematics added to your courses successfully !!");
                                                                                    BasicMathCapacity -= 1;
                                                                                    NameOfStudentInCourseBasicMath.add(FullName);
                                                                                    IdOfStudentInCourseBasicMath.add(StudentId);
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    goat = true;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }

                                                                } else if (ChooseCourse.equals("DifferentialEquations") || ChooseCourse.equals(Mathematics_Department.CpurseCodeDifferential_Equations())) {
                                                                    boolean zebra = true;
                                                                    if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                            && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("DifferentialEquations")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (zebra) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (StudentSumNumberOfCourse + Mathematics_Department.NumberOfCourseDifferential_Equations() > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                                    StudentCourses.add("DifferentialEquations");
                                                                                    NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                                    IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                                    Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                                    System.out.println("Differential Equations added to your courses successfully !!");
                                                                                    Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations() && CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) || (((CourseStarTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) && (CourseStarTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && CourseEndTimeArray.get(i) > Mathematics_Department.CourseEndTimeDifferential_Equations()) || ((CourseEndTimeArray.get(i) < Mathematics_Department.CourseEndTimeDifferential_Equations()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mathematics_Department.CourseStartTimeDifferential_Equations()) && (CourseEndTimeArray.get(i) > Mathematics_Department.CourseStartTimeDifferential_Equations())))) && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                                    CourseEndTimeArray.add(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                                    CourseDayArray.add(Mathematics_Department.ClassDayDifferential_Equations());
                                                                                    CourseExamDayArray.add(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                                    CourseExamTimeArray.add(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                                    StudentCourses.add("DifferentialEquations");
                                                                                    Mathematics_Department.AddDifferential_EquationsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                                    Differential_EquationsCapacity -= 1;
                                                                                    NameOfStudentInCourseDifferential_Equations.add(FullName);
                                                                                    IdOfStudentInCourseCDifferential_Equations.add(StudentId);
                                                                                    System.out.println("Differential Equations added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                                else if (ChooseCourse.equals(ClassMake.CourseName)||ChooseCourse.equals(ClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                                    boolean zebra = true;
                                                                    if (((((CourseStarTimeArray.contains(Mathematics_Department.CourseStartTimeDifferential_Equations())) || (CourseEndTimeArray.contains(Mathematics_Department.CourseEndTimeDifferential_Equations())))
                                                                            && (CourseDayArray.contains(Mathematics_Department.ClassDayDifferential_Equations())))) || ((CourseExamTimeArray.contains(Mathematics_Department.CourseExamTimeDifferential_Equations())) && (CourseExamDayArray.contains(Mathematics_Department.CourseExamDayDifferential_Equations())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains(ClassMake.CourseName)) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (zebra) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (StudentSumNumberOfCourse + ClassMake.numberOfCourse > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                                    StudentCourses.add(ClassMake.CourseName);
                                                                                    NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                                    IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                                    ClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                                    System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ClassMake.ClassEndTime))
                                                                                        || (((CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ClassMake.ClassEndTime) &&
                                                                                        (CourseStarTimeArray.get(i) < ClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ClassMake.ClassStartTime)))) && (CourseDayArray.contains(ClassMake.ClaasDay))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(ClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ClassMake.ExamTime);
                                                                                    StudentCourses.add(ClassMake.CourseName);
                                                                                    NameOfStudentInCourseMathClassMAke.add(FullName);
                                                                                    IdOfStudentInCourseMathClassMake.add(StudentId);
                                                                                    ClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ClassMake.numberOfCourse;
                                                                                    System.out.println( ClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }


                                                                }

                                                            }
                                                            if (NewChooseDepartment.equals("ComputerEngineering") || NewChooseDepartment.equals("2")) {
                                                                Computer_Engineering.ShowCECourse();
                                                                System.out.println("Choose Course : ");
                                                                sc.nextLine();
                                                                String ChooseCourse = sc.nextLine();
                                                                if (ChooseCourse.equals("AdvanceProgramming") || ChooseCourse.equals("40244")) {
                                                                    boolean lion = true;
                                                                    if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeAdvance_Programming())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeAdvance_Programming())))
                                                                            && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeAdvance_Programming())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayAdvance_Programming())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("AdvanceProgramming")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (lion) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseAdvance_Programming()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                                    StudentCourses.add("AdvanceProgramming");
                                                                                    Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                                    ApCapacity -= 1;
                                                                                    NameOfStudentInCourseAP.add(FullName);
                                                                                    IdOfStudentInCourseAP.add(StudentId);
                                                                                    System.out.println("Advance Programming added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    lion = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()))
                                                                                        || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeAdvance_Programming()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeAdvance_Programming()) &&
                                                                                        (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeAdvance_Programming()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeAdvance_Programming())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayAdvance_Programming()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayAdvance_Programming());
                                                                                    Computer_Engineering.AddAdvance_ProgrammingDecreaseCapacity();
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                                    StudentCourses.add("AdvanceProgramming");
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                                    ApCapacity -= 1;
                                                                                    NameOfStudentInCourseAP.add(FullName);
                                                                                    IdOfStudentInCourseAP.add(StudentId);
                                                                                    System.out.println("Advance Programming added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    lion = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }

                                                                    }
                                                                } else if (ChooseCourse.equals("LogicCircuits") || ChooseCourse.equals("40212")) {
                                                                    boolean horse = true;
                                                                    if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeLogic_Circuits())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeLogic_Circuits())))
                                                                            && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeLogic_Circuits())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayLogic_Circuits())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("LogicCircuits")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (horse) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseLogic_Circuits()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                                    StudentCourses.add("LogicCircuits");
                                                                                    Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                                    Logic_CircuitsCapacity -= 1;
                                                                                    NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                                    IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                                    System.out.println("Logic Circuits added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    horse = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()))
                                                                                        || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeLogic_Circuits()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeLogic_Circuits()) &&
                                                                                        (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeLogic_Circuits()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeLogic_Circuits())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayLogic_Circuits()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayLogic_Circuits());
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                                    StudentCourses.add("LogicCircuits");
                                                                                    Computer_Engineering.AddLogic_CircuitsDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                                    Logic_CircuitsCapacity -= 1;
                                                                                    NameOfStudentInCourseLogic_Circuits.add(FullName);
                                                                                    IdOfStudentInCourseLogic_Circuits.add(StudentId);
                                                                                    System.out.println("Logic Circuits added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    horse = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (ChooseCourse.equals("DiscreteStructures") || ChooseCourse.equals("40115")) {
                                                                    boolean donkey = true;
                                                                    if (((((CourseStarTimeArray.contains(Computer_Engineering.CourseStartTimeDiscrete_Structures())) || (CourseEndTimeArray.contains(Computer_Engineering.CourseEndTimeDiscrete_Structures())))
                                                                            && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures())))) || ((CourseExamTimeArray.contains(Computer_Engineering.CourseExamTimeDiscrete_Structures())) && (CourseExamDayArray.contains(Computer_Engineering.CourseExamDayDiscrete_Structures())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("DiscreteStructures")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (donkey) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Computer_Engineering.NumberOfCourseDiscrete_Structures()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                                    StudentCourses.add("DiscreteStructures");
                                                                                    Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                                    Discrete_StructuresCapacity -= 1;
                                                                                    NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                                    IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                                    System.out.println("discrete Structures added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    donkey = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures() && CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) || (((CourseStarTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) && (CourseStarTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()))
                                                                                        || (((CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && CourseEndTimeArray.get(i) > Computer_Engineering.CourseEndTimeDiscrete_Structures()) || ((CourseEndTimeArray.get(i) < Computer_Engineering.CourseEndTimeDiscrete_Structures()) &&
                                                                                        (CourseStarTimeArray.get(i) < Computer_Engineering.CourseStartTimeDiscrete_Structures()) && (CourseEndTimeArray.get(i) > Computer_Engineering.CourseStartTimeDiscrete_Structures())))) && (CourseDayArray.contains(Computer_Engineering.ClassDayDiscrete_Structures()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                                    CourseEndTimeArray.add(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                                    CourseDayArray.add(Computer_Engineering.ClassDayDiscrete_Structures());
                                                                                    CourseExamDayArray.add(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                                    CourseExamTimeArray.add(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                                    StudentCourses.add("DiscreteStructures");
                                                                                    Computer_Engineering.AddDiscrete_StructuresDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                                    System.out.println("discrete Structures added to your courses successfully !!");
                                                                                    Discrete_StructuresCapacity -= 1;
                                                                                    NameOfStudentInCourseDiscrete_Structures.add(FullName);
                                                                                    IdOfStudentInCourseDiscrete_Structures.add(StudentId);
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    donkey = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (ChooseCourse.equals(ComClassMake.CourseName)||ChooseCourse.equals(ComClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                                    boolean zebra = true;
                                                                    if (((((CourseStarTimeArray.contains(ComClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ComClassMake.ClassEndTime)))
                                                                            && (CourseDayArray.contains(ComClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ComClassMake.ExamTime)) && (CourseExamDayArray.contains(ComClassMake.ExamDay)))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains(ComClassMake.CourseName)) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (zebra) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (StudentSumNumberOfCourse + ComClassMake.numberOfCourse > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ComClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                                    StudentCourses.add(ComClassMake.CourseName);
                                                                                    NameOfStudentInCourseComClassMake.add(FullName);
                                                                                    IdOfStudentInCourseComClassMake.add(StudentId);
                                                                                    ComClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                                    System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ComClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ComClassMake.ClassEndTime))
                                                                                        || (((CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ComClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ComClassMake.ClassEndTime) &&
                                                                                        (CourseStarTimeArray.get(i) < ComClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ComClassMake.ClassStartTime)))) && (CourseDayArray.contains(ComClassMake.ClaasDay))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(ComClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ComClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ComClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ComClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ComClassMake.ExamTime);
                                                                                    StudentCourses.add(ComClassMake.CourseName);
                                                                                    NameOfStudentInCourseComClassMake.add(FullName);
                                                                                    IdOfStudentInCourseComClassMake.add(StudentId);
                                                                                    ComClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ComClassMake.numberOfCourse;
                                                                                    System.out.println( ComClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }


                                                                }
                                                            }
                                                            if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                                                Electrical_Engineering.ShowEECourse();
                                                                System.out.println("Choose Course : ");
                                                                sc.nextLine();
                                                                String ChooseCourse = sc.nextLine();
                                                                if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                                    boolean caty = true;
                                                                    if (((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectromagnetism())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectromagnetism())))
                                                                            && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism())))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectromagnetism())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectromagnetism())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {

                                                                        if (StudentCourses.contains("Electromagnetism")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (caty) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectromagnetism()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    continue;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                                    StudentCourses.add("Electromagnetism");
                                                                                    Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                                    ElectromagnetismCapacity -= 1;
                                                                                    NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                                    IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                                    System.out.println("Electromagnetism added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    caty = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()))
                                                                                        || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectromagnetism()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectromagnetism()) &&
                                                                                        (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectromagnetism()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectromagnetism())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectromagnetism()))) {
                                                                                    System.out.println("You are not able to Add course cause of class time limit !! ");
                                                                                    ok = true;
                                                                                    break;

                                                                                } else {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayElectromagnetism());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                                    StudentCourses.add("Electromagnetism");
                                                                                    NameOfStudentInCourseElectromagnetism.add(FullName);
                                                                                    IdOfStudentInCourseElectromagnetism.add(StudentId);
                                                                                    Electrical_Engineering.AddElectromagnetismDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                                    ElectromagnetismCapacity -= 1;
                                                                                    System.out.println("Electromagnetism added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    caty = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }

                                                                    }
                                                                } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                                    boolean doggy = true;
                                                                    if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeElectronics2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeElectronics2())))
                                                                            && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeElectronics2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayElectronics2())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("Electronics2")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (doggy) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseElectronics2()) > 20)) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
//                                                                     continue;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                                    StudentCourses.add("Electronics2");
                                                                                    NameOfStudentInCourseElectronics2.add(FullName);
                                                                                    IdOfStudentInCourseElectronics2.add(StudentId);
                                                                                    Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();

                                                                                    Electronics2Capacity -= 1;
                                                                                    System.out.println("Electronics 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    doggy = false;
                                                                                    break;

                                                                                } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()))
                                                                                        || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeElectronics2()) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeElectronics2()) &&
                                                                                        (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeElectronics2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeElectronics2())))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayElectronics2()))) {
                                                                                    System.out.println("You are not able to Add course cause of class time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayElectronics2());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayElectronics2());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                                    StudentCourses.add("Electronics2");
                                                                                    NameOfStudentInCourseElectronics2.add(FullName);
                                                                                    IdOfStudentInCourseElectronics2.add(StudentId);
                                                                                    Electrical_Engineering.AddElectronics2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseElectronics2();
                                                                                    Electronics2Capacity -= 1;
                                                                                    System.out.println("Electronics 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    doggy = false;
                                                                                    break;

//
                                                                                }


                                                                            }
                                                                        }


                                                                    }
                                                                } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                                    boolean monkey = true;
                                                                    if ((((CourseStarTimeArray.contains(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) || (CourseEndTimeArray.contains(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())))
                                                                            && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) || ((CourseExamTimeArray.contains(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2())) && (CourseExamDayArray.contains(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;

                                                                    } else {

                                                                        if (StudentCourses.contains("BasicsOfElectricalEngineering2")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (monkey) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                                    StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                                    Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                                    BasicsOfElectrical2_Capacity -= 1;
                                                                                    NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                                    IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                                    System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    monkey = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2() && CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) || (((CourseStarTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2())) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) && (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()))
                                                                                        || (((CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && CourseEndTimeArray.get(i) > Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2())) || ((CourseEndTimeArray.get(i) < Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2()) &&
                                                                                        (CourseStarTimeArray.get(i) < Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()) && (CourseEndTimeArray.get(i) > Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2()))) && (CourseDayArray.contains(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                                    CourseEndTimeArray.add(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                                    CourseDayArray.add(Electrical_Engineering.ClassDayBasicsOfElectricalEngineering2());
                                                                                    CourseExamDayArray.add(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                                    CourseExamTimeArray.add(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                                    StudentCourses.add("BasicsOfElectricalEngineering2");
                                                                                    Electrical_Engineering.AddBasicsOfElectricalEngineering2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                                    BasicsOfElectrical2_Capacity -= 1;
                                                                                    NameOfStudentInCourseBasicsOfElectrical2.add(FullName);
                                                                                    IdOfStudentInCourseBasicsOfElectrical2.add(StudentId);
                                                                                    System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    monkey = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (ChooseCourse.equals(ElecClassMake.CourseName)||ChooseCourse.equals(ElecClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                                    boolean zebra = true;
                                                                    if (((((CourseStarTimeArray.contains(ElecClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(ElecClassMake.ClassEndTime)))
                                                                            && (CourseDayArray.contains(ElecClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(ElecClassMake.ExamTime)) && (CourseExamDayArray.contains(ElecClassMake.ExamDay)))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains(ElecClassMake.CourseName)) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (zebra) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (StudentSumNumberOfCourse + ElecClassMake.numberOfCourse > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                                    StudentCourses.add(ElecClassMake.CourseName);
                                                                                    NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                                    IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                                    ElecClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                                    System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime && CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > ElecClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < ElecClassMake.ClassEndTime))
                                                                                        || (((CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > ElecClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < ElecClassMake.ClassEndTime) &&
                                                                                        (CourseStarTimeArray.get(i) < ElecClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > ElecClassMake.ClassStartTime)))) && (CourseDayArray.contains(ElecClassMake.ClaasDay))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(ElecClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(ElecClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(ElecClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(ElecClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(ElecClassMake.ExamTime);
                                                                                    StudentCourses.add(ElecClassMake.CourseName);
                                                                                    NameOfStudentInCourseElecMakeClass.add(FullName);
                                                                                    IdOfStudentInCourseElecMakeClass.add(StudentId);
                                                                                    ElecClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += ElecClassMake.numberOfCourse;
                                                                                    System.out.println( ElecClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }


                                                                }
                                                            }
                                                            if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                                                Mechanical_Engineering.ShowMECourse();
                                                                System.out.println("Choose Course : ");
                                                                sc.nextLine();
                                                                String ChooseCourse = sc.nextLine();
                                                                if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                                    boolean fox = true;
                                                                    if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeThermodynamics2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeThermodynamics2())))
                                                                            && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeThermodynamics2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayThermodynamics2())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("Thermodynamics2")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (fox) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseThermodynamics2()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                                    StudentCourses.add("Thermodynamics2");
                                                                                    Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                                    Thermodynamics2Capacity -= 1;
                                                                                    NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                                    IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                                    System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    fox = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeThermodynamics2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeThermodynamics2()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeThermodynamics2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeThermodynamics2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayThermodynamics2()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayThermodynamics2());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                                    StudentCourses.add("Thermodynamics2");
                                                                                    Mechanical_Engineering.AddThermodynamics2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                                    Thermodynamics2Capacity -= 1;
                                                                                    NameOfStudentInCourseThermodynamics2.add(FullName);
                                                                                    IdOfStudentInCourseThermodynamics2.add(StudentId);
                                                                                    System.out.println("Thermodynamics 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    fox = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }

                                                                } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                                    boolean koala = true;
                                                                    if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeStatic())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeStatic())))
                                                                            && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeStatic())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayStatic())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("Static")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (koala) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i < CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseStatic()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                                    StudentCourses.add("Static");
                                                                                    NameOfStudentInCourseStatic.add(FullName);
                                                                                    IdOfStudentInCourseStatic.add(StudentId);
                                                                                    Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                                    StaticCapacity -= 1;
                                                                                    System.out.println("Static added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    koala = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeStatic())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeStatic()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeStatic()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeStatic()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayStatic()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeStatic());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeStatic());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayStatic());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayStatic());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeStatic());
                                                                                    StudentCourses.add("Static");
                                                                                    NameOfStudentInCourseStatic.add(FullName);
                                                                                    IdOfStudentInCourseStatic.add(StudentId);
                                                                                    Mechanical_Engineering.AddStaticDecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseStatic();
                                                                                    StaticCapacity -= 1;
                                                                                    System.out.println("Static added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    koala = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }
                                                                } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                                    boolean chicken = true;
                                                                    if ((((CourseStarTimeArray.contains(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) || (CourseEndTimeArray.contains(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())))
                                                                            && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) || ((CourseExamTimeArray.contains(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2())) && (CourseExamDayArray.contains(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2())))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains("ResistanceOfMaterials2")) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (chicken) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if ((StudentSumNumberOfCourse + Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2()) > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;

                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                                    StudentCourses.add("ResistanceOfMaterials2");
                                                                                    Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                                    ResistanceOfMaterials2Capacity -= 1;
                                                                                    NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                                    IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                                    System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    chicken = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2() && CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) || (((CourseStarTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2())) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) && (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()))
                                                                                        || (((CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2())) || ((CourseEndTimeArray.get(i) < Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2()) &&
                                                                                        (CourseStarTimeArray.get(i) < Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()) && (CourseEndTimeArray.get(i) > Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2()))) && (CourseDayArray.contains(Mechanical_Engineering.ClassDayResistanceOfMaterials2()))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                                    CourseEndTimeArray.add(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                                    CourseDayArray.add(Mechanical_Engineering.ClassDayResistanceOfMaterials2());
                                                                                    CourseExamDayArray.add(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                                    CourseExamTimeArray.add(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                                    StudentCourses.add("ResistanceOfMaterials2");
                                                                                    Mechanical_Engineering.AddResistanceOfMaterials2DecreaseCapacity();
                                                                                    StudentSumNumberOfCourse += Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                                    ResistanceOfMaterials2Capacity -= 1;
                                                                                    NameOfStudentInCourseResistanceOfMaterials2.add(FullName);
                                                                                    IdOfStudentInCourseResistanceOfMaterials2.add(StudentId);
                                                                                    System.out.println("Resistance of materials 2 added to your courses successfully !!");
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    chicken = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                                else if (ChooseCourse.equals(MechClassMake.CourseName)||ChooseCourse.equals(MechClassMake.CourseCode)){
//                                                            Gof=false;
//                                                            Hey = false;
                                                                    boolean zebra = true;
                                                                    if (((((CourseStarTimeArray.contains(MechClassMake.ClassStartTime)) || (CourseEndTimeArray.contains(MechClassMake.ClassEndTime)))
                                                                            && (CourseDayArray.contains(MechClassMake.ClaasDay)))) || ((CourseExamTimeArray.contains(MechClassMake.ExamTime)) && (CourseExamDayArray.contains(MechClassMake.ExamDay)))) {
                                                                        System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                        ok = true;
                                                                    } else {
                                                                        if (StudentCourses.contains(MechClassMake.CourseName)) {
                                                                            System.out.println("WARNING!! You picked this course.");
                                                                            back();
                                                                        } else if (zebra) {
                                                                            CourseStarTimeArray.add(-1.3);
                                                                            CourseEndTimeArray.add(-2.43);
                                                                            for (int i = 1; i <= CourseStarTimeArray.size(); i++) {
                                                                                if (StudentSumNumberOfCourse + MechClassMake.numberOfCourse > 20) {
                                                                                    System.out.println("You are not able to Add course cause of total number of courses limit !! ");
                                                                                    ok = true;
                                                                                } else if (CourseStarTimeArray.size() == 1 || CourseEndTimeArray.size() == 1) {
                                                                                    CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(MechClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                                    StudentCourses.add(MechClassMake.CourseName);
                                                                                    NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                                    IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                                    MechClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                                    System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                } else if (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime && CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) || (((CourseStarTimeArray.get(i) > MechClassMake.ClassStartTime)) && (CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) && (CourseStarTimeArray.get(i) < MechClassMake.ClassEndTime))
                                                                                        || (((CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && CourseEndTimeArray.get(i) > MechClassMake.ClassEndTime) || ((CourseEndTimeArray.get(i) < MechClassMake.ClassEndTime) &&
                                                                                        (CourseStarTimeArray.get(i) < MechClassMake.ClassStartTime) && (CourseEndTimeArray.get(i) > MechClassMake.ClassStartTime)))) && (CourseDayArray.contains(MechClassMake.ClaasDay))) {
                                                                                    System.out.println("WARNING!! You are not able to Add this course cause of time limit !!");
                                                                                    ok = true;
                                                                                    break;
                                                                                } else {
                                                                                    CourseStarTimeArray.add(MechClassMake.ClassStartTime);
                                                                                    CourseEndTimeArray.add(MechClassMake.ClassEndTime);
                                                                                    CourseDayArray.add(MechClassMake.ClaasDay);
                                                                                    CourseExamDayArray.add(MechClassMake.ExamDay);
                                                                                    CourseExamTimeArray.add(MechClassMake.ExamTime);
                                                                                    StudentCourses.add(MechClassMake.CourseName);
                                                                                    NameOfStudentInCourseMechMakeClass.add(FullName);
                                                                                    IdOfStudentInCourseMechMakeClass.add(StudentId);
                                                                                    MechClassMake.Capacity--;
                                                                                    StudentSumNumberOfCourse += MechClassMake.numberOfCourse;
                                                                                    System.out.println( MechClassMake.CourseName + "  added to your courses successfully !!");
//                                                                                                            Differential_EquationsCapacity -= 1;
                                                                                    ok = true;
                                                                                    yes = false;
                                                                                    zebra = false;
                                                                                    break;
                                                                                }

                                                                            }
                                                                        }
                                                                    }


                                                                }
                                                            }
                                                            if (NewChooseDepartment.equals("Finish") || NextAnswer.equals("Finish")) {
                                                                System.out.println("Your Courses are : " + StudentCourses + " . The total number of selected courses : " + StudentSumNumberOfCourse);

                                                                break;

                                                            }
                                                        }

                                                    }
                                                    else if (NextAnswer.equals("Delete Course") || NextAnswer.equals("2")) {
                                                        System.out.println("you want to Delete Course from your List. Please wait !!");
                                                        System.out.println("Please enter the course that tou want to delete from your list : ");
                                                        String DeleteAnswer = sc.next();
                                                        if (StudentCourses.isEmpty()) {
                                                            System.out.println("You do not have any Courses in your List !!");
                                                        } else if (StudentCourses.contains(DeleteAnswer)) {
                                                            StudentCourses.remove(DeleteAnswer);
                                                            if (DeleteAnswer.equals("Calculus2")) {
                                                                StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseCalculus2();
                                                                Mathematics_Department.DeleteCalculus2IncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeCalculus2());
                                                                CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeCalculus2());
                                                                CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeCalculus2());
                                                                CourseExamDayArray.remove(Mathematics_Department.CourseExamDayCalculus2());
                                                                IdOfStudentInCourseCalculus2.remove(StudentId);
                                                                NameOfStudentInCourseCalculus2.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("BasicsOfMathematics")) {
                                                                StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                                Mathematics_Department.DeleteBasicsOfMathematicsIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                                CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                                CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                                CourseExamDayArray.remove(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                                IdOfStudentInCourseBasicMath.remove(StudentId);
                                                                NameOfStudentInCourseBasicMath.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("DifferentialEquations")) {
                                                                StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                                Mathematics_Department.DeleteDifferential_EquationsIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                                CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                                CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                                CourseExamDayArray.remove(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                                IdOfStudentInCourseCDifferential_Equations.remove(StudentId);
                                                                NameOfStudentInCourseDifferential_Equations.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("AdvanceProgramming")) {
                                                                StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                                Computer_Engineering.DeleteAdvance_ProgrammingIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                                CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                                CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                                CourseExamDayArray.remove(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                                IdOfStudentInCourseAP.remove(StudentId);
                                                                NameOfStudentInCourseAP.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("LogicCircuits")) {
                                                                StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                                Computer_Engineering.DeleteLogic_CircuitsIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                                CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                                CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                                CourseExamDayArray.remove(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                                IdOfStudentInCourseLogic_Circuits.remove(StudentId);
                                                                NameOfStudentInCourseLogic_Circuits.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("DiscreteStructures")) {
                                                                StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                                Computer_Engineering.DeleteDiscrete_StructuresIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                                CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                                CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                                CourseExamDayArray.remove(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                                IdOfStudentInCourseDiscrete_Structures.remove(StudentId);
                                                                NameOfStudentInCourseDiscrete_Structures.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("Electromagnetism")) {
                                                                StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                                Electrical_Engineering.DeleteElectromagnetismIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                                CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                                CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                                CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                                IdOfStudentInCourseElectromagnetism.remove(StudentId);
                                                                NameOfStudentInCourseElectromagnetism.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("Electronics2")) {
                                                                StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectronics2();
                                                                Electrical_Engineering.DeleteElectronics2IncreaseCapacity();
                                                                CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectronics2());
                                                                CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectronics2());
                                                                CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectronics2());
                                                                CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectronics2());
                                                                IdOfStudentInCourseElectronics2.remove(StudentId);
                                                                NameOfStudentInCourseElectronics2.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("BasicsOfElectricalEngineering2")) {
                                                                StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                                Electrical_Engineering.DeleteBasicsOfElectricalEngineering2IncreaseCapacity();
                                                                CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                                CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                                CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                                CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                                IdOfStudentInCourseBasicsOfElectrical2.remove(StudentId);
                                                                NameOfStudentInCourseBasicsOfElectrical2.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("Static")) {
                                                                StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseStatic();
                                                                Mechanical_Engineering.DeleteThermodynamics2IncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeStatic());
                                                                CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeStatic());
                                                                CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeStatic());
                                                                CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayStatic());
                                                                IdOfStudentInCourseStatic.remove(StudentId);
                                                                NameOfStudentInCourseStatic.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("Thermodynamics2")) {
                                                                StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                                Mechanical_Engineering.DeleteStaticIncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                                CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                                CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                                CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                                IdOfStudentInCourseThermodynamics2.remove(StudentId);
                                                                NameOfStudentInCourseThermodynamics2.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals("ResistanceOfMaterials2")) {
                                                                StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                                Mechanical_Engineering.DeleteResistanceOfMaterials2IncreaseCapacity();
                                                                CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                                CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                                CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                                CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                                IdOfStudentInCourseResistanceOfMaterials2.remove(StudentId);
                                                                NameOfStudentInCourseResistanceOfMaterials2.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals(ClassMake.CourseName)||DeleteAnswer.equals(ClassMake.CourseCode)){
                                                                StudentSumNumberOfCourse -= ClassMake.numberOfCourse;
                                                                ClassMake.Capacity++;
                                                                CourseStarTimeArray.remove(ClassMake.ClassStartTime);
                                                                CourseEndTimeArray.remove(ClassMake.ClassEndTime);
                                                                CourseExamTimeArray.remove(ClassMake.ExamTime);
//                                                                Addy=false;
                                                                CourseExamDayArray.remove(ClassMake.ExamDay);
//                                                                Gof=false;
                                                                IdOfStudentInCourseMathClassMake.remove(StudentId);
                                                                NameOfStudentInCourseMathClassMAke.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals(ComClassMake.CourseName)||DeleteAnswer.equals(ComClassMake.CourseCode)){
                                                                StudentSumNumberOfCourse -= ComClassMake.numberOfCourse;
                                                                ComClassMake.Capacity++;
                                                                CourseStarTimeArray.remove(ComClassMake.ClassStartTime);
                                                                CourseEndTimeArray.remove(ComClassMake.ClassEndTime);
                                                                CourseExamTimeArray.remove(ComClassMake.ExamTime);
//                                                                Addy=false;
                                                                CourseExamDayArray.remove(ComClassMake.ExamDay);
//                                                                Gof=false;
                                                                IdOfStudentInCourseComClassMake.remove(StudentId);
                                                                NameOfStudentInCourseComClassMake.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals(ElecClassMake.CourseName)||DeleteAnswer.equals(ElecClassMake.CourseCode)){
                                                                StudentSumNumberOfCourse -= ElecClassMake.numberOfCourse;
                                                                ElecClassMake.Capacity++;
                                                                CourseStarTimeArray.remove(ElecClassMake.ClassStartTime);
                                                                CourseEndTimeArray.remove(ElecClassMake.ClassEndTime);
                                                                CourseExamTimeArray.remove(ElecClassMake.ExamTime);
//                                                                Addy=false;
                                                                CourseExamDayArray.remove(ElecClassMake.ExamDay);
//                                                                Gof=false;
                                                                IdOfStudentInCourseElecMakeClass.remove(StudentId);
                                                                NameOfStudentInCourseElecMakeClass.remove(FullName);
                                                            }
                                                            if (DeleteAnswer.equals(MechClassMake.CourseName)||DeleteAnswer.equals(MechClassMake.CourseCode)){
                                                                StudentSumNumberOfCourse -= MechClassMake.numberOfCourse;
                                                                MechClassMake.Capacity++;
                                                                CourseStarTimeArray.remove(MechClassMake.ClassStartTime);
                                                                CourseEndTimeArray.remove(MechClassMake.ClassEndTime);
                                                                CourseExamTimeArray.remove(MechClassMake.ExamTime);
//                                                                Addy=false;
                                                                CourseExamDayArray.remove(MechClassMake.ExamDay);
//                                                                Gof=false;
                                                                IdOfStudentInCourseMechMakeClass.remove(StudentId);
                                                                NameOfStudentInCourseMechMakeClass.remove(FullName);
                                                            }
                                                            System.out.println("Delete course from your list successfully !!");
                                                        } else if (!StudentCourses.contains(DeleteAnswer)) {
                                                            System.out.println("You do not have this course in your List !!");
                                                        }
                                                        System.out.println("Your Courses are : " + StudentCourses);
                                                    }
                                                    else if (NewAnswer.equals("3") || NewAnswer.equals("Show my courses")) {
                                                        System.out.println(FullNameInput + " this is your course : " + StudentCourses + " . The total number of courses : " + StudentSumNumberOfCourse);
                                                    } else if (NewAnswer.equals("4") || NewAnswer.equals("Back to Main Menu")) {
                                                        ok = true;
                                                        yes = false;
                                                    }
                                                } while (yes);
                                                ok = true;


                                            } else if (NextAnswer.equals("Show my courses") || NextAnswer.equals("4")) {
                                                System.out.println(FullNameInput + " this is your course : " + StudentCourses + " . The total number of courses : " + StudentSumNumberOfCourse);
                                            }
                                            else if (NextAnswer.equals("Back to choose role")) {
                                                System.out.println("You will go Back to Choose Role !!");
                                                Akbar = true;
                                                ok = false;
                                                newYes=true;
                                                break;

                                            }
                                            else {
                                                System.out.println("The answer is not true . Please Try Again !!");
                                            }
                                        } while (ok);
                                    }
                                } else {
                                    System.out.println("Your Full name is not correct .Please Try Again !!");
                                    ok = true;
                                    newYes = true;
                                }
                            } else {
                                System.out.println("Your StudentID is not correct . Please Try Again !!");
                                ok = true;
                                newYes = true;
                            }
                        }

                    } catch (InputMismatchException e) {
                        System.err.println("Exception : " + e);
                        sc.nextLine();
                        System.out.println("Please try again. Your input is not valid!");
                    }
                }
                while (ok);
            } while (newYes);
        }while (Akbar);

    }
}

import Course.Computer_Engineering;
import Course.Electrical_Engineering;
import Course.Mechanical_Engineering;

import java.util.*;

public class Manager {
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
        boolean newYes = true;
        boolean Akbar = true;
        Scanner sc = new Scanner(System.in);
        Random Question = new Random();
        boolean newOk = true;
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

                                do {
                                    System.out.println("             Main Menu              ");
                                    System.out.println("1 : Add new Course for department");
                                    System.out.println("2 : Increasing the capacity of courses");
                                    System.out.println("3 : Add or Delete Student from Course : ");
                                    System.out.println("4 : Shows Department Courses");
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
                                            System.out.println("New Course make successfully !! ");
                                        } else if (NewChooseDepartment.equals("Computer Engineering") || NewChooseDepartment.equals("2")) {
                                            System.out.println("Please enter name of the course :");
                                            String CourseName = sc.next();
                                            System.out.println("Please enter name of the Professor: ");
                                            String ProfName = sc.next();
                                            System.out.println("Please enter code of course :");
                                            int CourseCode = sc.nextInt();
                                            System.out.println("Please enter Capacity : ");
                                            int Capacity = sc.nextInt();
                                            System.out.println("Please enter number of course : ");
                                            int CourseNumber = sc.nextInt();
                                            System.out.println("Please enter Class Start time : ");
                                            double StartTime = sc.nextDouble();
                                            System.out.println("Please enter Class end time : ");
                                            double EndTime = sc.nextDouble();
                                            System.out.println("Please enter day of the Class : ");
                                            String ClassDay = sc.next();
                                            System.out.println("Please enter the time of exam : ");
                                            double ExamTime = sc.nextDouble();
                                            System.out.println("Please enter the day of exam : ");
                                            String ExamDay = sc.next();
                                            System.out.println("Please enter the Course Type : ");
                                            String CourseType = sc.next();
                                            Computer_Engineering AdminMakeCourse = new Computer_Engineering(CourseName, ProfName, CourseCode, Capacity, CourseNumber, StartTime, EndTime, ClassDay, ExamTime, ExamDay, CourseType);
                                            System.out.println("New Course make successfully !! ");

                                        } else if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                            System.out.println("Please enter name of the course :");
                                            String CourseName = sc.next();
                                            System.out.println("Please enter name of the Professor: ");
                                            String ProfName = sc.next();
                                            System.out.println("Please enter code of course :");
                                            int CourseCode = sc.nextInt();
                                            System.out.println("Please enter Capacity : ");
                                            int Capacity = sc.nextInt();
                                            System.out.println("Please enter number of course : ");
                                            int CourseNumber = sc.nextInt();
                                            System.out.println("Please enter Class Start time : ");
                                            double StartTime = sc.nextDouble();
                                            System.out.println("Please enter Class end time : ");
                                            double EndTime = sc.nextDouble();
                                            System.out.println("Please enter day of the Class : ");
                                            String ClassDay = sc.next();
                                            System.out.println("Please enter the time of exam : ");
                                            double ExamTime = sc.nextDouble();
                                            System.out.println("Please enter the day of exam : ");
                                            String ExamDay = sc.next();
                                            System.out.println("Please enter the Course Type : ");
                                            String CourseType = sc.next();
                                            Electrical_Engineering AdminMakeCourse = new Electrical_Engineering(CourseName, ProfName, CourseCode, Capacity, CourseNumber, StartTime, EndTime, ClassDay, ExamTime, ExamDay, CourseType);
                                            System.out.println("New Course make successfully !! ");

                                        } else if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                            System.out.println("Please enter name of the course :");
                                            String CourseName = sc.next();
                                            System.out.println("Please enter name of the Professor: ");
                                            String ProfName = sc.next();
                                            System.out.println("Please enter code of course :");
                                            int CourseCode = sc.nextInt();
                                            System.out.println("Please enter Capacity : ");
                                            int Capacity = sc.nextInt();
                                            System.out.println("Please enter number of course : ");
                                            int CourseNumber = sc.nextInt();
                                            System.out.println("Please enter Class Start time : ");
                                            double StartTime = sc.nextDouble();
                                            System.out.println("Please enter Class end time : ");
                                            double EndTime = sc.nextDouble();
                                            System.out.println("Please enter day of the Class : ");
                                            String ClassDay = sc.next();
                                            System.out.println("Please enter the time of exam : ");
                                            double ExamTime = sc.nextDouble();
                                            System.out.println("Please enter the day of exam : ");
                                            String ExamDay = sc.next();
                                            System.out.println("Please enter the Course Type : ");
                                            String CourseType = sc.next();
                                            Mechanical_Engineering AdminMakeCourse = new Mechanical_Engineering(CourseName, ProfName, CourseCode, Capacity, CourseNumber, StartTime, EndTime, ClassDay, ExamTime, ExamDay, CourseType);
                                            System.out.println("New Course make successfully !! ");

                                        } else {
                                            System.out.println("Your input is not valid.Please try again !! ");
                                            newOk = true;
                                        }
                                    } else if (NextAnswer.equals("Increasing the capacity of courses") || NextAnswer.equals("2")) {
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
                                                Mathematics_Department.IncreaseCalculus2();
//                                            System.out.println("");
//                                            Mathematics_Department.IncreaseCapacityCalculus2();
//                                            Mathematics_Department.ShowMCourse();
//                                            CapacityCalculus2.add(0,240);

                                            } else if (ChooseCourse.equals("BasicsOfMathematics") || ChooseCourse.equals(Mathematics_Department.CourseCodeBasicsOfMathematics())) {
//                                            System.out.println("How much ?");
//                                            int a = sc.nextInt();
//                                            Mathematics_Department.IncreaseCapacityBasicsOfMathematics(a);
//                                            Mathematics_Department.ShowMCourse();
                                                Mathematics_Department.IncreaseBasicsOfMathematics();

                                            } else if (ChooseCourse.equals("Differential_Equations") || ChooseCourse.equals(Mathematics_Department.CpurseCodeDifferential_Equations())) {
                                                Mathematics_Department.IncreaseDifferential_Equations();


                                            }
                                        } else if (NewChooseDepartment.equals("Computer Engineering") || NewChooseDepartment.equals("2")) {
                                            Computer_Engineering.ShowCECourse();
                                            System.out.println("Choose Course : ");
                                            sc.nextLine();
                                            String ChooseCourse = sc.nextLine();
                                            if (ChooseCourse.equals("Advance_Programming") || ChooseCourse.equals("40244")) {
                                                Computer_Engineering.IncreaseAdvance_Programming();
                                            } else if (ChooseCourse.equals("LogicCircuits") || ChooseCourse.equals("40212")) {
                                                Computer_Engineering.IncreaseLogic_Circuits();
                                            } else if (ChooseCourse.equals("DiscreteStructures") || ChooseCourse.equals("40115")) {
                                                Computer_Engineering.IncreaseDiscrete_Structures();
                                            }


                                        } else if (NewChooseDepartment.equals("Electrical Engineering") || NewChooseDepartment.equals("3")) {
                                            Electrical_Engineering.ShowEECourse();
                                            System.out.println("Choose Course : ");
                                            sc.nextLine();
                                            String ChooseCourse = sc.nextLine();
                                            if (ChooseCourse.equals("Electromagnetism") || ChooseCourse.equals("25733")) {
                                                Electrical_Engineering.IncreaseElectromagnetism();

                                            } else if (ChooseCourse.equals("Electronics2") || ChooseCourse.equals("25032")) {
                                                Electrical_Engineering.IncreaseElectronics2();
                                            } else if (ChooseCourse.equals("BasicsOfElectricalEngineering2") || ChooseCourse.equals("25093")) {
                                                Electrical_Engineering.IncreaseBasicsOfElectricalEngineering2();
                                            }

                                        } else if (NewChooseDepartment.equals("Mechanical Engineering") || NewChooseDepartment.equals("4")) {
                                            Mechanical_Engineering.ShowMECourse();
                                            System.out.println("Choose Course : ");
                                            sc.nextLine();
                                            String ChooseCourse = sc.nextLine();
                                            if (ChooseCourse.equals("Thermodynamics2") || ChooseCourse.equals("28162")) {
                                                Mechanical_Engineering.IncreaseThermodynamics2();
                                            } else if (ChooseCourse.equals("Static") || ChooseCourse.equals("28261")) {
                                                Mechanical_Engineering.IncreaseStatic();
                                            } else if (ChooseCourse.equals("ResistanceOfMaterials2") || ChooseCourse.equals("28263")) {
                                                Mechanical_Engineering.IncreaseBasicsOfElectricalEngineering2();
                                            }

                                        }
                                    } else if (NextAnswer.equals("Add or Delete Student from Course") || NextAnswer.equals("3")) {
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
                                                                                ok = true;
                                                                                yes = false;
                                                                                goat = true;
                                                                                break;
                                                                            }

                                                                        }
                                                                    }
                                                                }
                                                            } else if (ChooseCourse.equals("Differential_Equations") || ChooseCourse.equals("22034")) {
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
                                                                                System.out.println("Differential Equations added to your courses successfully !!");
                                                                                ok = true;
                                                                                yes = false;
                                                                                zebra = false;
                                                                                break;
                                                                            }

                                                                        }
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("Your input is not valid !!");
                                                                Hey = true;

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

                                                            } else {

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
                                                                                System.out.println("Basics of electrical engineering 2 added to your courses successfully !!");
                                                                                ok = true;
                                                                                yes = false;
                                                                                monkey = false;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                            } else {
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
                                                            } else {
                                                                System.out.println("Your input is not valid!!");
                                                                Hey = true;

                                                            }
                                                        } while (Hey);

                                                    }
                                                } else {
                                                    System.out.println("We do not have this student in our system. Please try Again!!");
                                                    Addy = true;


                                                }


                                            } while (Addy);
                                        } else if (ToDO.equals("Delete Student") || ToDO.equals("2")) {
                                            boolean Addy = true;
                                            System.out.println("Please enter student's StudentId : ");
                                            String StudentIDEnter = sc.next();
                                            if (StudentIDEnter.equals("402170092")) {
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
                                                    }
                                                    if (DeleteAnswer.equals("BasicsOfMathematics")) {
                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                                        Mathematics_Department.DeleteBasicsOfMathematicsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                                    }
                                                    if (DeleteAnswer.equals("DifferentialEquations")) {
                                                        StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseDifferential_Equations();
                                                        Mathematics_Department.DeleteDifferential_EquationsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                                        CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                                        CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                                        CourseExamDayArray.remove(Mathematics_Department.CourseExamDayDifferential_Equations());
                                                    }
                                                    if (DeleteAnswer.equals("AdvanceProgramming")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseAdvance_Programming();
                                                        Computer_Engineering.DeleteAdvance_ProgrammingIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayAdvance_Programming());
                                                    }
                                                    if (DeleteAnswer.equals("LogicCircuits")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseLogic_Circuits();
                                                        Computer_Engineering.DeleteLogic_CircuitsIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayLogic_Circuits());
                                                    }
                                                    if (DeleteAnswer.equals("DiscreteStructures")) {
                                                        StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                                        Computer_Engineering.DeleteDiscrete_StructuresIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                                        CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                                        CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                                        CourseExamDayArray.remove(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                                    }
                                                    if (DeleteAnswer.equals("Electromagnetism")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectromagnetism();
                                                        Electrical_Engineering.DeleteElectromagnetismIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectromagnetism());
                                                    }
                                                    if (DeleteAnswer.equals("Electronics2")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectronics2();
                                                        Electrical_Engineering.DeleteElectronics2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectronics2());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectronics2());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectronics2());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectronics2());
                                                    }
                                                    if (DeleteAnswer.equals("BasicsOfElectricalEngineering2")) {
                                                        StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                                        Electrical_Engineering.DeleteBasicsOfElectricalEngineering2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                                        CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                                        CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                                        CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                                    }
                                                    if (DeleteAnswer.equals("Static")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseStatic();
                                                        Mechanical_Engineering.DeleteThermodynamics2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeStatic());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeStatic());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeStatic());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayStatic());
                                                    }
                                                    if (DeleteAnswer.equals("Thermodynamics2")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                                        Mechanical_Engineering.DeleteStaticIncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                                    }
                                                    if (DeleteAnswer.equals("ResistanceOfMaterials2")) {
                                                        StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                                        Mechanical_Engineering.DeleteResistanceOfMaterials2IncreaseCapacity();
                                                        CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                                        CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                                        CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                                        CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                                    }
                                                    System.out.println("Delete course from your list successfully !!");
                                                } else if (!StudentCourses.contains(DeleteAnswer)) {
                                                    System.out.println("You do not have this course in your List !!");
                                                }
                                                System.out.println("Your Courses are : " + StudentCourses);


                                            } else {
                                                System.out.println("We do not have this student in our system. Please try Again!!");
                                                Addy = true;


                                            }
                                        }

                                    } else if (NextAnswer.equals("Shows Department Courses") || NextAnswer.equals("4")) {
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
                        }
                    } else if (NewAdminUsername.equals("Back")) {
                        newYes = true;
                        break;
                    } else {
                        System.out.println("Your Username is not valid . Please try again !!");
                        newOk = true;
                    }

                } catch (InputMismatchException e) {
                    System.err.println("Exception : " + e);
                    sc.nextLine();
                    System.out.println("Please try again. Your input is not valid!");
                }

            } while (newOk);

        } else if (role.equals("Student") || role.equals("2")) {
            String StudentId = "402170092";
            String FullName = "SamanBadiee";
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
                                                        ok = true;
                                                        yes = false;
                                                        donkey = false;
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
                                }
                                if (NewChooseDepartment.equals("Finish") || NextAnswer.equals("Finish")) {
                                    System.out.println("Your Courses are : " + StudentCourses + " . The total number of selected courses : " + StudentSumNumberOfCourse);



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
                                }
                                if (DeleteAnswer.equals("BasicsOfMathematics")) {
                                    StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseBasicsOfMathematics();
                                    Mathematics_Department.DeleteBasicsOfMathematicsIncreaseCapacity();
                                    CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeBasicsOfMathematics());
                                    CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeBasicsOfMathematics());
                                    CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeBasicsOfMathematics());
                                    CourseExamDayArray.remove(Mathematics_Department.CourseExamDayBasicsOfMathematics());
                                }
                                if (DeleteAnswer.equals("DifferentialEquations")) {
                                    StudentSumNumberOfCourse -= Mathematics_Department.NumberOfCourseDifferential_Equations();
                                    Mathematics_Department.DeleteDifferential_EquationsIncreaseCapacity();
                                    CourseStarTimeArray.remove(Mathematics_Department.CourseStartTimeDifferential_Equations());
                                    CourseEndTimeArray.remove(Mathematics_Department.CourseEndTimeDifferential_Equations());
                                    CourseExamTimeArray.remove(Mathematics_Department.CourseExamTimeDifferential_Equations());
                                    CourseExamDayArray.remove(Mathematics_Department.CourseExamDayDifferential_Equations());
                                }
                                if (DeleteAnswer.equals("AdvanceProgramming")) {
                                    StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseAdvance_Programming();
                                    Computer_Engineering.DeleteAdvance_ProgrammingIncreaseCapacity();
                                    CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeAdvance_Programming());
                                    CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeAdvance_Programming());
                                    CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeAdvance_Programming());
                                    CourseExamDayArray.remove(Computer_Engineering.CourseExamDayAdvance_Programming());
                                }
                                if (DeleteAnswer.equals("LogicCircuits")) {
                                    StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseLogic_Circuits();
                                    Computer_Engineering.DeleteLogic_CircuitsIncreaseCapacity();
                                    CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeLogic_Circuits());
                                    CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeLogic_Circuits());
                                    CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeLogic_Circuits());
                                    CourseExamDayArray.remove(Computer_Engineering.CourseExamDayLogic_Circuits());
                                }
                                if (DeleteAnswer.equals("DiscreteStructures")) {
                                    StudentSumNumberOfCourse -= Computer_Engineering.NumberOfCourseDiscrete_Structures();
                                    Computer_Engineering.DeleteDiscrete_StructuresIncreaseCapacity();
                                    CourseStarTimeArray.remove(Computer_Engineering.CourseStartTimeDiscrete_Structures());
                                    CourseEndTimeArray.remove(Computer_Engineering.CourseEndTimeDiscrete_Structures());
                                    CourseExamTimeArray.remove(Computer_Engineering.CourseExamTimeDiscrete_Structures());
                                    CourseExamDayArray.remove(Computer_Engineering.CourseExamDayDiscrete_Structures());
                                }
                                if (DeleteAnswer.equals("Electromagnetism")) {
                                    StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectromagnetism();
                                    Electrical_Engineering.DeleteElectromagnetismIncreaseCapacity();
                                    CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectromagnetism());
                                    CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectromagnetism());
                                    CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectromagnetism());
                                    CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectromagnetism());
                                }
                                if (DeleteAnswer.equals("Electronics2")) {
                                    StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseElectronics2();
                                    Electrical_Engineering.DeleteElectronics2IncreaseCapacity();
                                    CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeElectronics2());
                                    CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeElectronics2());
                                    CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeElectronics2());
                                    CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayElectronics2());
                                }
                                if (DeleteAnswer.equals("BasicsOfElectricalEngineering2")) {
                                    StudentSumNumberOfCourse -= Electrical_Engineering.NumberOfCourseBasicsOfElectricalEngineering2();
                                    Electrical_Engineering.DeleteBasicsOfElectricalEngineering2IncreaseCapacity();
                                    CourseStarTimeArray.remove(Electrical_Engineering.CourseStartTimeBasicsOfElectricalEngineering2());
                                    CourseEndTimeArray.remove(Electrical_Engineering.CourseEndTimeBasicsOfElectricalEngineering2());
                                    CourseExamTimeArray.remove(Electrical_Engineering.CourseExamTimeBasicsOfElectricalEngineering2());
                                    CourseExamDayArray.remove(Electrical_Engineering.CourseExamDayBasicsOfElectricalEngineering2());
                                }
                                if (DeleteAnswer.equals("Static")) {
                                    StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseStatic();
                                    Mechanical_Engineering.DeleteThermodynamics2IncreaseCapacity();
                                    CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeStatic());
                                    CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeStatic());
                                    CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeStatic());
                                    CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayStatic());
                                }
                                if (DeleteAnswer.equals("Thermodynamics2")) {
                                    StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseThermodynamics2();
                                    Mechanical_Engineering.DeleteStaticIncreaseCapacity();
                                    CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeThermodynamics2());
                                    CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeThermodynamics2());
                                    CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeThermodynamics2());
                                    CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayThermodynamics2());
                                }
                                if (DeleteAnswer.equals("ResistanceOfMaterials2")) {
                                    StudentSumNumberOfCourse -= Mechanical_Engineering.NumberOfCourseResistanceOfMaterials2();
                                    Mechanical_Engineering.DeleteResistanceOfMaterials2IncreaseCapacity();
                                    CourseStarTimeArray.remove(Mechanical_Engineering.CourseStartTimeResistanceOfMaterials2());
                                    CourseEndTimeArray.remove(Mechanical_Engineering.CourseEndTimeResistanceOfMaterials2());
                                    CourseExamTimeArray.remove(Mechanical_Engineering.CourseExamTimeResistanceOfMaterials2());
                                    CourseExamDayArray.remove(Mechanical_Engineering.CourseExamDayResistanceOfMaterials2());
                                }
                                System.out.println("Delete course from your list successfully !!");
                            } else if (!StudentCourses.contains(DeleteAnswer)) {
                                System.out.println("You do not have this course in your List !!");
                            }
                            System.out.println("Your Courses are : " + StudentCourses);


                        }
                    }
                }
            }}}}
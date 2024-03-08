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
                        }

                                }
                            }
                        }

                    }
                }
            }

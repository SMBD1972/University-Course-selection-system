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
    }
}
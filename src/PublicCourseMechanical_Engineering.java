public class PublicCourseMechanical_Engineering extends Mechanical_Engineering{
    public PublicCourseMechanical_Engineering(String CourseName, String ProfName, String CourseCode, int Capacity, int numberOfCourse, double ClassSatrtTime, double ClassEndTime, String ClassDay, double ExamTime, String ExamDay, String TypeOfCourse) {
        super(CourseName, ProfName, CourseCode, Capacity, numberOfCourse, ClassSatrtTime, ClassEndTime, ClassDay, ExamTime, ExamDay);
        TypeOfCourse="Public Course";
    }

}

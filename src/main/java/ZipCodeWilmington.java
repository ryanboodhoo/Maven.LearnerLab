import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students;
    private final Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public Students getStudents() {
        return students;
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfhours) {
        //host lecture
        // of person list in students filed
        //To array method in students
        teacher.lecture(students.studentsArray, numberOfhours);
    }

    public void hostLecture(long id, double numberOfHours){
        for (Instructor a : instructors.instructorsArray){
            if (a.getId() == id){
                a.lecture(students.studentsArray, numberOfHours);
            }
        }
    }

    public Map<Double, Student> getStudyMap() {
        //Create a map of student and Double
        // add study time to each student
        Map<Double, Student> StudyMap = new HashMap<>();
        for (Student students1 : getStudents()) {
            StudyMap.put(students1.getTotalStudyTime(), students1);
        }

        return StudyMap;
    }


}
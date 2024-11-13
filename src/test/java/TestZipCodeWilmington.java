import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestZipCodeWilmington {

    @Test
    void testHostLecturewithTeacher() {
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor instructor = cohort.getInstructors().instructorsArray[0];

        cohort.hostLecture(instructor, 60);

        for (Student x : cohort.getStudents().studentsArray){
            assertTrue(x.getTotalStudyTime() == 20);

        }
    }

    @Test
    void testHostLectureWithID(){
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();

        Instructor instructor = cohort.getInstructors().instructorsArray[0];


        cohort.hostLecture(instructor.getId(), 81);




        for (Student x : cohort.getStudents().studentsArray){

            assertTrue( x.getTotalStudyTime() == 27.0);



        }
    }


}
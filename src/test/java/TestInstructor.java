import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructor {
    @Test
    public void InstructorInstanceofTeacher() {

        Instructor instructor = new Instructor(701L, "Gabe");

        boolean actual = instructor instanceof Teacher;

        Assertions.assertTrue(actual);
    }

    @Test
    public void InstructorInstanceofPerson() {

        Instructor instructor = new Instructor(701L, "Gabe");

        boolean actual = instructor instanceof Person;

        Assertions.assertTrue(actual);


    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(44L, "Gabe");
        Student student = new Student(89L, "Dayson");
        double expected = 18.0;
        instructor.teach(student, 18.0);

        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(593L, "Gabe");
        Student student = new Student(59L, "Dayson");
        Student student2 = new Student(69L, "Jack");


        Student[] students = {student, student2};
        instructor.lecture(students, 12);
        Double expected = 6.0;
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }
}
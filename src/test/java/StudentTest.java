import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    private Student studentSingleton;

    @Test
    void testImplementation(){

        Student student = new Student("Bob");

        Assertions.assertEquals(true, student instanceof Learner);
    }



    @Test
    void testInheritance () {
        Student student = new Student("Bob");

        Assertions.assertEquals(true, student instanceof Person);

    }

    @Test
    void learn () {
        Student student = new Student("Bob");

        student.learn(8);

        student.learn(8);

        Assertions.assertEquals(16, student.getTotalStudyTime());



    }
}


import java.text.Format;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super( name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner i: learners){
            i.learn(numberOfHours);
        }
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        System.out.println(numberOfHoursPerLearner);
    }



}

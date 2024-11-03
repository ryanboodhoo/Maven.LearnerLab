import java.util.function.Consumer;

public  class Student extends Person implements Learner{

        private double totalStudyTime;

        public Student(String name) {
                super( name);
        }


        @Override
        public void learn(double numberOfHours) {
                totalStudyTime += numberOfHours;
        }

        @Override
        public double getTotalStudyTime() {
                return totalStudyTime;
        }

        public void setTotalStudyTime(double totalStudyTime) {
                this.totalStudyTime = totalStudyTime;
        }
}

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    public final Instructor[] instructorsArray;

    private Instructors(){

        Instructor [] a = new Instructor[]{new Instructor(70L, "Gabe"), (new Instructor(66L, "Dayson")) };
        this.instructorsArray = a;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
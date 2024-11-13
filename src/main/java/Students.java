public final class Students extends People<Student>{



    private static final Students INSTANCE = new Students();

    public final Student[] studentsArray;


    private Students(){
        Student student = new Student(6065L, "Donut");
        Student student1 = new Student(6954L, "Ryan");
        Student student2 = new Student(6090L, "Dani");

        //INSTANCE.setStudents(studentsArray);
        this.studentsArray = new Student[]{student1, student2, student};



    }

    public static Students getInstance(){
        return INSTANCE;
    }




}
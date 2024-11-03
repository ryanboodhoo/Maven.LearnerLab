public final class Students extends People {

    private static final Students INSTANCE = new Students();


    private Students(){
        getPersonList().add(new Student("Bob"));
        getPersonList().add(new Student("Bob"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}

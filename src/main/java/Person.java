public class Person {
    private final long id;
    private String name;
    private static int counter = 0;


    public Person( String name) {
        this.id = counter++;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

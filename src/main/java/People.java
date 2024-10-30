import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class People implements Iterable<Person> {
    private List<Person> personList;

     public People() {
        this.personList = new ArrayList<>();
    }

     public void add(Person person) {
        personList.add(person);
    }

     public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

     public boolean contains(Person person) {
        return personList.contains(person);
    }

     public void remove(Person person) {
        personList.remove(person);
    }

     public void remove(long id) {
        personList.removeIf(person -> person.getId() == id);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Person> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Person> spliterator() {
        return Iterable.super.spliterator();
    }


















}

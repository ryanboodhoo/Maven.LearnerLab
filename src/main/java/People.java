import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class People implements Iterable<Person> {

    private final List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }


    public Person findById(int id) {
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

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}

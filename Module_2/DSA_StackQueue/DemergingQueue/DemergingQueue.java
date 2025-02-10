import java.util.*;

public class DemergingQueue implements IDemergingQueue {
    private final Queue<Person> girl;
    private final Queue<Person> boy;
    private final Stack<Person> staffList;

    public DemergingQueue() {
        girl = new LinkedList<>();
        boy = new LinkedList<>();
        staffList = new Stack<>();
    }

    @Override
    public void classifyGender(Person person) {
        if (person.getGender().toLowerCase().contains("female")) {
            girl.add(person);
        } else if (person.getGender().toLowerCase().contains("male")) {
            boy.add(person);
        }
    }

    @Override
    public void sortByBirthdate() {
        List<Person> allPeople = new ArrayList<>();

        while (!boy.isEmpty()) {
            allPeople.add(boy.poll());
        }
        while (!girl.isEmpty()) {
            allPeople.add(girl.poll());
        }

        allPeople.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }
        });

        for (Person person : allPeople) {
            if (person.getGender().toLowerCase().contains("female")) {
                girl.add(person);
            } else {
                boy.add(person);
            }
        }
    }

    @Override
    public void listByGender() {
        while (!boy.isEmpty()) {
            staffList.push(boy.poll());
        }
        while (!girl.isEmpty()) {
            staffList.push(girl.poll());
        }
    }

    @Override
    public void displayStaffList() {
        while (!staffList.isEmpty()) {
            Person person = staffList.pop();
            System.out.println("Name: " + person.getName() + ", Gender: " + person.getGender() + ", Date of Birth: " + person.getDateOfBirth());
        }
    }
}

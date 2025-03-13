abstract class Person {
    protected String id;
    protected String name;
    protected String birthDate;
    protected String gender;
    protected String phoneNumber;

    public Person(String id, String name, String birthDate, String gender, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public abstract void displayInfo();
}

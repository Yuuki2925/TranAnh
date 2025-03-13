class Teacher extends Person {
    public Teacher(String id, String name, String birthDate, String gender, String phoneNumber) {
        super(id, name, birthDate, gender, phoneNumber);
    }

    @Override
    public void displayInfo() {
        System.out.printf("ID: %s | Name: %s | Birth: %s | Gender: %s | Phone: %s\n",
                id, name, birthDate, gender, phoneNumber);
    }
}

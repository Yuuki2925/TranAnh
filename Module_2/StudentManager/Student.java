class Student extends Person {
    private String classId;

    public Student(String id, String name, String birthDate, String gender, String phoneNumber, String classId) {
        super(id, name, birthDate, gender, phoneNumber);
        this.classId = classId;
    }

    @Override
    public void displayInfo() {
        System.out.printf("ID: %s | Name: %s | Birth: %s | Gender: %s | Phone: %s | Class ID: %s\n",
                id, name, birthDate, gender, phoneNumber, classId);
    }

    public String toCSV() {
        return String.join(",", id, name, birthDate, gender, phoneNumber, classId);
    }
}

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lớp: " + classes);
    }
}

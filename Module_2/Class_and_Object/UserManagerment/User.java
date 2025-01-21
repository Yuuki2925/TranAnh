public class User {
    int id;
    String name;
    String email;
    int age;

    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Age: " + age;
    }
}

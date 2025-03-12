public interface IStudentManager {
    void addStudent(Student student);
    void deleteStudent(String id);
    void searchStudent(String keyword);
    void editStudent(Student student);
    void showListStudent();
    void showListTeacher();
}

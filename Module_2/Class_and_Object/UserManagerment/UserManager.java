public class UserManager {
    User[] list;
    int limit;
    int count;

    // Constructor có tham số
    public UserManager(int limit) {
        this.limit = limit;
        this.list = new User[limit];
        this.count = 0;
    }

    // Thêm người dùng
    public void addUser(User u) {
        if (count < limit) {
            list[count] = u;
            count++;
            System.out.println("User added successfully!");
        } else {
            System.out.println("User limit reached!");
        }
    }

    // Hiển thị người dùng
    public void showListUser() {
        for (int i = 0; i < count; i++) {
            System.out.println(list[i].getInfo());
        }
    }

    // Chỉnh sửa người dùng
    public void editUser(int id, User newUser) {
        for (int i = 0; i < count; i++) {
            if (list[i].id == id) {
                list[i] = newUser;
                System.out.println("User edited successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }

    // Xóa người dùng
    public void removeUser(int id) {
        for (int i = 0; i < count; i++) {
            if (list[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[count - 1] = null;
                count--;
                System.out.println("User removed successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }
}

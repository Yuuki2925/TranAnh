import java.io.File;

public class FileHandler {
    public static void main(String[] args) {
        // Tạo đối tượng File với đường dẫn của tệp
        File myfile = new File("./FileTest.txt");

        // Kiểm tra xem tệp có tồn tại không
        System.out.println("Does it exist: " + myfile.exists());

        // In ra dung lượng của tệp (tính bằng bytes)
        System.out.println("The file has " + myfile.length() + " bytes");

        // Kiểm tra xem tệp có thể đọc được không
        System.out.println("Can it be read? " + myfile.canRead());

        // Kiểm tra xem tệp có thể ghi được không
        System.out.println("Can it be written? " + myfile.canWrite());

        // Kiểm tra xem đối tượng có phải là thư mục không
        System.out.println("Is it a directory? " + myfile.isDirectory());

        // Kiểm tra xem đối tượng có phải là tệp không
        System.out.println("Is it a file? " + myfile.isFile());

        // Kiểm tra xem đường dẫn của tệp có phải là đường dẫn tuyệt đối không
        System.out.println("Is it absolute? " + myfile.isAbsolute());

        // Kiểm tra xem tệp có phải là tệp ẩn không
        System.out.println("Is it hidden? " + myfile.isHidden());

        // In ra đường dẫn tuyệt đối của tệp
        System.out.println("Absolute path is " + myfile.getAbsolutePath());

        // In ra thời gian sửa đổi cuối cùng của tệp
        System.out.println("Last modified on " + myfile.lastModified() + "ms");
    }
}

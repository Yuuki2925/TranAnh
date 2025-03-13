import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Nhập phần tử: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử " + i + ":");
            arr[i] = sc.nextInt();
        }

        int minArr = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(minArr > arr[i]){
                minArr = arr[i];
                index = i;
            }
        }

        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minArr);
        System.out.println("Vị trí phần tử nhỏ nhất là: " + index);
    }
}

import java.util.Scanner;

public class DisplayPrimesOnly {
    public static void main(String[] args) {
        int cnt = 0;
        int num = 2;

        while (cnt < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                cnt++;
            }

            num++;
        }
    }
}

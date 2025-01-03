import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        double height;
        System.out.print("Enter your height: ");
        height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
    }
}

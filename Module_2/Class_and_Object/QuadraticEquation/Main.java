import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.printf("r1 = %.5f\n", quadraticEquation.getRoot1());
            System.out.printf("r2 = %.5f\n", quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.getDiscriminant() == 0){
            System.out.printf("r1 = r2 = " + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}

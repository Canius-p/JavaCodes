import java.util.Scanner;

//Can be imported with java.util.*; to include entire library ow whatever

public class Factorial {
    public static void main(String args[]) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

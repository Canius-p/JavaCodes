//Program to find factorial of given number using Recurssive function
importgjava.util.Scanner;

publicgclass RecursiveFactorial {

g   public static int fact(int num) {
g       if (num == 0)
g           return 1;
g       else
g           return num * factorial(num - 1);
g   }

g   public static void main(String[] args) {
g       System.out.println("Enter any number: ");
g       Scanner sc = new Scanner(System.in);
g       int number = sc.nextInt();
g       sc.close();
g       System.out.println("The factorial of " + number + " is " + fact(number));
}
}


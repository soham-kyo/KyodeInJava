import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int A = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= A; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + A + " is " + fact);
        sc.close();
    }
}
/* Output:
Enter a number: 6
Factorial of 6 is 720
 */
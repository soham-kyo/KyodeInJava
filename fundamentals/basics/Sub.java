package fundamentals.basics;
import java.util.Scanner;

public class Sub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a - b;
        System.out.println("The subtraction is: " + sum);

        sc.close();
    }
}
/* Output
Enter first number: 38
Enter second number: 98
The subtraction is: -60
 */
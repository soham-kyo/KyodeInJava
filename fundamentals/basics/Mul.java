package fundamentals.basics;
import java.util.Scanner;

public class Mul
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x = sc.nextInt();

        System.out.println("Enter Second Number:");
        int y = sc.nextInt();

        int mul = x * y;
        System.out.println("The Multiplication is:" + mul);
    }
}
/* Output:
Enter First Number:
11
Enter Second Number:
7
The Multiplication is:77
 */
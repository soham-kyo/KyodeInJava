package fundamentals.basics;

import java.util.Scanner;

public class Smallest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number:");
        int A = sc.nextInt();

        System.out.println("Second Number:");
        int B = sc.nextInt();

        if (A > B)
        {
            System.out.println( B + " is Smaller");
        } else if (B > A)
        {
            System.out.println( A + " is Smaller");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
/* Output:
First Number:
1
Second Number:
6
1 is Smaller
 */
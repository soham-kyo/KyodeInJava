package fundamentals.basics;

import java.util.Scanner;

public class Largest
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
            System.out.println( A + " is larger");
        } else if (B > A)
        {
            System.out.println( B + " is larger");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}
/*Output:
First Number:
89
Second Number:
98
98 is larger
 */

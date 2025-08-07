package fundamentals.basics;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int S = sc.nextInt();
        int sum = 0;

        while (S != 0)
        {
            sum += S % 10;
            S /= 10;
        }
        System.out.println("Sum of digits are: " + sum);
        sc.close();
    }
}
/* Output:
Enter a number:
6777
Sum of digits are: 27
 */
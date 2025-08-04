package fundamentals.basics;

import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int A = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(A + " x " + i + " = " + (A * i));
        }
        sc.close();
    }
}
/* Output:
Enter a number:
20
20 x 1 = 20
20 x 2 = 40
20 x 3 = 60
20 x 4 = 80
20 x 5 = 100
20 x 6 = 120
20 x 7 = 140
20 x 8 = 160
20 x 9 = 180
20 x 10 = 200
 */
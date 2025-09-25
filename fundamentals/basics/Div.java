package fundamentals.basics;

import java.util.Scanner;

public class Div
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int A = sc.nextInt();
        System.out.println("Enter Second Number:");
        int B = sc.nextInt();
        int Div = A / B;
        System.out.println("The Division is:" + Div);
    }
}
/* Output:
Enter First Number:
20
Enter Second Number:
10
The Division is:2
 */
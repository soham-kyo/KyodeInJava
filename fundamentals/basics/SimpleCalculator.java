package fundamentals.basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3: System.out.println("Result = " + (a * b));
            break;
            case 4:
                System.out.println("Result = " + (a / b));
            break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
/* Output:
Enter first number: 11
Enter second number: 2
1. Addition
2. Subtraction
3. Multiplication
4. Division
Choose option: 3
Result = 22
 */
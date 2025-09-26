package fundamentals.basics;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " 🙋🏻 ");
        sc.close();
    }
}
/* Output:
Enter your name: Soham Patil
Hello Soham Patil 🙋🏻
 */
package fundamentals.basics;

public class OddEven
{
    public static void main(String[] args)
    {
        int N = 98;
        System.out.println("Number:" + N);
        if(N % 2 == 0)
        {
            System.out.println(N + " is Even.");
        }
        else
        {
            System.out.println(N + " is Odd.");
        }
    }
}

/* Output:
Number:98
98 is Even.
 */
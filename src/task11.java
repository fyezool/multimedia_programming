import java.util.*;
public class task11
{
    public static boolean isPrime(int p) //returns true if p is a prime number
    {
        if (p <= 1)// 0, 1, and all negatives are not prime
            return false;
        else if (p == 2)// if p is 2; return true (exit) because 2 is prime
            return true;
        else if (p % 2 == 0)// if p is even and not 2 , return false (exit);
            return false;
        // so p is odd; check for odd divisors
        // if a divisor is found, return false and exit
        for (int i = 3; i < p; i += 2) // i = 3,5,7,9
            if (p % i == 0)// if p % i == 0 then i divides p so p is not prime
                return false;// if the method reaches this point, p is prime,
        return true;
    }
        public static void main (String[]args)
        {
            int number;
            Scanner input;
            input = new Scanner(System.in);
        System.out.print("What number would you like to test? ");
        number = input.nextInt();
        if (isPrime(number))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not prime");
    }
}
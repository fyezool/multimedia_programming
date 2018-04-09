import java.util.*;
public class task6
{
    public static void main (String[] args)
    {
        Scanner input =new Scanner(System.in);
        final int MAX_DIGITS = 16;// maximum number of digits for a credit card
        long number;// credit card number
        long sum = 0;// the final value of sum must end in zero
        long digit;
        System.out.print("Enter Credit Card Number:" );
        number = input.nextLong();
        for (int i = 1; i <= MAX_DIGITS; i++) // for each digit, i counts digits
        {
            digit = number % 10;// extract the rightmost digit
            if (i % 2 == 0)//double every other digit
            {
                digit = digit*2;
                if (digit > 9)// subtract 9 if the product is larger than 9
                    digit -= 9;
            }
            sum += digit;// add the digit to the running sum
            number =number/10; // remove the rightmost digit
        }
        if (sum % 10 != 0)// check the rightmost digit of sum
            System.out.println("Invalid number");
        else
            System.out.println("Credit card number passes test");
    }
}
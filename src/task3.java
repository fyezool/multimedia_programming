import java.util.*;
public class task3
{
    // adds an arbitrarily long list of integers
    // -999 signals the end of data
        public static void main (String[] args)
        {
                Scanner input =new Scanner(System.in);
                final int FLAG = -999;// signals the end of data
                int sum = 0;// Running sum
                int number;// holds the next integer to be added
                System.out.println("Enter the numbers. End with "+FLAG);number = input.nextInt();
                while (number != FLAG) // FLAG signals the end of data
                {
                        sum += number;// add the current integer to sum
                        number = input.nextInt(); // read the next integer
                }
        System.out.println("Sum: "+ sum);
        }
}
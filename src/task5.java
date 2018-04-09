import java.util.*;
public class task5
{
    public static void main (String[] args)
    {
        Scanner input =new Scanner(System.in);
        int sum = 0;// Cumulative sum
        int size;// Number of integers to add
        int number;// holds the next integer to beadded
        System.out.print("How many numbers to add? ");
        size = input.nextInt();
        System.out.println("Enter the "+size+" numbers");
        for (int count = 1; count <= size; count++)
        {
            number = input.nextInt(); // read the next integer
            sum += number; // add number to sum
        }
        System.out.println("Sum: "+ sum);
    }
}
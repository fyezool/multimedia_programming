import java.util.*;
public class task2
{

// adds an arbitrarily long list of integers
// the user first supplies the size of the list

public static void main (String[] args)

        {
        Scanner input =new Scanner(System.in);
        int sum = 0;// Running sum
        int count = 0;//Keeps track of the number of integers
        int size ;// Size of the list
        System.out.print("How many numbers would you like to add? ");
        size = input.nextInt();
        System.out.println("Enter the "+size+" numbers");
             while (count < size) // while number of data < size repeat:
        {
            sum = sum + input.nextInt(); // read next integer, add to sum
            count++;// keep track of the number of data, so far
        }
            System.out.println("Sum: "+ sum);
        }
}
import java.util.*;
public class task4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;// the number of integers in the sumSolution
        do// repeat until size is positive
        {
            System.out.print("How many numbers would you like to add? ");
            size = input.nextInt();
        }
            while (size <= 0);
            System.out.println("Enter the " + size + " numbers");
            int sum = 0;// the running sum
            int count = 0;// keeps track of the number of data
            while (count < size)
            {
                sum = sum + input.nextInt();// read the next integer, add to sum
                count++;// increment counter
            }
        System.out.println("Sum: " + sum);
    }
}
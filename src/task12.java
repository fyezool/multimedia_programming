import java.util.*;
public class task12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] list;// declare list an array variable
        list = new int[10]; //instantiate or create an array named list
        System.out.print("Enter 10 integers: ");// read values into list[0], list[1],..,list[9]
        for (int i= 0; i < 10; i++)
            list[i] = input.nextInt();
        System.out.print("List in reverse : ");//print values stored in list[9], list[8], ... , list[0]
        for (int i= 9; i >= 0; i--)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
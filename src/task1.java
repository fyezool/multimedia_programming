import java.util.Scanner;
public class task1
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        while(count < 5)
        {
            Scanner input = new Scanner(System.in);
            sum = sum + input.nextInt();
            count++;
        }
        System.out.println("Sum is" + sum);
    }
}

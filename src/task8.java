import java.util.*;
public class task8
{
    public static void main(String [] args)
    {
        int die1,die2;
        int sum, seven = 0;
        for (int i = 1; i <= 100; i++)
        {
            die1 = (int)(6*Math.random()+1) ; // random integer 1..6
            die2 = (int)(6*Math.random()+ 1);
            sum = die1 + die2;
            if (sum == 7)
                seven = seven + 1;
        }
        System.out.println("The number of sevens is " + seven);
    }
}
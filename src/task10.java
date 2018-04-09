import java.util.*;
public class task10
{
    public static void coinChanger (int amount)
    {
    // calculates the minimum number of half dollars, quarters, dimes,
    // nickels and pennies in amount
        int halfDollars, quarters, dimes, nickels, pennies;
        System.out.println();
        System.out.println(amount+" cents can be converted to:");
        halfDollars = amount/50;//determine number of half dollars
        amount = amount%50;// how much remains?
        quarters = amount/25;// determine number of quarters
        amount = amount%25;// how much remains?
        dimes = amount/10;// determine the number of dimes
        amount= amount%10;// how much remains?
        nickels = amount/5;// determine the number of nickels
        pennies = amount%5; //remainder is the number of pennies

        System.out.println("Half Dollars: "+ halfDollars);
        System.out.println("Quarters: "+ quarters);
        System.out.println("Dimes: "+ dimes);
        System.out.println("Nickels: "+ nickels);
        System.out.println("Pennies: "+ pennies);
        return; // return statement is optional here
    }
    public static void main(String[] args)
    {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Enter a value between 1 and 100: ");
        int money = input.nextInt();
        coinChanger(money);//call to method coinChanger
    }
}


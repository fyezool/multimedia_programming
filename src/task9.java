import java.util.*;
public class task9
{
    public static double caloriesBurned(double weight, double distance)
    {
        // returns the number of calories burned using the formula
        // calories = .653 × weight × distance
        double calories = .653 * weight * distance;
        return calories;
    }
            public static void main(String[] args)
            {
                Scanner input;
                double myWeight, myDistance, totalCalories;
                input = new Scanner(System.in);
                System.out.print("Enter weight in pounds: ");
                myWeight = input.nextDouble();
                System.out.print("Enter distance in miles: ");
                myDistance = input.nextDouble();
                totalCalories = caloriesBurned(myWeight, myDistance);
                System.out.println("Calories burned: "+ totalCalories);
            }
}
import java.util.*;
public class task7
{
    public static void main(String[] args)
    {
        Scanner input;
        double distanceToEyes; // measured from the ground
        double distanceToHorizon;
        int answer = 1;// used to repeat the calculation
        input = new Scanner(System.in);
        do
        {
            System.out.print("Distance from the ground to your eyes in feet: ");
            distanceToEyes =input.nextDouble();
            distanceToHorizon = 1.23 * Math.sqrt(distanceToEyes);
            System.out.println("The distance to the horizon is " + distanceToHorizon + " mi.");
            System.out.print("Again? 1 for YES; any other number to Exit: ");
            answer = input.nextInt();
        }while (answer == 1);
    }
}
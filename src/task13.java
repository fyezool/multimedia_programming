import java.util.*;
public class task13
{
    //read Data
    public static void readData(int[][] table, int numRows, int numCols)
    {
        // reads the data for a table row by row
        // the table has rows rows and cols columns

        System.out.println("Enter data, row by row: ");
        Scanner input = new Scanner(System.in);

        // read data , row by row
        for (int row = 0; row < numRows; row++)
            for (int col = 0; col < numCols; col++)
                table[row][col] = input.nextInt();
    }

    //Display
    public static void display(int table[][], int numRows, int numCols, int[] rowSums, int[] colSums)
    {
        // displays the contingency table
        // displays row and column totals and grand total
        System.out.println();
        System.out.println();
        System.out.println("Data including row and column totals: ");
        System.out.println();
        // print the table row by row
        // after printing a row, print the row total
        for (int row = 0; row < numRows; row++)
        // for each row
        {
            for (int col = 0; col < numCols; col++)// for each column
                System.out.print(" " + table[row][col] + "\t");
        }

        System.out.println();
        int grandTotal = 0;
        // calculate the grand total from the column sums
        // print the column sums then the grand total
        for (int col = 0; col < numCols; col++)
        // for each column
        {
            grandTotal += colSums[col]; //add column sum to grandTotal
            System.out.print(" " + colSums[col] + "\t");//print column sum
        }
        System.out.println("| " + grandTotal);
    }

    //GetTotal
    public static void getTotals(int[][] table, int numRows, int numCols, int[] rowSums, int[] colSums)
    {
        //calculates the row sums and column sums
        // get row sums
        for (int row = 0; row < numRows; row++)
        // for each row
            for (int col = 0; col < numCols; col++) // for each column
                rowSums[row] += table[row][col]; // add the table entry to
                                                // the row sum
                                                // get column sums
        for (int col = 0; col < numCols; col++)// for each column
            for (int row = 0; row < numRows; row++)// for each row
                colSums[col] += table[row][col]; // add the table entry to the column sum
    }

    //main function
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rows, cols;// dimensions of the table
        int[][] table;// contingency table
        int[] rowSums;// holds the row totals
        int colSums[];// holds the column totals
        System.out.print("Number of rows: ");
        rows =input.nextInt();
        System.out.print("Number of columns: ");
        cols=input.nextInt();
        table =new int[rows][cols];
        rowSums =new int[rows];
        colSums =new int[cols];
        readData(table, rows, cols);
        getTotals(table, rows, cols, rowSums, colSums); // calculate the sums
        display(table, rows, cols, rowSums, colSums);
    }
}
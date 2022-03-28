import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
    public static void main(String[] args) throws IOException {

        // 8.a Still needs to be done

        // 8.b
        File myFile = new File("Datafile_Lab8.txt"); //open file 

        // 8.c
        Scanner inputFile = new Scanner(myFile);

        // 8.d
        final int size = 7;
        double[] saleData = new double[size]; 
        System.out.print("\nReading the file...\n");
        for(int i = 0;i < 7;i++){saleData[i] = inputFile.nextDouble();} // reading first 7 doubles and writing to array 

        // 8.e
        inputFile.close();  

        // 8.f
        WeeklySaleData_Todd weeksSales = new WeeklySaleData_Todd(saleData); 

        // 8.g
        weeksSales.displaySaleData();
        System.out.printf("\nHighest weekly Sale: %.2f\nLowest weekly Sale: %.2f\nAverage weekly Sale: %.2f\nStandard Deviation of Weekly Sale: %.2f", 
            weeksSales.getHighestSale(), weeksSales.getLowestSale(), weeksSales.getAverageSale(), weeksSales.getStandardDeviation()); 
        System.out.println();

        // 8.h
        FileWriter fw = new FileWriter("Datafile_Lab8.txt", true); 
        PrintWriter appendFile = new PrintWriter(fw);

        // 8.i
        System.out.println("...Updating the file with the above info...");
        appendFile.printf("\nHighest weekly Sale: %.2f\nLowest weekly Sale: %.2f\nAverage weekly Sale: %.2f\nStandard Deviation of Weekly Sale: %.2f", 
            weeksSales.getHighestSale(), weeksSales.getLowestSale(), weeksSales.getAverageSale(), weeksSales.getStandardDeviation()); 

        // 8.j
        System.out.println("Closed the file.....");
        appendFile.close();

        // 8.k Needs to be done

    }
}

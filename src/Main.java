import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // declare variables
        double tempf;
        double tempc;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temp in Fahrenheit"); // Prompt the user for a temperature in Fahrenheit
        tempf = Double.parseDouble(input.next()); // Accept the input from the user
        tempc = (tempf -32) * 5.0/9.0; // Carry out the math operations to convert the temperature from Fahrenheit to Celsius.
        System.out.println("Temp in Celcius is: " + tempc); // Output the temperature in Celsius.

    }

}


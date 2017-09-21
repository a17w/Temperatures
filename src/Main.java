import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        // create object of Temp class
        Temp user = new Temp();

        // then call promptUserTemp method
        user.promptUserTemp();

        /*

        // declare variables
        double tempf;
        double tempc;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temp in Fahrenheit"); // Prompt the user for a temperature in Fahrenheit
        tempf = Double.parseDouble(input.next()); // Accept the input from the user
        tempc = (tempf -32) * 5.0/9.0; // Carry out the math operations to convert the temperature from Fahrenheit to Celsius.
        System.out.println("Temp in Celcius is: " + tempc); // Output the temperature in Celsius.

        */
    }

}


class Temp
{
    // declared variables inside the Temp class
    private double tempf;
    private double tempc;

    public void promptUserTemp()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temp in Fahrenheit: ");
        tempf = Double.parseDouble(input.next());
        tempc = (tempf -32) * 5.0/9.0;
        System.out.println("Temp in Celcius is: " + tempc);
    }


}


import java.util.Scanner;
//this line allows us to use the newly imported scanner for user input
public class Main {
    public static void main(String[] args)
    {


//this line is where we name our scanner

        String trash = "";
        //variable for error input
        int gas = 0;
        int mileage = 0;
        int price = 0;


        Scanner scan = new Scanner(System.in);


    System.out.println("How much fuel does your vehicle have currently?");

    if(scan.hasNextInt())
    {
        gas = scan.nextInt();
        scan.nextLine();
        //this line is to clear the buffer from the program
    }
    else
    {
        System.out.println("Incorrect Input, please use numbers. ERROR: ");
    }

    System.out.println("What is your vehicle's gas mileage?");
    if(scan.hasNextInt())
    {
        mileage = scan.nextInt();
        scan.nextLine();
    }
    else
    {
        System.out.println("Incorrect Input, please use numbers. ERROR: ");
    }

    System.out.println("What is the current price of gas?");
    if(scan.hasNextInt())
    {
        price = scan.nextInt();
        scan.nextLine();
    }
    else
    {
        System.out.println("Incorrect Input, please use numbers. ERROR: ");
    }

        int gasNeeded = (100 - (gas / mileage));
        int cost100 = gasNeeded * price;


        System.out.println("It would cost you $" + cost100 + " to travel 100 miles. " + "Your car can currently go " + (gas / mileage) + " miles.");




    }
}
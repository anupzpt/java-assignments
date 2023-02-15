import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Q1. What is the name of supervisor?");
        String name = scannerObj.nextLine();
        System.out.println("Q2. What is the total number of employees?");
        int employee = scannerObj.nextInt();
        System.out.println("Q3. How many times the Nuclear waste is removed from the core?");
        int removed = scannerObj.nextInt();
        System.out.println("Q4. What is the total weight of the waste produced every 1 week?");
        float weight = scannerObj.nextFloat();
        System.out.println("Q5. Is Electric Motor being replaced every 18 days? Press y for yes and n for no:");
        char replaced = scannerObj.next().charAt(0);
        System.out.println("Q6. What is the core average temperature (celsius) of the Nuclear Reactor? ");
        float temp = scannerObj.nextFloat();

        System.out.println("Total number of employees: " + employee);
        System.out.println("Name of supervisor is: " + name);
        System.out.println("Times the Nuclear waste removed from the core: " + removed + " times");
        System.out.println("Total weight of the waste produced every 1 week: " + weight + " kgs");

        if (replaced == 'y' || replaced == 'Y') {
            System.out.println("Yes, the electric Motor is being replaced every 18 days.");
        } else {
            System.out.println("No, the electric Motor isn't replaced every 18 days.");
        }

        System.out.println("Core Average Temperature: " + temp + "°C " + "," + (temp+273.15) + "°F");
    }
}
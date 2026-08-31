import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompt for the policy details
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = keyboard.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = keyboard.nextDouble();

        // Initialize a policy object with constructor that takes arguments
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, 
                                   age, smokingStatus, height, weight);

        // Displaying the results
        System.out.println("\n------------------------------------");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.getPrice());

        keyboard.close();
    }
}
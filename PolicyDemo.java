import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;
        
        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

        // Read the file
            while (scanner.hasNext()) {
                int policyNumber = Integer.parseInt(scanner.nextLine().trim());
                String providerName = scanner.nextLine().trim();
                String firstName = scanner.nextLine().trim();
                String lastName = scanner.nextLine().trim();
                int age = Integer.parseInt(scanner.nextLine().trim());
                String smokingStatus = scanner.nextLine().trim();
                double height = Double.parseDouble(scanner.nextLine().trim());
                double weight = Double.parseDouble(scanner.nextLine().trim());

        // Create Policy object and this will be added to the ArrayList
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, 
                                           age, smokingStatus, height, weight);
                policies.add(policy);

        // Count smokers and non-smokers
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else if (smokingStatus.equalsIgnoreCase("non-smoker")) {
                    nonSmokerCount++;
                }
        
                if (scanner.hasNextLine()) {
                    scanner.nextLine(); 
                }
            }
            scanner.close();

            } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }
     
        // Displaying the results

        for (Policy policy : policies) {
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
            
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}

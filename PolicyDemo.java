import java.util.*;
import java.io.*;

//This PolicyDemo class will be reading the insurance policy data from a file,
//The data will get stored in an ArrayList and later be displayed
public class PolicyDemo {
   public static void main(String[] args) throws IOException {
      // Create the ArrayList
      ArrayList<Policy> policyList = new ArrayList<>();
      
      // Open the file provided with the policy info
      File file = new File("PolicyInformation.txt");
      
      // Checking if the file exists before trying to read it
      if (!file.exists()) {
         System.out.println("Unable to find the file: PolicyInformation.txt");
         return;
      }

      Scanner inputFile = new Scanner(file);
      
      // Counters
      int smokerCount = 0;
      int nonSmokerCount = 0;

      // Read the file
      while (inputFile.hasNext()) {
         // Read the data
         String pNumber = inputFile.nextLine();
         String pProvider = inputFile.nextLine();
         String fName = inputFile.nextLine();
         String lName = inputFile.nextLine();
         
         int pAge = inputFile.nextInt();
         inputFile.nextLine(); 
         
         String sStatus = inputFile.nextLine();
         double pHeight = inputFile.nextDouble();
         double pWeight = inputFile.nextDouble();
         
         if (inputFile.hasNextLine()) {
            inputFile.nextLine(); 
         }
         
         //Use the constructor that accepts arguments with Encapsulation
         Policy tempPolicy = new Policy(pNumber, pProvider, fName, lName, pAge, sStatus, pHeight, pWeight);
         
         // Add the object to the ArrayList
         policyList.add(tempPolicy);
      }
      
      // Close the file when it has been finished reading
      inputFile.close();

      //Display the information
      for (Policy p : policyList) {
         System.out.println("Policy Number: " + p.getPolicyNumber());
         System.out.println("Provider Name: " + p.getProviderName());
         System.out.println("Policyholder's First Name: " + p.getFirstName());
         System.out.println("Policyholder's Last Name: " + p.getLastName());
         System.out.println("Policyholder's Age: " + p.getAge());
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
         
         // Adding the units height and weight
         System.out.printf("Policyholder's Height: %.1f inches\n", p.getHeight());
         System.out.printf("Policyholder's Weight: %.1f pounds\n", p.getWeight());
         
         System.out.printf("Policyholder's BMI: %.2f\n", p.calculateBMI());
         System.out.printf("Policy Price: $%.2f\n", p.calculatePolicyPrice());
         System.out.println();

         // Count smokers vs non-smokers status
         if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokerCount++;
         } else {
            nonSmokerCount++;
         }
      }

      // The final output display
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
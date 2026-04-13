import java.util.*;
import java.io.*;

/**
 * The PolicyDemo class is going to read the insurance data, and it will create a Policy and a PolicyHolder 
 * objects.
 */
public class PolicyDemo {
   public static void main(String[] args) throws IOException {
      ArrayList<Policy> policyList = new ArrayList<>();
      File file = new File("PolicyInformation.txt");
      
      if (!file.exists()) {
         System.out.println("Unable to find the file: PolicyInformation.txt");
         return;
      }

      Scanner inputFile = new Scanner(file);
      
      int smokerCount = 0;
      int nonSmokerCount = 0;

      while (inputFile.hasNext()) {
         // Reading Policy Data
         String pNumber = inputFile.nextLine();
         String pProvider = inputFile.nextLine();
         
         // Reading PolicyHolder Data
         String fName = inputFile.nextLine();
         String lName = inputFile.nextLine();
         int pAge = inputFile.nextInt();
         inputFile.nextLine(); // consume newline
         String sStatus = inputFile.nextLine();
         double pHeight = inputFile.nextDouble();
         double pWeight = inputFile.nextDouble();
         
         // Consume blank line if it exists
         if (inputFile.hasNextLine()) {
            inputFile.nextLine(); 
         }
         if (inputFile.hasNextLine()) {
            inputFile.nextLine(); 
         }
         
         // Class collaboration
         // Create the PolicyHolder 
         PolicyHolder holder = new PolicyHolder(fName, lName, pAge, sStatus, pHeight, pWeight);
         
         // Passing the holder to the Policy constructor
         Policy tempPolicy = new Policy(pNumber, pProvider, holder);
         
         // Addding to list
         policyList.add(tempPolicy);
         
         // Counting smoking status
         if (sStatus.equalsIgnoreCase("smoker")) {
            smokerCount++;
         } else {
            nonSmokerCount++;
         }
      }
      
      inputFile.close();

      // Displaying the information
      for (Policy p : policyList) {
         //Implicitly call the toString method
         System.out.println(p);
         System.out.println();
      }

      // Final output display using the static count and the local counters
      System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
//This is a program that is going to create a Policy class that will model an insurance policy for one person.  

import java.util.Scanner;

public class Policy {     
//The insurance policy is going to have the next attributes and are being declared.
   public String policyNumber, providerName, firstName, lastName; 
   public String smokingStatus; //will be smoker or non-smoker
   public int age;
   public double height, weight;
//A no-arg constructor so we are setting the values for all fields.
   public  Policy() {
      policyNumber = "";
      providerName = "";
      firstName = "";  
      lastName = "";
      smokingStatus = "non-smoker";
      age = 0;
      height = 0.0;
      weight = 0.0;
   
}

//The project asks for to include a constructor that accepts arguments to fully initialize the Policy object.
   public Policy(String pNumber, String pProvider, String fName, String lName, String smokeStatus, int pAge, double pHeight, double pWeight) {
      policyNumber = pNumber;
      providerName = pProvider;
      firstName = fName;
      lastName = lName;
      smokingStatus = smokeStatus;
      age = pAge;
      height = pHeight;
      weight = pWeight;

}
// This project is including the setters and getters for each field
//Getters
   public String getPolicyNumber() { return policyNumber; }
   public String getProviderName() { return providerName; }
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public String getSmokingStatus() { return smokingStatus; }
   public int getAge() { return age; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
//Setters
   public void setPolicyNumber(String pNumber) { policyNumber = pNumber; }
   public void setProviderName(String pProvider) { providerName = pProvider; }
   public void setFirstName(String fName) { firstName = fName; }
   public void setLastName(String lName) { lastName = lName; }
   public void setSmokingStatus(String smokeStatus) { smokingStatus = smokeStatus; }
   public void setAge(int pAge) { age = pAge; } 
   public void setHeight(double pHeight) { height = pHeight; }
   public void setWeight(double pWeight) { weight = pWeight; }
   
//We are going to include a method that calculates and returns the BMI of the policy holder
   public double calculateBMI() {
      if (height == 0)
         return 0;
      return (weight * 703) / (height * height); //BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2)
    
}
//We are displaying and calculating the insurance policy price the conditions on this programs.

   public double calculatePolicyPrice() {
//The insurance policy has a base fee of $600. 
     
      double price = 600.0;
//If the Policyholder is over 50 years old, there will be an additional fee of $75.  
   
         if (age > 50)
            price += 75;
//If the Policyholder is a smoker, there is an additional fee of $100.   
 
         if(smokingStatus.equalsIgnoreCase("smoker"))
            price += 100;
            
//If the Policyholder has a BMI of over 35, the additional fee will be: (BMI - 35) * 20.
      double bmi = calculateBMI();
         if (bmi > 35)
            price += (bmi - 35) * 20;
            
         return price;
         
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Policy policy = new Policy();
       
      //Let the user prompt for the imput
      
      System.out.print("Please enter your Policy Number: ");
      policy.setPolicyNumber(input.nextLine());
      
      System.out.print("Please enter the Provider Name: ");
      policy.setProviderName(input.nextLine());
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policy.setFirstName(input.nextLine());
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policy.setLastName(input.nextLine());
      
      System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
      policy.setSmokingStatus(input.nextLine());
      
      System.out.print("Please enter the Policyholder's Age: ");
      policy.setAge(input.nextInt());
      
      System.out.print("Please enter the Policyholder's height (in inches): ");
      policy.setHeight(input.nextDouble());
      
      System.out.print("Please enter the Policyholder's weight (in pounds): ");
      policy.setWeight(input.nextDouble());
      
      //The informations is getting display
      
      System.out.println("\n --- Policy Information ---");
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Height: " + policy.getHeight());
      System.out.println("Policyholder's Weight: " + policy.getWeight());
      
      //The calculation for the BMI and the price
      
      System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
      
      input.close();
   }
}
        



      
   


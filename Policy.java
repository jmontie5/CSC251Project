// This policy is going to model an insurance policy for one person.
//It calculates BMI and the total policy price based on specific stuff.
public class Policy {
   // Fields are going to be private to ensure the Encapsulation
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus; // "smoker" or "non-smoker"
   private double height; // in inches
   private double weight; // in pounds

   // No-arg constructor 
 
   public Policy() {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }

   // Constructor that accepts arguments to initialize the Policy object.
   // @param pNumber The unique policy number.
   // @param pProvider The name of the insurance provider.
   // @param fName The policyholder's first name.
   // @param lName The policyholder's last name.
   // @param pAge The policyholder's age.
   // @param sStatus The smoking status ("smoker" or "non-smoker").
   // @param pHeight The height in inches.
   // @param pWeight The weight in pounds.
   public Policy(String pNumber, String pProvider, String fName, String lName, 
                 int pAge, String sStatus, double pHeight, double pWeight) {
      policyNumber = pNumber;
      providerName = pProvider;
      firstName = fName;
      lastName = lName;
      age = pAge;
      smokingStatus = sStatus;
      height = pHeight;
      weight = pWeight;
   }

   // Using Setters and Getters
   
   public void setPolicyNumber(String pNumber) { policyNumber = pNumber; }
   public String getPolicyNumber() { return policyNumber; }

   public void setProviderName(String pProvider) { providerName = pProvider; }
   public String getProviderName() { return providerName; }

   public void setFirstName(String fName) { firstName = fName; }
   public String getFirstName() { return firstName; }

   public void setLastName(String lName) { lastName = lName; }
   public String getLastName() { return lastName; }

   public void setAge(int pAge) { age = pAge; }
   public int getAge() { return age; }

   public void setSmokingStatus(String sStatus) { smokingStatus = sStatus; }
   public String getSmokingStatus() { return smokingStatus; }

   public void setHeight(double pHeight) { height = pHeight; }
   public double getHeight() { return height; }

   public void setWeight(double pWeight) { weight = pWeight; }
   public double getWeight() { return weight; }

   //Calculates the Body Mass Index (BMI) of the policyholder.
   // Using  @return for the calculated BMI value.
  
   public double calculateBMI() {
      if (height == 0) return 0;
      return (weight * 703) / (height * height);
   }

   // Calculates total price of the insurance policy
   // @return The final price of the policy.
   public double calculatePolicyPrice() {
      double price = 600.0; 
      
      if (age > 50) {
         price += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100;
      }
      
      double bmi = calculateBMI();
      if (bmi > 35) {
         price += (bmi - 35) * 20;
      }
      
      return price;
   }
}
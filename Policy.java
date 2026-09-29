public class Policy {
//creating a policy class that will model an insurance policy for a person.
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
/**
 *No-arg constructor
 */
public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
}
    /** Constructor with arguments and documentation comments 
     * @param policyNumber  The policy number
     * @param providerName  The insurance provider name
     * @param firstName     The policyholder's first name
     * @param lastName      The policyholder's last name
     * @param age           The policyholder's age
     * @param smokingStatus The policyholder's smoking status (smoker/non-smoker)
     * @param height        The policyholder's height in inches
     * @param weight        The policyholder's weight in pounds
     */

    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
}
    // Getters and Setters
    /**
     * Gets the policy number.
     * @return The policy number
     */

    public int getPolicyNumber() {
        return policyNumber;
    }
    /**
     * Sets the policy number.
     * @param policyNumber The policy number to set
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    /**
     * Gets the provider name.
     * @return The provider name
     */
    public String getProviderName() {
        return providerName;
    }
     /**
     * Sets the provider name.
     * @param providerName The provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    /**
     * Gets the policyholder's first name.
     * @return The first name
     */
    public String getFirstName() {
        return firstName;
    }
      /**
     * Sets the policyholder's first name.
     * @param firstName The first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Gets the policyholder's last name.
     * @return The last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Sets the policyholder's last name.
     * @param lastName The last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Gets the policyholder's age.
     * @return The age
     */
    public int getAge() {
        return age;
    }
    /**
     * Sets the policyholder's age.
     * @param age The age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Gets the policyholder's smoking status.
     * @return The smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    /**
     * Sets the policyholder's smoking status.
     * @param smokingStatus The smoking status to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    /**
     * Gets the policyholder's height.
     * @return The height in inches
     */
    public double getHeight() {
        return height;
    }
    /**
     * Sets the policyholder's height.
     * @param height The height in inches to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Gets the policyholder's weight.
     * @return The weight in pounds
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Sets the policyholder's weight.
     * @param weight The weight in pounds to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
}

//Using the calculation methods 
/**
     * Calculates and returns the Body Mass Index (BMI) of the policyholder.
     * @return The calculated BMI
     */
    public double getBMI() {
        if (height <= 0) {
            return 0.0;
        }
        return (weight * 703.0) / (height * height);
    }
/**
     * Calculates and returns the total monthly price of the insurance policy based on age, smoking status, and BMI.
     * @return The calculated policy price
     */
    public double getPrice() {
        double price = 600.0; // Base fee

        if (age > 50) {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = getBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20.0;
        }

        return price;
    }
}

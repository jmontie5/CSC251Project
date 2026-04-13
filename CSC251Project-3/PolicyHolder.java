/**
 * This PolicyHolder class is representing the information of a person  with an insurance policy.
 */
public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * No-arg constructor
     */
    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * Parameterized constructor
     * @param fName First name
     * @param lName Last name
     * @param pAge Age
     * @param sStatus Smoking status
     * @param pHeight Height in inches
     * @param pWeight Weight in pounds
     */
    public PolicyHolder(String fName, String lName, int pAge, String sStatus, double pHeight, double pWeight) {
        firstName = fName;
        lastName = lName;
        age = pAge;
        smokingStatus = sStatus;
        height = pHeight;
        weight = pWeight;
    }

    /**
     * Minimizing the risk of security holes in this program
     * @param object2 The PolicyHolder object to copy
     */
    public PolicyHolder(PolicyHolder object2) {
        this.firstName = object2.firstName;
        this.lastName = object2.lastName;
        this.age = object2.age;
        this.smokingStatus = object2.smokingStatus;
        this.height = object2.height;
        this.weight = object2.weight;
    }

    //  GETTERS AND SETTERS WITH THE JAVADOC 

    /** @return First name */
    public String getFirstName() { return firstName; }
    /** @param fName Sets first name */
    public void setFirstName(String fName) { firstName = fName; }

    /** @return Last name */
    public String getLastName() { return lastName; }
    /** @param lName Sets last name */
    public void setLastName(String lName) { lastName = lName; }

    /** @return Age */
    public int getAge() { return age; }
    /** @param pAge Sets age */
    public void setAge(int pAge) { age = pAge; }

    /** @return Smoking status */
    public String getSmokingStatus() { return smokingStatus; }
    /** @param sStatus Sets smoking status */
    public void setSmokingStatus(String sStatus) { smokingStatus = sStatus; }

    /** @return Height */
    public double getHeight() { return height; }
    /** @param pHeight Sets height */
    public void setHeight(double pHeight) { height = pHeight; }

    /** @return Weight */
    public double getWeight() { return weight; }
    /** @param pWeight Sets weight */
    public void setWeight(double pWeight) { weight = pWeight; }

    /**
     * Calculates BMI
     * @return Calculated BMI
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * toString method
     * @return A string representation of the PolicyHolder
     */
    @Override
    public String toString() {
        return String.format("Policyholder's First Name: %s\n" +
                "Policyholder's Last Name: %s\n" +
                "Policyholder's Age: %d\n" +
                "Policyholder's Smoking Status (Y/N): %s\n" +
                "Policyholder's Height: %.1f inches\n" +
                "Policyholder's Weight: %.1f pounds\n" +
                "Policyholder's BMI: %.2f",
                firstName, lastName, age, smokingStatus, height, weight, calculateBMI());
    }
}
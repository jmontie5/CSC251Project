public class PolicyHolder {
    // Declating the fields
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // inches
    private double weight; // pounds

    // Constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    //  Minimizing the risk of security holes
    public PolicyHolder(PolicyHolder object2) {
        this.firstName = object2.firstName;
        this.lastName = object2.lastName;
        this.age = object2.age;
        this.smokingStatus = object2.smokingStatus;
        this.height = object2.height;
        this.weight = object2.weight;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // BMI Calculation Method
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // toString method 
    public String toString() {
        return "Policyholder's First Name: " + firstName +
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
               "\nPolicyholder's Height: " + height + " inches" +
               "\nPolicyholder's Weight: " + weight + " pounds" +
               String.format("\nPolicyholder's BMI: %.2f", calculateBMI());
    }
}
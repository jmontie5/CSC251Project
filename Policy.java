public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder holder; // Class Collaboration
    
    // Static field to track number of Policy objects created 
    private static int policyCount = 0;

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        //avoiding security holes for PolicyHolder
        this.holder = new PolicyHolder(holder); 
        
        // Increment static counter
        policyCount++;
    }

    // Getters and Setters
    public int getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    // Security
    public PolicyHolder getHolder() {
        return new PolicyHolder(holder);
    }

    public void setHolder(PolicyHolder holder) {
        this.holder = new PolicyHolder(holder);
    }

    // Static method to get policy count
    public static int getPolicyCount() {
        return policyCount;
    }

    // Policy Price Calculation Method
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (holder.getAge() > 50) {
            additionalFee += 75.0;
        }
        if (holder.getSmokingStatus().equalsIgnoreCase("smoker") || 
            holder.getSmokingStatus().equalsIgnoreCase("y")) {
            additionalFee += 100.0;
        }

        double bmi = holder.calculateBMI();
        if (bmi > 25) {
            additionalFee += (bmi - 25) * 20.0;
        }

        return baseFee + additionalFee;
    }

    // toString method 
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + holder.toString() +
               String.format("\nPolicy Price: $%.2f\n", calculatePolicyPrice());
    }
}
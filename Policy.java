/**
 * The Policy class is representing an insurance policy.
 */
public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder holder; // Aggregation
    
    // Static field to track objects
    private static int policyCount = 0;

    /**
     * Parameterized constructor
     */
    public Policy(String pNumber, String pProvider, PolicyHolder pCHolder) {
        policyNumber = pNumber;
        providerName = pProvider;
        //Return a copy to avoid security holes
        this.holder = new PolicyHolder(pCHolder);
        policyCount++;
    }

    /** @return The number of policies created */
    public static int getPolicyCount() { return policyCount; }

    /**
     * Calculates total price of the insurance policy
     * @return The final price
     */
    public double calculatePolicyPrice() {
        double price = 600.0;
        if (holder.getAge() > 50) price += 75;
        if (holder.getSmokingStatus().equalsIgnoreCase("smoker")) price += 100;
        double bmi = holder.calculateBMI();
        if (bmi > 35) price += (bmi - 35) * 20;
        return price;
    }

    /**
     * toString method 
     * @return String representation of the Policy
     */
    @Override
    public String toString() {
        return String.format("Policy Number: %s\nProvider Name: %s\n%s\nPolicy Price: $%.2f",
                policyNumber, providerName, holder.toString(), calculatePolicyPrice());
    }
}
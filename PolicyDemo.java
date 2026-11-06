import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) {
        // Creating an ArrayList to hold policies
        ArrayList<Policy> policies = new ArrayList<>();

        // Alice Jones
        PolicyHolder holder1 = new PolicyHolder("Alice", "Jones", 20, "smoker", 65.0, 110.0);
        policies.add(new Policy(3450, "State Farm", holder1));

        // Bob Lee
        PolicyHolder holder2 = new PolicyHolder("Bob", "Lee", 54, "non-smoker", 72.0, 200.0);
        policies.add(new Policy(3455, "Aetna", holder2));

        // Chester Williams
        PolicyHolder holder3 = new PolicyHolder("Chester", "Williams", 40, "smoker", 71.0, 300.0);
        policies.add(new Policy(2450, "Met Life", holder3));

        // Cindy Smith
        PolicyHolder holder4 = new PolicyHolder("Cindy", "Smith", 55, "non-smoker", 62.0, 140.0);
        policies.add(new Policy(3670, "Global", holder4));

        // Jenna Lewis
        PolicyHolder holder5 = new PolicyHolder("Jenna", "Lewis", 30, "smoker", 60.0, 105.0);
        policies.add(new Policy(1490, "Reliable", holder5));

        // Craig Duncan
        PolicyHolder holder6 = new PolicyHolder("Craig", "Duncan", 23, "smoker", 66.0, 215.0);
        policies.add(new Policy(3477, "State Farm", holder6));

        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Implicitly calling toString()
        for (Policy p : policies) {
            System.out.println(p); // it calls p.toString()
            
            // Tracking smokers and non-smokers 
            String status = p.getHolder().getSmokingStatus();
            if (status.equalsIgnoreCase("smoker") || status.equalsIgnoreCase("y")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        // Displaying the summary counts 
        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
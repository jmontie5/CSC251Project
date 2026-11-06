import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Creating an ArrayList to hold policies
        ArrayList<Policy> policies = new ArrayList<>();

        // Initialize policy records
        PolicyHolder holder1 = new PolicyHolder("Alice", "Jones", 20, "smoker", 65.0, 110.0);
        policies.add(new Policy(3450, "State Farm", holder1));

        PolicyHolder holder2 = new PolicyHolder("Bob", "Lee", 54, "non-smoker", 72.0, 200.0);
        policies.add(new Policy(3455, "Aetna", holder2));

        // adding remaining policies as shown in the sample output

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
import java.util.Enumeration;

public class Conditional {
    public static void main(String[] args) {

        // Constants

        enum PlanType {
            Basic, Intermediary, Plus
        }

        // Properties

        int releaseYear = 2023;
        String filmsName = "Barbie";
        boolean includedInThePlan = true;
        PlanType planType = PlanType.Intermediary;

        // Conditional (IF-ELSE)

        if(releaseYear > 2020) {
            System.out.println("Best recent film releases!");
        } else {
            System.out.println("Best not so recent films!");
        }

        if(includedInThePlan == true && planType == PlanType.Plus) {
            System.out.println("Film released!");
        } else {
            System.out.println("No released!");
        }

        // Conditional (Switch-case)

        switch (planType) {
            case Basic:
                System.out.println("Basic Plan");
                break;
            case Intermediary:
                System.out.println("Intermediary Plan");
                break;
            case Plus:
                System.out.println("Plus Plan");
                break;
            default: break;
        }
    }
}

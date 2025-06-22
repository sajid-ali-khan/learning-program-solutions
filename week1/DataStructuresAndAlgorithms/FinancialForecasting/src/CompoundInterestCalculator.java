import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompoundInterestCalculator {
    static Map<Integer, Double> cmap;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        double principle = sc.nextDouble();
        System.out.println("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.println("Enter the time(in years): ");
        int time = sc.nextInt();

        double compoundInterest = forecastCompoundInterest(principle, interestRate, time);

        System.out.printf("The compound interest in %d years is: ₹%.2f\n", time, compoundInterest);
    }

    private static double forecastCompoundInterest(double principle, double interestRate, int time) {
        if (time <= 0) {
            return principle;
        }

        double previousCompoundInterest = forecastCompoundInterest(principle, interestRate, time-1);
        return (1 + interestRate) * previousCompoundInterest;
    }


}

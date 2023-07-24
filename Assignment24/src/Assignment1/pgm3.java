package Assignment1;

import java.util.Scanner;

public class pgm3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years): ");
        int time = scanner.nextInt();

        double simpleInterest = principal * rate * time / 100;

        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.println("Simple interest = " + simpleInterest);
        System.out.println("Compound interest = " + compoundInterest);
    }
}
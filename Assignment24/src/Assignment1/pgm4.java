package Assignment1;

import java.util.Scanner;

public class pgm4 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for three subjects:");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        scanner.close();
        
        if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
            System.out.println("Result: Passed");
        } 
        else if ((subject1 > 60 && subject2 > 60) || (subject2 > 60 && subject3 > 60) || (subject1 > 60 && subject3 > 60)) {
            System.out.println("Result: Promoted");
        }
        else if (subject1 > 60 || subject2 > 60 || subject3 > 60 || (subject1 < 60 && subject2 < 60 && subject3 < 60)) {
            System.out.println("Result: Failed");
        } 
        else {
            System.out.println("Invalid marks entered");
        }
    }
}
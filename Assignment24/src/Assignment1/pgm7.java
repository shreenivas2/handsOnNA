package Assignment1;

import java.util.Scanner;

public class pgm7 {
    public static void main(String[] args) {
    	
        int[] array = {12, 78, 23, 26, 35, 52, 86, 5, 14, 6, 19, 1, 37, 7, 47};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int searchValue = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchValue + " is present in the array.");
        } else {
            System.out.println("The value " + searchValue + " is not present in the array.");
        }
    }
}

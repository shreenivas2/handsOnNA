package Assignment3;

import java.util.Scanner;

public class pgm23 {

    public static void main(String[] args) {
        String originalString = "This method returns the reversed object on which it was called";
        StringBuffer reversedString = new StringBuffer();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString.append(originalString.charAt(i));
        }
        System.out.println(reversedString);
    }
}


package Assignment3;

import java.util.Scanner;

public class pgm22 {

    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String stringToInsert = "insert text";
        int index = 6;
        String newString = originalString.substring(0, index) + stringToInsert + originalString.substring(index);
        System.out.println(newString);
    }
}


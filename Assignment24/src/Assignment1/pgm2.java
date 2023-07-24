package Assignment1;

public class pgm2 {

	 public static void main(String[] args) {
	        System.out.println("Armstrong numbers between 100 and 999:");
	        for (int num = 100; num <= 999; num++) {
	            if (isArmstrongNumber(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static boolean isArmstrongNumber(int number) {
	        int originalNumber = number;
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, 3);
	            number /= 10;
	        }

	        return sum == originalNumber;
	    }
	}

package Assignment1;

	import java.util.Scanner;

	public class pgm9 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int student1MarksA = 0, student1MarksB = 0, student1MarksC = 0;
	        int student2MarksA = 0, student2MarksB = 0, student2MarksC = 0;
	        int student3MarksA = 0, student3MarksB = 0, student3MarksC = 0;
	        int totalMarksA = 0, totalMarksB = 0, totalMarksC = 0;
	        float averageMarksA = 0, averageMarksB = 0, averageMarksC = 0;

	        System.out.println("Enter the marks of student 1 for subject A: ");
	        student1MarksA = scanner.nextInt();
	        System.out.println("Enter the marks of student 1 for subject B: ");
	        student1MarksB = scanner.nextInt();
	        System.out.println("Enter the marks of student 1 for subject C: ");
	        student1MarksC = scanner.nextInt();

	        System.out.println("Enter the marks of student 2 for subject A: ");
	        student2MarksA = scanner.nextInt();
	        System.out.println("Enter the marks of student 2 for subject B: ");
	        student2MarksB = scanner.nextInt();
	        System.out.println("Enter the marks of student 2 for subject C: ");
	        student2MarksC = scanner.nextInt();

	        System.out.println("Enter the marks of student 3 for subject A: ");
	        student3MarksA = scanner.nextInt();
	        System.out.println("Enter the marks of student 3 for subject B: ");
	        student3MarksB = scanner.nextInt();
	        System.out.println("Enter the marks of student 3 for subject C: ");
	        student3MarksC = scanner.nextInt();

	        totalMarksA = student1MarksA + student2MarksA + student3MarksA;
	        totalMarksB = student1MarksB + student2MarksB + student3MarksB;
	        totalMarksC = student1MarksC + student2MarksC + student3MarksC;

	        averageMarksA = totalMarksA / 3;
	        averageMarksB = totalMarksB / 3;
	        averageMarksC = totalMarksC / 3;

	        System.out.println("Total marks for subject A: " + totalMarksA);
	        System.out.println("Average marks for subject A: " + averageMarksA);
	        System.out.println("Total marks for subject B: " + totalMarksB);
	        System.out.println("Average marks for subject B: " + averageMarksB);
	        System.out.println("Total marks for subject C: " + totalMarksC);
	        System.out.println("Average marks for subject C: " + averageMarksC);
	    }
	}

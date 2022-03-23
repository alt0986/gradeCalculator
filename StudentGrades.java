package midtermProject;

import java.util.Scanner;
public class StudentGrades {

	public static void main(String[] args) {
	//
		Scanner inputDevice = new Scanner(System.in);
		
	//Create students
		Student studentA = new Student();
		Student studentB = new Student();
		Student studentC = new Student();
		
	//Input student A's info
		//Name
		System.out.println("\nFirst student's name: ");
		studentA.name = inputDevice.nextLine();
		//Student ID
		System.out.println("\n\nPlease enter "+studentA.name+"'s info\n");
		System.out.println("Student ID: ");
		studentA.studentID = inputDevice.nextInt();
		//Assignment 1 grade
		System.out.println("Assignment 1: ");
		studentA.assignment1 = inputDevice.nextDouble();
		//Assignment 2 grade
		System.out.println("Assignment 2: ");
		studentA.assignment2 = inputDevice.nextDouble();
		//Assignment 3 grade
		System.out.println("Assignment 3: ");
		studentA.assignment3 = inputDevice.nextDouble();
		
		//Fixes skipping scanner line
		inputDevice.nextLine();
		
	//Input student B's info
		System.out.println("\nSecond student's name: ");
		studentB.name = inputDevice.nextLine();

		System.out.println("\n\nPlease enter "+studentB.name+"'s info\n");
		System.out.println("Student ID: ");
		studentB.studentID = inputDevice.nextInt();

		System.out.println("Assignment 1: ");
		studentB.assignment1 = inputDevice.nextDouble();
		
		System.out.println("Assignment 2: ");
		studentB.assignment2 = inputDevice.nextDouble();

		System.out.println("Assignment 3: ");
		studentB.assignment3 = inputDevice.nextDouble();
		
		//Fixes skipping scanner line
		inputDevice.nextLine();
				
	//Input student C's info
		System.out.println("\nThird student's name: ");
		studentC.name = inputDevice.nextLine();

		System.out.println("\n\nPlease enter "+studentC.name+"'s info\n");
		System.out.println("Student ID: ");
		studentC.studentID = inputDevice.nextInt();

		System.out.println("Assignment 1: ");
		studentC.assignment1 = inputDevice.nextDouble();
		
		System.out.println("Assignment 2: ");
		studentC.assignment2 = inputDevice.nextDouble();

		System.out.println("Assignment 3: ");
		studentC.assignment3 = inputDevice.nextDouble();
		
	//Output student info and grades
		studentA.calculateAverage();
		studentB.calculateAverage();
		studentC.calculateAverage();
	}

}

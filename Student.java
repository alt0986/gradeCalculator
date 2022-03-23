package midtermProject;

public class Student {
	//Variables
	String name;
	int studentID;
	double assignment1;
	double assignment2;
	double assignment3;
	String letterGrade;
	
	//Calculate the average grade of the 3 assignments
	void calculateAverage() {
		double average = (assignment1+assignment2+assignment3)/3;
		
	//Print assignment grades and average
		System.out.println("\n\n"+name+"'s grades\n");
		System.out.println("Assignment 1: "+assignment1);
		System.out.println("Assignment 2: "+assignment2);
		System.out.println("Assignment 3: "+assignment3);
		System.out.println("\nGrade average: "+average+"%");
		
	//Convert the grade average to a letter grade
		if (average>=90) {
			letterGrade = "A";
		}
		else if(average>=80) {
			letterGrade = "B";
		}
		else if(average>=70) {
			letterGrade = "C";
		}
		else if(average>=60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
	//Print final grade as a letter
		System.out.println("Final grade: "+letterGrade);
	}
	
	//Constructor
	Student() {
		System.out.println("Constructor started");
		studentID=100;
		
	}
}

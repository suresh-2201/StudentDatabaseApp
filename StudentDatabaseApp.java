package StudentDatabaseApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {		
		
		System.out.print("Enter number of students to enroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for (int n=0; n<numOfStudents;n++) {
			System.out.println(students[n].toString());
		}
	}

}
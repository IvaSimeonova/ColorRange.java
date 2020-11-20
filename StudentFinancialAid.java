package Iva;

import java.util.Scanner;

public class StudentFinancialAid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);
        
        for( int i = 0; i < 5; i++){
        	String name = sc.nextLine();
        	double grade = sc.nextDouble();
        	sc.nextLine();
        	students[i] = new Student(name, grade);
        }
       
        displayStudentsEligible(students);
	}

	public static void displayStudentsEligible(Student students[]) {
		// TODO Auto-generated method stub
		for(Student s : students){
			if(isStudentEligible(s)){
				System.out.println(s.getName());
			}
		}
		
	}

	public static boolean isStudentEligible(Student student) {
		// TODO Auto-generated method stub
		return student.getGrade() > 5.50;
	}

}

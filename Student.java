package Iva;

public class Student {
	private String name;
	private double grade;
	
	public Student(){
	}
	
	public Student(String name, double grade){
		this.setName(name);
		this.setGrade(grade);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

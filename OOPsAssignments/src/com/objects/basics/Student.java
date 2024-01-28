package com.objects.basics;
public class Student {
	String name,department;
	int sum = 0;
	
	public Student(String Name, String dept) {
		this.name= Name;
		this.department = dept;
	}

	public void printDetails() {
		System.out.println("Name:" +name);
		System.out.println("Department:" +department);
	}
	public String getGrades(int marks[]) {
		int i =0;
		for(i = 0;i <= marks.length;i++) {
		if ( marks[i] >= 90 && marks[i] < 100 ) {
			System.out.println("Grade: A");
		}else if (marks[i] >= 80 && marks[i] < 90) {
			System.out.println("Grade: B");
		}else if(marks[i] >= 70 && marks[i]< 80 ) {
			System.out.println("Grade: C");
		}else if(marks[i] >=60 && marks[i] < 70) {
			System.out.println("Grade: D");
		}else if (marks[i] >= 50 && marks[i] <59) {
			System.out.println("Grade: E");
		}else {
			System.out.println("Fail");
		}
		}
		sum = sum  + marks[i];
		int average = sum / 3;
		System.out.println("Average:"+ average);
		return department;
	}
}

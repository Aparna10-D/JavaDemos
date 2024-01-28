package com.objects.basics;

public class Main2 {

	public static void main(String[] args) {
		Student student = new Student("Aparna", "Civil");
		student.printDetails();
		int[] arr= new int []{89,98,78};
		student.getGrades(arr);
		Student student2 = new Student("Anu", "ECE");
		student2.printDetails();
		int[] arr2 = new int []{85,88,78};
		student2.getGrades(arr2);
		

	}
}
package by.jonline.mod01.branching.main;
// Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

public class Task9 {

	public static void main(String[] args) {
		double a = 12.0;
		double b = 12.0;
		double c = 12.0;
		
		if ((a == b) && (a == c)) {
			System.out.println("треугольник со сторонами a, b и c равносторонний");			
		} else {
			System.out.println("треугольник со сторонами a, b и c не равносторонний");
		}
		

	}

}

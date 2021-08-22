package by.jonline.mod01.branching.main;
// Составить программу, которая определит площадь какого треугольника больше.

public class Task11 {

	public static void main(String[] args) {
		double a1 = 10.0;
		double b1 = 2.5;
		double c1 = 15.0;
		
		double a2 = 1.5;
		double b2 = 5.5;
		double c2 = 10.0;
		
		double p1 = (a1 + b1 + c1) / 2;
		double p2 = (a2 + b2 + c2) / 2;
		
		double s1 = Math.sqrt(p1 * (p1 - a1) + (p1 - b1) * (p1 - c1));
		double s2 = Math.sqrt(p2 * (p2 - a2) + (p2 - b2) * (p2 - c2));
		
		if (s1 > s2) {
			System.out.println("Площадь треугольника со сторонами a1, b1 и c1 больше площади треугольника со сторонами a2, b2 и c2");
		} else {
			System.out.println("Площадь треугольника со сторонами a2, b2 и c2 больше площади треугольника со сторонами a1, b1 и c1");
		}

	}

}

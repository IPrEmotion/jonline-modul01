package by.jonline.mod01.branching.main;
// Подсчитать количество отрицательных среди чисел a, b, c.

public class Task18 {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 0.75;
		double c = 2.5;
		int total = 0;
		
		if (a < 0) {
			total += 1;
		}
		
		if (b < 0) {
			total += 1;
		}
		
		if (c < 0) {
			total += 1;
		}
			
			System.out.println("Отрицательных чисел среди a, b, c: " + total);
	}

}
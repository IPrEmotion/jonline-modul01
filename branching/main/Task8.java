package by.jonline.mod01.branching.main;
// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task8 {

	public static void main(String[] args) {
		double a = 0.5;
		double b = -5.5;
		
		double aa = Math.pow(a, 2);
		double bb = Math.pow(b, 2);
		
		if (aa < bb) {
			System.out.println("квадрат числа a меньше квадрата числа b");
		} else {
			System.out.println("квадрат числа b меньше квадрата числа a");
		}



	}

}

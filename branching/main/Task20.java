package by.jonline.mod01.branching.main;
// Определить, делителем каких чисел a, b, c является число k.

public class Task20 {

	public static void main(String[] args) {
		double a = -2.0;
		double b = 22.0;
		double c = -12.0;
		double k = 4.5;
		
		if ((a % k) == 0) {
			System.out.println("Число " + k + " является делителем для числа a");
		} else {
			System.out.println("Число " + k + " не является делителем для числа a");
		}
		
		if ((b % k) == 0) {
			System.out.println("Число " + k + " является делителем для числа b");
		}else {
			System.out.println("Число " + k + " не является делителем для числа b");
		}
		
		if ((c % k) == 0) {
			System.out.println("Число " + k + " является делителем для числа c");
		}else {
			System.out.println("Число " + k + " не является делителем для числа c");
		}
		

	}

}

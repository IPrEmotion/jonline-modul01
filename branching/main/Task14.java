package by.jonline.mod01.branching.main;
// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task14 {

	public static void main(String[] args) {
		int a = 20;
		int b = 80;
		int c = 180 - (a + b);
		
		if ((a + b) < 180) {
			System.out.println("Треугольник с углами a = " + a + " градусов и b = " + b + " градусов существует.");
			if((a == 90) || (b == 90) || (c == 90)) {
				System.out.println("И этот треугольник прямоугольный.");
			} else {
				System.out.println("Но этот треугольник не прямоугольный.");
			}
		}else {
			System.out.println("Треугольника с углами a = " + a + " градусов и b = " + b + " градусов не существует.");
		}

	}

}

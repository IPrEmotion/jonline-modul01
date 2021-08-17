package by.jonline.mod01.cycle.main;
// Составить программу нахождения разности кубов первых двухсот чисел.

public class Task11 {

	public static void main(String[] args) {
		int i = 0;
		double res = 0.0;
		double num = -0.01;
		
		while (i <= 200) {
			res -= num * num * num;
			num += 0.01;
			i++;
		}
		
		System.out.println("Разность кубов первых двухсот чисел равна " + res);

	}

}

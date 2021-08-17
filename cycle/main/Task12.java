package by.jonline.mod01.cycle.main;
// Последовательность An строится так: A1 = 1, An=6+An-1 , для каждого n>1. 
// Составьте программу нахождения произведения первых 10 членов этой последовательности.

public class Task12 {

	public static void main(String[] args) {
		int i = 0;
		double A = 1.0;
		int res = 1;
				
		while (i < 10) {
			res *= A;
			A += 6.0;
			i++;
		}
		System.out.println("Произведение первых 10 членов последовательности Аn равно " + res);

	}

}

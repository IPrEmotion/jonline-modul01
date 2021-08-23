package by.jonline.mod01.cycle.main;
// Составить таблицу значений функции y = 5 - х^2/2 на отрезке [-5; 5] с шагом 0.5.

public class Task13 {

	public static void main(String[] args) {
		double x = -5.5;
		double y;
		double temp;
		
		
		while (x < 5) {
			temp = (x * x) / 2;
			y = 5 - temp;
			x += 0.5;
			System.out.println("для х = " + x + ", у = " + y);
		}
			
		

	}

}

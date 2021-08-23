package by.jonline.mod01.cycle.main;
// Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h. 
// Результат представить в виде таблицы, первый столбец которой — значения аргумента, второй - соответствующие значения функции: F(x) = x–sin(x)

public class Task21 {

	public static void main(String[] args) {
		double a = -1.0;
		double b = 5.0;
		double fun;
		double h = 1.5;
		
		while (a <= b) {
			fun = a - Math.sin(a);
			System.out.println("При x = " + a + "  результат F(x) = " + fun);
			a += h;
			
		}
		

	}

}

package by.jonline.mod01.cycle.main;
//Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h. 
//Результат представить в виде таблицы, первый столбец которой — значения аргумента, второй - соответствующие значения функции: F(x) = sin^2(x)

public class Task22 {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 10.0;
		double fun;
		double h = 2.5;
		
		while (a <= b) {
			fun = Math.pow(Math.sin(a), 2);
			System.out.println("При x = " + a + "  результат F(x) = " + fun);
			a += h;
			
		}
		

	}

}

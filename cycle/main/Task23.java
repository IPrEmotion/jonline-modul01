package by.jonline.mod01.cycle.main;
//Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h. 
//Результат представить в виде таблицы, первый столбец которой — значения аргумента, второй - соответствующие значения функции: F(x) = ctg(x/3)+ 1/2sin(x)

public class Task23 {

	public static void main(String[] args) {
		double a = - 1.0;
		double b = 1.0;
		double fun;
		double h = 0.25;
		
		while (a <= b) {
			fun = 1 / Math.tan(a / 3) + 0.5 * Math.sin(a);
			System.out.println("При x = " + a + "  результат F(x) = " + fun);
			a += h;
			
		}

	}

}

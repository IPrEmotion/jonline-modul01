package by.jonline.mod01.cycle.main;
// —оставить программу дл€ вычислени€ значений функции F(x) на отрезке [a, b] с шагом h. 
// –езультат представить в виде таблицы, первый столбец которой Ч значени€ аргумента, второй - соответствующие значени€ функции: F(x) = xЦsin(x)

public class Task21 {

	public static void main(String[] args) {
		double a = -1.0;
		double b = 5.0;
		double fun;
		double h = 1.5;
		
		while (a <= b) {
			fun = a - Math.sin(a);
			System.out.println("ѕри x = " + a + "  результат F(x) = " + fun);
			a += h;
			
		}
		

	}

}

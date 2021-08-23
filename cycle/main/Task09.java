package by.jonline.mod01.cycle.main;
// Найти сумму квадратов первых ста чисел.

public class Task09 {

	public static void main(String[] args) {
		
		int i = 1;
		int res = 0;
		
		while (i < 101) {
			res += i * i;
			i++;
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна " + res);
		

	}

}

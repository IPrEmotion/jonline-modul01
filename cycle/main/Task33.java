package by.jonline.mod01.cycle.main;
// Найдите наибольшую цифру данного натурального числа

public class Task33 {

	public static void main(String[] args) {
		int n = 689;
		int k;
		int i = 1;
		int max = 0;
		while (n/i > 1) {
			k = (n % (i*10)) / i;
			if (k > max) {
				max = k;
			}
			i*=10;
		}
		System.out.println("Наибольшая цифра числа " + n + " это " + max);
		

	}

}

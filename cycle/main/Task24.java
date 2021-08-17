package by.jonline.mod01.cycle.main;
// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в другое число, 
// цифры которого будут следовать в обратном порядке по сравнению с введенным числом.

public class Task24 {

	public static void main(String[] args) {
		int n = 12367;
		int part = 0;
		int sum = 0;
		int revers = 0;
		
		int i = 1;
		while ((n / i) >= 1) {
			part = n % (i * 10) / i;
			
			if ((part % 2) == 0) {
				sum += part;
			}
			
			revers = revers * 10 + part;
									
			i*=10;		
		
		}
		
		System.out.println("Сумма четных чисел числа " + n + " равна " + sum);
		System.out.println("Преобразованное число: " + revers);
		

	}

}

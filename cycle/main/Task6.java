package by.jonline.mod01.cycle.main;
import java.util.Scanner;
// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int x;
			String str;
			System.out.println("Введите целое положительное число >> ");
			while (sc.hasNextInt() == false) {
				str = sc.nextLine();
				System.out.println("Введите целое положительное число >> ");
			}
			x = sc.nextInt();
			System.out.println("Введенное число = " + x);
			
			int i = 1;
			int res = 0;
			while (i < (x + 1)) {
				res += i;
				i++;
			}
			
			System.out.println("Сумма всех чисел от 1 до " + x + " равна " + res);
			
		} finally {
			if (sc !=null) {
				sc.close();
			}
		}
		

	}

}

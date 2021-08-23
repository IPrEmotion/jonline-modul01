package by.jonline.mod01.cycle.main;
// Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать. 
// Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, 
// а также ошибочные числа пользователя.

public class Task31 {

	public static void main(String[] args) {
		int n;
		int x;
				
		int i = 0;
		
		while (i<5) {
			n = (int) (Math.random() * 15 + 1);
			x = (int) (Math.random() * 15 + 1);
			if (x == n) {
				System.out.println("Число угадано и равно " + n);
			} else {
				System.out.println("Загаданное число равно " + n);
				System.out.println("Число пользователя равно " + x);
				i++;
			}
		}

	}

}
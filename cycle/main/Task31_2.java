package by.jonline.mod01.cycle.main;
//Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать. 
//Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, 
//а также ошибочные числа пользователя.

public class Task31_2 {

	public static void main(String[] args) {
		// тут лучше массив, но еще не изучен
		int n1 = (int) (Math.random() * 15 + 1);
		int n2 = (int) (Math.random() * 15 + 1);
		int n3 = (int) (Math.random() * 15 + 1);
		int n4 = (int) (Math.random() * 15 + 1);
		int n5 = (int) (Math.random() * 15 + 1);
		
		int x;
				
		int i = 0;
		
		while (i<5) {
			x = (int) (Math.random() * 15 + 1);
			if ((x == n1)) {
				if (n1 == 0) {
					break;
				} else {
					System.out.println("Число угадано и равно " + x);
					n1 = 0;				
		     	} 
			}else if ((x == n2)) {
				if (n2 == 0) {
					break;
				} else {
					System.out.println("Число угадано и равно " + x);
					n2 = 0;				
		     	} 
			}else if ((x == n3)) {
				if (n3 == 0) {
					break;
				} else {
					System.out.println("Число угадано и равно " + x);
					n3 = 0;				
		     	} 
			}else if ((x == n4)) {
				if (n4 == 0) {
					break;
				} else {
					System.out.println("Число угадано и равно " + x);
					n4 = 0;				
		     	} 
			}else if ((x == n5)) {
				if (n5 == 0) {
					break;
				} else {
					System.out.println("Число угадано и равно " + x);
					n5 = 0;				
		     	} 
			}else {
				System.out.println("Ошибочное число пользователя равно " + x);
			}
						
			i++;
		}
		
		if (n1 != 0) {
			System.out.println("Неугаданное пользователем число равно " + n1);
		}
		if (n2 != 0) {
			System.out.println("Неугаданное пользователем число равно " + n2);
		}
		if (n3 != 0) {
			System.out.println("Неугаданное пользователем число равно " + n3);
		}
		if (n4 != 0) {
			System.out.println("Неугаданное пользователем число равно " + n4);
		}
		if (n5 != 0) {
			System.out.println("Неугаданное пользователем число равно " + n5);
		}
		

	}

}

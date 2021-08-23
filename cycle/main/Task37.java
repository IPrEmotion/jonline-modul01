package by.jonline.mod01.cycle.main;
// Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: 
// первое число получили путем написания сначала числа А, затем B. 
// Для получения второго числа сначала записали число B, затем А. 
// Найти числа А и В если известно, что первое четырехзначное число нацело делится на 99, а второе - на 49.

public class Task37 {

	public static void main(String[] args) {
		
		Integer A = 10;
		Integer B = 10;
		
		while (A < 100) {
			while (B < 100) {
				String str1 = A.toString() + B.toString();
				String str2 = B.toString() + A.toString();
				
				Integer number1 = Integer.parseInt(str1);
				Integer number2 = Integer.parseInt(str2);
				
				if ((number1 % 99) == 0 && (number2 % 49) == 0) {
					System.out.println("Первое число это " + A);
					System.out.println("Второе число это " + B);
				}
							
				B++;
			}
			
			B = 10;
			A++;
		}
		
		
		

	}

}

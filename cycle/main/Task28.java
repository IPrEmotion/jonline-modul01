package by.jonline.mod01.cycle.main;
// Написать программу, в которой вводятся два операнда Хи Yи знак операции (+,-,, *). 
// Вычислить результат Zв зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
//также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). 
// В качестве символа прекращения вычислений принять '0'.

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			int X;
			int Y;
			int Z;
			String znak;
			
			String str;

			int i = 2;
			while (true) {
				
				System.out.print(">> Введите два натуральных числа и знак операции (+, -, /, *) через пробел");
				while (sc.hasNextInt() == false) {
					str = sc.nextLine();
					System.out.print(">> Введите два натуральных числа и знак операции (+, -, /, *) через пробел");
				}
				
				X = sc.nextInt();
				Y = sc.nextInt();
				znak = sc.next();
											
				if ((znak.equals("+")) || (znak.equals("-")) || (znak.equals("/")) ||(znak.equals("*"))) {
					
						if (znak.equals("+")) {
							Z = X + Y;
							System.out.println("Результат " + X + " + " + Y + " = " + Z);
						}
						if (znak.equals("-")) {
							Z = X - Y;
							System.out.println("Результат " + X + " - " + Y + " = " + Z);
						}
						if (znak.equals("/")) {
							if (Y == 0) {
								System.out.println("Ошибка! Деление на ноль не возможно! Попробуйте еще раз.");
							}else {
								Z = X / Y;
								System.out.println("Результат " + X + " / " + Y + " = " + Z);
							}
							
						}
						if (znak.equals("*")) {
							Z = X * Y;
							System.out.println("Результат " + X + " * " + Y + " = " + Z);
						}
						if (znak.equals("0")) {
							Z = X * Y;
							System.out.println("Результат " + X + " * " + Y + " = " + Z);
						}
					}else {
						System.out.println("Не верно указан знак операции! Попробуйте еще раз.");	
						
				}
			}
			
			 			
		} finally {
			
			if (sc != null) {
				sc.close();
			}
		}
		

	}

}

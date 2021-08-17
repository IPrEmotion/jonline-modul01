package by.jonline.mod01.cycle.main;
// Проверить введенную пользователем строку на наличие недопустимых символов. 
// В качестве первого символа допустимы только буквы и знак подчеркивания. 
// Остальные символы могут быть буквами, цифрами и знаком подчеркивания.

import java.lang.*;

public class Task32 {

	public static void main(String[] args) {
		String str = "Hello";
		
		char n;
		boolean x = true;
		int i = 0;
		
		
		while (x) {
			n = str.charAt(i);
			if (i == 0) {
				if ((Character.isLetter(n)) || (n == '_')) {
					System.out.println("Первый символ в строке верный");
				
				} else {
					x = false;
					System.out.println("Недопустимый символ в начале строки " + n);
			    }
			} else {
				if ((Character.isLetterOrDigit(n)) || (n == '_')) {
					
				} else {
					x = false;
					System.out.println("Недопустимый символ в строке " + n);
					
				}
			}
			i++;
			
		}

	}

}

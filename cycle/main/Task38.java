package by.jonline.mod01.cycle.main;
// Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
// Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

public class Task38 {

	public static void main(String[] args) {
		Integer num = 123456;
		String str = num.toString();
		
								
		int len = str.length();
		int i = 0;
		int c = 0;
				
		char num1 = str.charAt(i);
		char num2 = str.charAt(i+1);
		
		
		if (num1 - num2 > 0) {
			c = num2 - num1;  
									
		} else {
			c = num2 - num1; 
			
		}
		
		
		while(i < (len - 1)) { 
			int n1 = str.charAt(i);
			int n2 = str.charAt(i+1);
			if ((n1 + c) != n2) {
				System.out.println("Цифры числа " + num + " не образуют арифметическую прогрессию.");
				break;
			}
			
			i++;
			
		}
		
		if (i == (len-1)) {
			System.out.println("Цифры числа " + num + " образуют арифметическую прогрессию.");
		}
		

	}

}

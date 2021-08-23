package by.jonline.mod01.cycle.main;
// Написать программу, переводящую римские цифры в арабские.

public class Task30 {

	public static void main(String[] args) {
		
		String a = "XXI";
		char n;
		int len = a.length();
		int i = 0;
		int sum = 0;
		int k = 0;
		int m = 0;
		
		while (i < len) {
			n = a.charAt(i);
			m = i+1;
			if (m < len) {
				k = a.charAt(m);
				if ((n == 'I')||(n == 'i')) {
					if (((k == 'V')||(k == 'v'))||((k == 'X')||(k == 'x'))) {
						sum-=1;	
					} else if (((k == 'L')||(k == 'l'))||((k == 'C')||(k == 'c'))||((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))) {
						System.out.println("Ошибка ввода");
						sum = 0;
						break;
						
					}else {
						sum+=1;	
					}
					
				}else if((n == 'V')||(n == 'v')) {
					if (((k == 'X')||(k == 'x'))||((k == 'L')||(k == 'l'))||((k == 'C')||(k == 'c'))||((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))) {
						System.out.println("Ошибка ввода");
						sum = 0;
						break;
					}else {
					sum+=5;
					}
				}else if((n == 'X')||(n == 'x')) {
					if (((k == 'L')||(k == 'l'))||((k == 'C')||(k == 'c'))) {
						sum-=10;
					} else if (((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))){
						System.out.println("Ошибка ввода");
						sum = 0;
						break;
					}else {
						sum+=10;
					}
				}else if((n == 'L')||(n == 'l'))  {
					if (((k == 'C')||(k == 'c'))||((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))) {
						System.out.println("Ошибка ввода");
						sum = 0;
						break;
					}else {
						sum+=50;
					}
					
				}else if((n == 'C')||(n == 'c')) {
					if (((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))) {
						sum-=100;
					}else {
						sum+=100;
					}
				}else if((n == 'D')||(n == 'd')) {
					if (((k == 'D')||(k == 'd'))||((k == 'M')||(k == 'm'))) {
						System.out.println("Ошибка ввода");
						sum = 0;
						break;
					}else {
						sum+=500;
					}
					
				}else if((n == 'M')||(n == 'm')) {
					
					sum+=1000;
				}
			} else {
				if ((n == 'I')||(n == 'i')) {
					sum+=1;
				}else if((n == 'V')||(n == 'v')) {
					sum+=5;
				}else if((n == 'X')||(n == 'x')) {
					sum+=10;
				}else if((n == 'L')||(n == 'l'))  {
					sum+=50;
				}else if((n == 'C')||(n == 'c')) {
					sum+=100;
				}else if((n == 'D')||(n == 'd')) {
					sum+=500;
				}else if((n == 'M')||(n == 'm')) {
					sum+=1000;
				}else {
					System.out.println("Ошибка ввода");
					sum = 0;
					break;
				}
			}
			
			i++;
		}
		
		System.out.println(sum);

	}

}

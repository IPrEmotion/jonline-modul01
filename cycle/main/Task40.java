package by.jonline.mod01.cycle.main;
// Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Task40 {

	public static void main(String[] args) {

		int N = 150;

		int i = 1;
		int k = 0;
		int s = 0;

		while (i < N) {
			String str = Integer.toString(i);
			
			int len = str.length();
			

			while (k < len) {
				char n = str.charAt(k);
				String nStr = Character.toString(n);
				int nInt = Integer.parseInt(nStr);
				
				if (nInt != 0 && i % nInt == 0) {
					s++;
					k++;
					
				}else {
					k = len;
					
				}
				
			}
			if (s == len) {
				System.out.println(i);
			}
			k = 0;
			s = 0;
			i++;
		}

	}

}

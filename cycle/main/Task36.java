package by.jonline.mod01.cycle.main;
// Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. 
// Найти эти числа.

public class Task36 {

	public static void main(String[] args) {
		Integer i = 10;
		Integer k = 10;
		
		Integer number;
						
				
		while (i < 100) {
			while (k < 100) {
				String str = i.toString() + k.toString();
				number = Integer.parseInt(str);
				if (number % (i * k) == 0) {
					
					System.out.println(number);
				}
				k++;
			}
			i++;
			k = 10;
		}

	}

}

package by.jonline.mod01.cycle.main;
// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

public class Task34 {

	public static void main(String[] args) {
		
		int i = 1000;
		int k;
		int n = 1;
		int sum = 0;
		int count = 0;
		
		System.out.println("Четырехзначные числа, сумма цифр каждого из которых равна 15:");
		
		while (i<=9999) {
			while (count < 4) {
				k = (i % (n * 10)) / n;
				sum+=k;
				count++;
				n*=10;
				
			}
						
			if (sum == 15) {
				System.out.println(i);
				
			}
			sum = 0;
			count = 0;
			n = 1;
			i++;
			
		}

	}

}

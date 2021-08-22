package by.jonline.mod01.linear.main;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

public class Task37 {

	public static void main(String[] args) {
		
		int N = 333;
	
		int N1 = N / 100;
		int N2 = (N % 100) / 10;
		int N3 = N % 10;
		
		int NN = N * N;
		int sum = N1 + N2 + N3;
		int sumСubed = sum * sum * sum;
		
		System.out.println(NN == sumСubed);

	}

}

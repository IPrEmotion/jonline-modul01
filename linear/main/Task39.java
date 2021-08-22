package by.jonline.mod01.linear.main;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

public class Task39 {

	public static void main(String[] args) {
		
		int N = 275;
		int N1 = N / 100;
		int N2 = (N % 100) / 10;
		int N3 = N % 10;
		
		int sum1 = N1 + N2;
		int sum2 = N1 + N3;
		int sum3 = N2 + N3;
		
		
		System.out.println((sum1 == N3) || (sum2 == N2) ||(sum3 == N1));

	}

}

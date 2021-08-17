package by.jonline.mod01.linear.main;
//—оставить линейную программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным, и false Ч в противном случае:
//—умма цифр данного трехзначного числа N €вл€етс€ четным числом.

public class Task35 {

	public static void main(String[] args) {
		
		int N = 651;
		int N1 = N / 100;
		int N2 = (N % 100) / 10;
		int N3 = N % 10;
		
		int sum = N1 + N2 + N3;
		int sumEven = sum % 2;
		
		System.out.println(sumEven == 0);
		
	}

}

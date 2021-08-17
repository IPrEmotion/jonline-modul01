package by.jonline.mod01.linear.main;
// —оставить линейную программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным, и false Ч в противном случае:
// ÷елое число N €вл€етс€ четным двузначным числом.

public class Task33 {

	public static void main(String[] args) {
		
		int N = -30;
		int modN = Math.abs(N);
		int even = N % 2;
		
		System.out.println(((9 < modN) && (modN < 100)) && (even == 0));
		
	}

}

package by.jonline.mod01.linear.main;
// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
// Целое число N является четным двузначным числом.

public class Task33 {

	public static void main(String[] args) {
		
		int N = -30;
		int modN = Math.abs(N);
		int even = N % 2;
		
		System.out.println(((9 < modN) && (modN < 100)) && (even == 0));
		
	}

}

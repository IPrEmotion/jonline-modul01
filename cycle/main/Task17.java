package by.jonline.mod01.cycle.main;
// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1).

public class Task17 {

	public static void main(String[] args) {
		double a = 2.0;
		int n = 5;
		int i = 0;
		double res = 1.0;
		double sum = 0.0;
		
		while (i < n) {
			sum = (a + i);
			res *= sum;
			i++;
		}
		
	System.out.println("Выражение a(a+1)...(a+n-1) при n = " + n + " равно " + res);
		

	}

}

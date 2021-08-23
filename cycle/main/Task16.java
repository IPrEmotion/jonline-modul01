package by.jonline.mod01.cycle.main;
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {

	public static void main(String[] args) {
		double x = 1.0;
		double res = 1.0;
		double sum = 0.0;
		
		while (x <=10) {
			sum +=x;
			res *=sum;
			x++;
		}
		
		System.out.println("Значение выражения (1+2)*(1+2+3)*...*(1+2+...+10) равно " + res);

	}

}

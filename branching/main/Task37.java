package by.jonline.mod01.branching.main;
// Вычислить значение функции: F(x)= {-х^2+3х+9, если х>=3 и 1/(х^3-6), если x<3}.

public class Task37 {

	public static void main(String[] args) {
		double x = 4.0;
		double res = 0.0;
		
		if (x >= 3) {
			res = -1 * Math.pow(x, 2) + (3 * x) + 9;
		} else {
			res = 1 / (Math.pow(x, 3) - 6);
		}
		
		System.out.println("F(x)=" + res);
		

	}

}
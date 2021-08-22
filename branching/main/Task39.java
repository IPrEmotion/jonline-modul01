package by.jonline.mod01.branching.main;
//Вычислить значение функции: F(x)= {-х^2+x-9, если х>=8 и 1/(х^4-6), если x<8}.
public class Task39 {

	public static void main(String[] args) {
		double x = 2.0;
		double res = 0.0;
		
		if (x >= 8) {
			res = -1 * Math.pow(x, 2) + x - 9;
		} else {
			res = 1 / (Math.pow(x, 4) - 6);
		}
		
		System.out.println("F(x)=" + res);

	}

}

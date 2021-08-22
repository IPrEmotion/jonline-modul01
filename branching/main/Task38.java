package by.jonline.mod01.branching.main;
// Вычислить значение функции: F(x)= {-х^2, если 0<=х<=3 и 4, если x>3 или x<0}.
public class Task38 {

	public static void main(String[] args) {
		double x = 2.0;
		double res = 0.0;
		
		if ((x >= 0) && (x <= 3)) {
			res = Math.pow(x, 2);
		} else {
			res = 4;
		}
		
		System.out.println("F(x)=" + res);

	}

}

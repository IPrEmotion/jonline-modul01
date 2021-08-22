package by.jonline.mod01.branching.main;
//Вычислить значение функции: F(x)= {-х^3+9, если х<=13 и -(3/(х+1)), если x>13}.

public class Task40 {

	public static void main(String[] args) {
		double x = 22.0;
		double res = 0.0;
		
		if (x >= 13) {
			res = -1 * Math.pow(x, 3) + 9;
		} else {
			res = -1 * (3 / (x + 1));
		}
		
		System.out.println("F(x)=" + res);

	}

}

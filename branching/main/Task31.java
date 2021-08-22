package by.jonline.mod01.branching.main;
// Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task31 {

	public static void main(String[] args) {
		double A = 20.0;
		double B = 10.0;
		
		double x = 10.0;
		double y = 11.0;
		double z = 15.0;
		
		if ((A > x || A > y || A > z) && (B > x || B > y || B > z)) {
			System.out.println("Кирпич с размерами: " + x + "x" + y + "x" + z +" пройдет в отверстие");
		} else {
			System.out.println("Кирпич с размерами: " + x + "x" + y + "x" + z +" не пройдет в отверстие");
		}

	}

}

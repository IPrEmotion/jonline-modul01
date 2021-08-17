package by.jonline.mod01.branching.main;
// Даны три точки А(x1, y1), B(x2, y2) и C(x3, y3). Определить, будут ли они расположены на одной прямой.

public class Task29 {

	public static void main(String[] args) {
		double x1 = 0;
		double x2 = 2.0;
		double x3 = 1.0;
				
		double y1 = 0;
		double y2 = 2.0;
		double y3 = 1.0;
				
		//(x - x_1) / (x_2 - x1) = (y - y_1) / (y_2 - y_1) - уравнение прямой для 2х точек
		
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Все три точки расположены на одной прямой");
		} else {
			System.out.println("Данные точки не принадлежат одной прямой");
		}

	}

}

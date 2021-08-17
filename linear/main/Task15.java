package by.jonline.mod01.linear.main;

// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class Task15 {

	public static void main(String[] args) {
		
		double side = 27.5;
		
		double square = Math.sqrt(3) / 4 * Math.pow(side, 2);
		double height = (2 * square) / side;
		
		double radiusС = side / Math.sqrt(3);
		double radiusI = radiusС * 0.5;
		
		System.out.println(square);
		System.out.println(height);
		System.out.println(radiusI);
		System.out.println(radiusС);


	}

}

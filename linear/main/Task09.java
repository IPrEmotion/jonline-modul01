package by.jonline.mod01.linear.main;

//Заданы координаты трех вершин треугольника (x1, y1), (x2, y2), (x3, y3). Найти его периметр и площадь.

public class Task09 {

	public static void main(String[] args) {
		
		double x1 = 2.0;
		double y1 = -4.5;
		double x2 = -5.5;
		double y2 = 0.6;
		double x3 = -7.0;
		double y3 = -3.5;
		
		double tempA = Math.pow((x2- x1), 2) + Math.pow((y2- y1), 2);			
		double modA = Math.sqrt(tempA);
		
		double tempB = Math.pow((x3- x1), 2) + Math.pow((y3- y1), 2);			
		double modB = Math.sqrt(tempB);
		
		double tempC = Math.pow((x3- x2), 2) + Math.pow((y3- y2), 2);			
		double modC = Math.sqrt(tempC);
		
		double p = x1 - x3;
		double q = x2 - x3;
		double r = y1 - y3;
		double s = y2 - y3;
		
			
		double perimeter = modA + modB + modC;
		double square = Math.abs((p * s) - (r * q)) / 2;
		
		System.out.println(perimeter);
		System.out.println(square);

	}

}

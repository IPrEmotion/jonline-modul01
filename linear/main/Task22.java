package by.jonline.mod01.linear.main;

// Ќайти площадь треугольника, стороны которого равны a и b, а угол между этими сторонами y.

public class Task22 {

	public static void main(String[] args) {
		
		double a = 3.0;
		double b = 4.0;
		double inDegrees = 60.0;
		
		double inRadians = Math.toRadians(inDegrees);
		
		double S = (a * b * Math.sin(inRadians)) / 2;
		
		System.out.println(S);

	}

}

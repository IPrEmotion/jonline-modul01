package by.jonline.mod01.linear.main;

//Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c.

public class Task25 {

	public static void main(String[] args) {
		double a = 12.5;
		double b = 5.0;
		double c = 8.5;
		
		double cosA = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
		double cosB = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		double cosC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
		
		double inRadiansA = Math.acos(cosA);
		double inRadiansB = Math.acos(cosB);
		double inRadiansC = Math.acos(cosC);
		
		double inDegreesA = inRadiansA * (180 / Math.PI);
		double inDegreesB = inRadiansB * (180 / Math.PI);
		double inDegreesC = inRadiansC * (180 / Math.PI);
		
		
		
		System.out.println("Угол А: " + inRadiansA + " радиан, " + inDegreesA + " градусов");
		System.out.println("Угол B: " + inRadiansB + " радиан, " + inDegreesB + " градусов");
		System.out.println("Угол C: " + inRadiansC + " радиан, " + inDegreesC + " градусов");
		
		}

}

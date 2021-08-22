package by.jonline.mod01.linear.main;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//График функции y = ax^2 + bx + с проходит через заданную точку с координатами (m, n).

public class Task41 {

	public static void main(String[] args) {
		double m = 1.0;
		double n = 44.0;
		
		double a = 12.0;
		double b = -3.0;
		double c = 35.0;
		
		double y = a * Math.pow(m, 2) + b * m + c;
		
		System.out.println(y == n);

	}

}

package by.jonline.mod01.linear.main;

//Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов.

public class Task07 {

	public static void main(String[] args) {
		double a = 15.0;
		double b = 4.0;
		double c;
		
		double temp = Math.pow(a, 2) + Math.pow(b, 2);
		
		c = Math.sqrt(temp);
		
		double perimeter = a + b + c;
		double square = (a * b) / 2;
		
		System.out.println(perimeter);
		System.out.println(square);
		

	}

}

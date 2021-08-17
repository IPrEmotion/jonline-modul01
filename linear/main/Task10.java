package by.jonline.mod01.linear.main;

// ¬ычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class Task10 {

	public static void main(String[] args) {
		
		double radius = 29.0;
			
		double perimeter = 2 * Math.PI * radius;
		double square = Math.PI * Math.pow(radius, 2);
		
		System.out.println(perimeter);
		System.out.println(square);


	}

}

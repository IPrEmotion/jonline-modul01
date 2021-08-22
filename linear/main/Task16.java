package by.jonline.mod01.linear.main;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task16 {

	public static void main(String[] args) {
		
		double circumference = 12.75;
		
		double square = Math.pow(circumference, 2) / (4 * Math.PI);
		
		System.out.println(square);

	}

}

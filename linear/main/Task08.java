package by.jonline.mod01.linear.main;

//Вычислить расстояние между двумя точками с данными координатами (x1, y1) и (x2, y2).

public class Task08 {

	public static void main(String[] args) {
		
		double x1 = 3.0;
		double y1 = -4.5;
		double x2 = 1.0;
		double y2 = 5.0;
		
		double tempX = x2 - x1;
		double tempY = y2 - y1;
		
		double temp = Math.pow(tempX, 2) + Math.pow(tempY, 2);
		double distance = Math.sqrt(temp);
		
		System.out.println(distance);
		
				

	}

}

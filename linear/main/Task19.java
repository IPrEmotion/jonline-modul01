package by.jonline.mod01.linear.main;

//Найти площадь кольца, внутренний радиус которого равен г, а внешний — R (R > r).

public class Task19 {

	public static void main(String[] args) {
		
		double R = 45.8;
		double r = 32.0;
		
		double ringArea = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		
		System.out.println(ringArea);
		

	}

}

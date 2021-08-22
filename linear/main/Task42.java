package by.jonline.mod01.linear.main;
// Для данных областей составить линейную программу, которая печатает truе, если точка с координатами (x, y)
//принадлежит закрашенной области, и false — в противном случае

public class Task42 {

	public static void main(String[] args) {
				
		double x = - 1.0;
		double y = 1.0;
		
		// a) уравнения прямых, ограничивающих область: y=0, y = x + 4, y = -x + 4
		
		System.out.println(y >= 0 && y + Math.abs(x) <= 4);
		
				
		// b) уравнения прямых, ограничивающих область: y = 0, x = -2, x = 2, y = 4; y = 0, x = -4, x = 4, y = -3; 
		
		
		System.out.println((y <= 4 && y >= 0 && x <= 2 && x >=-2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
		
		// c) уравнения прямых, ограничивающих область: y*y + x*x = 16, x = 0, y = 0; y*y + x*x = 25, x = 0, y = 0
		
		System.out.println((y * y + x * x <= 16 && x >= 0 && y >= 0) || (y * y + x * x <= 25 && x >= 0 && y <= 0));

	}

}

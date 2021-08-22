package by.jonline.mod01.linear.main;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Треугольник со сторонами a,b,c является равнобедренным.

public class Task38 {

	public static void main(String[] args) {
		double a = 10;
		double b = 10;
		double c = 12;
		
		System.out.println((a == b) || (a == c) || (b == c));
		 
	}

}

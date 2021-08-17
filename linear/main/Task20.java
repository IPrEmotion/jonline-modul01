package by.jonline.mod01.linear.main;

// Ќайти площадь равнобедренной трапеции с основани€ми a и b и углом альфа при большем основании a.

public class Task20 {

	public static void main(String[] args) {
		
		double a = 5.0;
		double b = 10.0;
		double alfa = 45.0;
		
		double S = ((Math.pow(b, 2) - Math.pow(a, 2)) * Math.tan(alfa)) / 4;
		
		System.out.println(S);
		
	}

}

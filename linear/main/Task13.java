package by.jonline.mod01.linear.main;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Task13 {

	public static void main(String[] args) {
		
		double a = 25.0;
		double b = -12.5;
		
		double res1 = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double res2 = (Math.abs(a) * Math.abs(b)) / 2;
		
		System.out.println(res1);
		System.out.println(res2);
		

	}

}

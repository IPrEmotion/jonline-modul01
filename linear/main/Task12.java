package by.jonline.mod01.linear.main;

//Найти произведение цифр заданного четырехзначного числа.

public class Task12 {

	public static void main(String[] args) {
		
		int number = 2345;
		
		int num1 = number / 1000;
		int num2 = (number % 1000) / 100;
		int num3 = (number % 100) / 10;
		int num4 = number % 10;
		
		int prod = num1 * num2 * num3 * num4;
		
		System.out.println(prod);
		
		
		

	}

}

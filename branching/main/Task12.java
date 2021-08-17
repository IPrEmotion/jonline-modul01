package by.jonline.mod01.branching.main;
// ƒаны три действительных числа. ¬озвести в квадрат те из них, значени€ которых неотрицательны, и в четвертую степень Ч отрицательные.

public class Task12 {

	public static void main(String[] args) {
		
		double num1 = 0.25;
		double num2 = -3.75;
		double num3 = -10.0;
		
		System.out.println("¬ходные значени€ чисел: " + num1 + ", " + num2 + ", " + num3);
		
		if (num1 >= 0) {
			num1 = num1 * num1;
		} else {
			num1 = Math.pow(num1, 4);
		}
		
		if (num2 >= 0) {
			num2 = num2 * num2;
		} else {
			num2 = Math.pow(num2, 4);
		}
		
		if (num3 >= 0) {
			num3 = num3 * num3;
		} else {
			num3 = Math.pow(num3, 4);
		}
		
		System.out.println("ѕосле возведени€ в степень: " + num1 + ", " + num2 + ", " + num3);

	}

}

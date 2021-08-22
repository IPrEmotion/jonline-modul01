package by.jonline.mod01.branching.main;
// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Task12 {

	public static void main(String[] args) {
		
		double num1 = 0.25;
		double num2 = -3.75;
		double num3 = -10.0;
		
		System.out.println("Входные значения чисел: " + num1 + ", " + num2 + ", " + num3);
		
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
		
		System.out.println("После возведения в степень: " + num1 + ", " + num2 + ", " + num3);

	}

}

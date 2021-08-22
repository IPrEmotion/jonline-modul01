package by.jonline.mod01.branching.main;
// Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 12.0;
		double num3 = - 100.0;
		double res;
		
		if ((num1 > num2) && (num1 > num3)) {
			if (num2 < num3) {
				res = num1 + num2;
				System.out.println("Наибольшее число из трех данных: " + num1 + ", наименьшее число:" + num2 + ". Сумма этих чисел: " + res);
			} else {
				res = num1 + num3;
				System.out.println("Наибольшее число из трех данных: " + num1 + ", наименьшее число: " + num3 + ". Сумма этих чисел: " + res);
			}
		} else if ((num2 > num1) && (num2 > num3)) {
			if (num1 < num3) {
				res = num2 + num1;
				System.out.println("Наибольшее число из трех данных: " + num2 + ", наименьшее число: " + num1 + ". Сумма этих чисел: " + res);
			} else {
				res = num2 + num3;
				System.out.println("Наибольшее число из трех данных: " + num2 + ", наименьшее число: " + num3 + ". Сумма этих чисел: " + res);
			}
		} else if ((num3 > num2) && (num3 > num1)) {
			if (num2 < num1) {
				res = num3 + num2;
				System.out.println("Наибольшее число из трех данных: " + num3 + ", наименьшее число: " + num2 + ". Сумма этих чисел: " + res);
			} else {
				res = num3 + num1;
				System.out.println("Наибольшее число из трех данных: " + num3 + ", наименьшее число:" + num1 + ". Сумма этих чисел: " + res);
			}
		} 
		

	}

}

package by.jonline.mod01.linear.main;
//Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
//сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.

public class Task43 {

	public static void main(String[] args) {
		
		double x = 2.0;
		
		double xx = x * x;
		
		double res = 2 * xx * (xx + 2) - x * (3 * xx + 5) + 6;
		
		System.out.println(res);	 

	}

}

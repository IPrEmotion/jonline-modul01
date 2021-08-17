package by.jonline.mod01.linear.main;
// ƒано действительное число х. Ќе пользу€сь никакими другими арифметическими операци€ми, кроме умножени€,
// сложени€ и вычитани€, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.

public class Task43 {

	public static void main(String[] args) {
		
		double x = 2.0;
		
		double xx = x * x;
		
		double res = 2 * xx * (xx + 2) - x * (3 * xx + 5) + 6;
		
		System.out.println(res);	 

	}

}

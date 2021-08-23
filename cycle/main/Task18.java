package by.jonline.mod01.cycle.main;
// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
// an = (-1)^(n-1) / n

public class Task18 {

	public static void main(String[] args) {
		double a;
		int n = 5;
		double e = 0.3;
		int i = 1;
		double sum = 0.0;
				
		while (i <= n) {
			a = (Math.pow(-1, i-1)) / i;
			
			if (Math.abs(a) >= e) {
				sum += a;
										
			}
			
			i++;
		}
		
	System.out.println("Cумма тех членов ряда, модуль которых больше или равен " + e + " равна " + sum);



	}

}

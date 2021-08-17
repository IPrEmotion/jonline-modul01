package by.jonline.mod01.cycle.main;
// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
// an = 1 / 2^n + 1 / 3^n

public class Task19 {

	public static void main(String[] args) {
		double a;
		int n = 5;
		double e = 0.1;
		int i = 1;
		double sum = 0.0;
				
		while (i <= n) {
			a = 1 / (Math.pow(2, i)) + (1 / Math.pow(3, i));
			
			if (Math.abs(a) >= e) {
				sum += a;
			}
			
			i++;
		}	
		
		System.out.println("Cумма тех членов ряда, модуль которых больше или равен " + e + " равна " + sum);
	
	}

}

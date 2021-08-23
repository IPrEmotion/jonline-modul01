package by.jonline.mod01.cycle.main;
// Вычислить : 1+2+4+8+...+ 2 в 10 степени

public class Task15 {

	public static void main(String[] args) {
		double x = 0;
		double res = 0.0;
		double temp = 0.0;
		
		while (x <=10) {
			temp = Math.pow(2,x);
			res +=temp;
			x++;
		}
		
		System.out.println("Значение выражения 1+2+4+8+...+ 2 в 10 степени равно " + res);
	

	}

}

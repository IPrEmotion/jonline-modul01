package by.jonline.mod01.branching.main;
// Даны действительные числа a,b,c. Удвоить эти числа, если a>b>с, и заменить их абсолютными значениями, если это не так.

public class Task30 {

	public static void main(String[] args) {
		double a = 10;
		double b = 2.0;
		double c = -1.0;
		
		System.out.println("Даны числа a = " + a + ", b = " + b + ", c = " + c);
		
		if ((a > b) && (b > c)) {
			a *= 2;
			b *= 2;
			c *= 2;
			System.out.println("Результат удвоения чисел: a = " + a + ", b = " + b + ", c = " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("Абсолютные значения чисел: a = " + a + ", b = " + b + ", c = " + c);
		}
		

	}

}

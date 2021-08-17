package by.jonline.mod01.branching.main;
//Даны три числа a, b, c. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d - a, d - b, d - с).

public class Task28 {

	public static void main(String[] args) {
		double a = 12.5;
		double b = 12.0;
		double c = - 100.0;
		double d = - 12.0;
		double temp;
		
		if (a == d) {
			System.out.println("Число равное d это a (" + a + ")");
		}
			
		if (b == d) {
			System.out.println("Число равное d это b (" + b + ")");
		}
				
		if (c == d) {
			System.out.println("Число равное d это c (" + c + ")");
		} 
		
		if ((a != d) && (b != d) && (c != d)) {
			if (((d - a) > (d - b)) && ((d - a) > (d - c))) {
				temp = d - a;
				System.out.println("max(d - a, d - b, d - с) это d - a равное " + temp);
			} else if (((d - b) > (d - a)) && ((d - b) > (d - c))) {
				temp = d - b;
				System.out.println("max(d - a, d - b, d - с) это d - b равное " + temp);
			} else {
				temp = d - c;
				System.out.println("max(d - a, d - b, d - с) это d - c равное " + temp);
			}
		}

	}

}

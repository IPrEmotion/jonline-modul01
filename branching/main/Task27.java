package by.jonline.mod01.branching.main;
// Найти mах{min(a, b), min{c, d)}

public class Task27 {

	public static void main(String[] args) {
		double a = - 10.5;
		double b = 12.0;
		double c = - 100.0;
		double d = 0.0;
		
		double min1;
		double min2;
		double max;
		
		if (a < b) {
			min1 = a;			
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;			
		} else {
			min2 = d;
		}
		
		if (min1 > min2) {
			max = min1;	
			System.out.println("mах{min(a,b), min{c,d)} равно " + max);
		} else {
			max = min2;	
			System.out.println("mах{min(a,b), min{c,d)} равно " + max);
		}

	}

}
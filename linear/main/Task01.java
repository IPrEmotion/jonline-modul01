package by.jonline.mod01.linear.main;
// z = ( (a – 3 ) * b / 2) + c.

public class Task01 {
	public static void main (String[] args) {
		double a;
		double b;
		double c;
		
		double z;
		
		a = 8.0;
		b = 4.2;
		c = 3.5;
		
		double temp;
		
		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		
		z = temp + c;
		
		System.out.println("( (a – 3 ) * b / 2) + c = " + z);
		
		
	}

}

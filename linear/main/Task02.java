package by.jonline.mod01.linear.main;

// ((b+sqrt(b^2+4ac))/2a)-a^3c+b^-2

public class Task02 {

	public static void main(String[] args) {
		double b;
		double a;
		double c;
		double result;
		
		b = 8.0;
		a = 2.0;
		c = 5.1;
		
		double temp;
		
		temp = Math.pow(b, 2);
		temp = temp + 4 * a * c;
		temp = Math.sqrt(temp);
		temp = b + temp;
		temp = temp / (2 * a);
		temp = temp - Math.pow(a, 3) * c;
		
		result = temp + Math.pow(b, -2);
		System.out.println("((b+sqrt(b^2+4ac))/2a)-a^3c+b^-2 = " + result);

	}

}

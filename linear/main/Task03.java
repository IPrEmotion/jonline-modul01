package by.jonline.mod01.linear.main;

// ((sin x + cos y)/(cos x - sin y)) * tg xy
public class Task03 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		x = 90.0;
		y = 45.0;
		
		double temp;
		
		temp = Math.sin(x) + Math.cos(y);
		temp = temp * Math.tan(x * y);
		z = temp / (Math.cos(x) - Math.sin(y));
		
		System.out.println("((sin x + cos y)/(cos x - sin y)) * tg xy = " + z);
		

	}

}

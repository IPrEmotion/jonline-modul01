package by.jonline.mod01.linear.main;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).

public class Task40 {

	public static void main(String[] args) {
		
		double N = 3125;
		double a = 5;
		double s = 5;
		
		double power = Math.pow(a, s);
		
		
		System.out.println(((s >= 0) && (s <= 4)) && (N == power));	
		
	}

}

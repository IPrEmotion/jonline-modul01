package by.jonline.mod01.branching.main;
// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.

public class Task32 {

	public static void main(String[] args) {
		double a = - 10.0;
		double b = - 11.0;
		double c =  15.0;
		
		double x = a + b;
		double y = a + c;
		double z = b + c;
		
		if (x > 0)
		{
			System.out.println("Сумма чисел a и b положительна и равна " + x);
		}
		
		if (y > 0)
		{
			System.out.println("Сумма чисел a и c положительна и равна " + y);
		}
		
		if (z > 0)
		{
			System.out.println("Сумма чисел b и c положительна и равна " + z);
		}
		
		if ((x < 0) && (y < 0) && (z < 0)) 
		{
			System.out.println("Среди данных чисел нет положительной суммы");
		}



	}

}

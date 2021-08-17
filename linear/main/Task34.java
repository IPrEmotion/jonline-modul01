package by.jonline.mod01.linear.main;
//—оставить линейную программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным, и false Ч в противном случае:
//—умма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

public class Task34 {

	public static void main(String[] args) {
		
				int M = 2314;
				int M1 = M / 1000;
				int M2 = (M % 1000) / 100;
				int M3 = (M % 100) / 10;
				int M4 = M % 10;
				
				int sum1 = M1 + M2;
				int sum2 = M3 + M4;
				
				
				System.out.println(sum1 == sum2);
				
	}

}

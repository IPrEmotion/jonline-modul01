package by.jonline.mod01.linear.main;

// Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task32 {

	public static void main(String[] args) {
		int num = 2541;
		
		int num1 = num / 1000; //2
		int num2 = (num % 1000) / 100; //5
		int num3 = (num % 100) / 10; //4
		int num4 = num % 10; //1
		
			
		double numOddMult = num1 * num3; // 8
		double numEvenMult = num2 * num4; // 5
		double res = numEvenMult / numOddMult; //5/8
		
		System.out.println(res);

	}

}

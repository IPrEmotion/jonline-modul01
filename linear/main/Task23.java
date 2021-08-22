package by.jonline.mod01.linear.main;

//Дано значение а. Не используя никаких функций и никаких операций, кроме умножения, получить значение a^8 за
//три операции и а^10 за четыре операции.

public class Task23 {

	public static void main(String[] args) {
		double a = 3.0;
		
		double inTwo = a * a;
		double inFour = inTwo * inTwo;
		double inEight = inFour * inFour;
		double inTen = inEight * inTwo;
		
		System.out.println(inEight);
		System.out.println(inTen);
		
	}

}

package by.jonline.mod01.linear.main;

// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

public class Task29 {

	public static void main(String[] args) {
		
		char b = '&';
		int num = (int)b;
		
		int numNext = num + 1;
		int numPrevious = num - 1;
		
		char bNext = (char)numNext;
		char bPrevious = (char)numPrevious;
		
		System.out.println("У символа " + b + " порядковый номер " + num);
		System.out.println("Следующий символ: " + bNext + " и его порядковый номер " + numNext);
		System.out.println("Предыдущий символ: " + bPrevious + " и его порядковый номер " + numPrevious);
	 

	}

}

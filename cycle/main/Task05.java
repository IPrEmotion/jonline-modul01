package by.jonline.mod01.cycle.main;
// С помощью оператора whіlе напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно

public class Task05 {

	public static void main(String[] args) {
		
		int i = 1;
		int res = 0;
		
		while(i < 100) {
			res += i;
			i += 2;
		}
		
		System.out.println("Сумма всех нечетных чисел в диапазоне от 1 до 99 включительно равна " + res);
		

	}

}

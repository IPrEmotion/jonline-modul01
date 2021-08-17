package by.jonline.mod01.cycle.main;
// Необходимо вывести на экран таблицу умножения на 3:

public class Task3 {

	public static void main(String[] args) {
		
		int i = 0;
		int res = 0;
		while (i < 10) {
			res = 3 * i;
			System.out.println("3 умножить на " + i + " равно " + res);
			i++;
		}

	}

}

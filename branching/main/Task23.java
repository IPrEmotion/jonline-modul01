package by.jonline.mod01.branching.main;

// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
// некорректные данные, то сообщить об этом.

public class Task23 {

	public static void main(String[] args) {

		int day = 31;
		int month = 4;

		if (month < 1 || month > 12) {
			System.out.println("Месяц введен некорректно");
		}

		if (day <= 0) {
			System.out.println("День введен не корректно");
		}

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			System.out.println("День введен не корректно");
		}
		
		if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			System.out.println("Дата введена не корректно");
		} 
		if (month == 2 && day > 29) {
			System.out.println("Дата введена не корректно");
		}
		
		
		System.out.println("Введенная дата: " + day + "." + month);
		}

		
	}
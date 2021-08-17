package by.jonline.mod01.branching.main;

// ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12). ≈сли введены
// некорректные данные, то сообщить об этом.

public class Task23 {

	public static void main(String[] args) {

		int day = 31;
		int month = 4;

		if (month < 1 || month > 12) {
			System.out.println("ћес€ц введен некорректно");
		}

		if (day <= 0) {
			System.out.println("ƒень введен не корректно");
		}

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			System.out.println("ƒень введен не корректно");
		}
		
		if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			System.out.println("ƒата введена не корректно");
		} 
		if (month == 2 && day > 29) {
			System.out.println("ƒата введена не корректно");
		}
		
		
		System.out.println("¬веденна€ дата: " + day + "." + month);
		}

		
	}

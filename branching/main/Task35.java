package by.jonline.mod01.branching.main;
// Вычислить число и месяц в невисокосном году по номеру дня.

public class Task35 {

	public static void main(String[] args) {
		int n = 124;
		
		String mounth = null;
		int day = 0;
		
		if ((n > 0) && (n <= 31)) {
			mounth = "Января";
			day = n;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 31) && (n <= 59)) {
			mounth = "Февраля";
			day = n - 31;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 59) && (n <= 90)) {
			mounth = "Марта";
			day = n - 59;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 90) && (n <= 120)) {
			mounth = "Апреля";
			day = n - 120;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 120) && (n <= 151)) {
			mounth = "Мая";
			day = n - 120;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 151) && (n <= 181)) {
			mounth = "Июня";
			day = n - 151;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 181) && (n <= 212)) {
			mounth = "Июля";
			day = n - 181;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 212) && (n <= 243)) {
			mounth = "Августа";
			day = n - 212;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 243) && (n <= 273)) {
			mounth = "Сентября";
			day = n - 243;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 273) && (n <= 304)) {
			mounth = "Октября";
			day = n - 273;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 304) && (n <= 334)) {
			mounth = "Ноября";
			day = n - 304;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else if ((n > 334) && (n <= 365)) {
			mounth = "Декабря";
			day = n - 334;
			System.out.println(n + " день в невисокосном году это " + day + " " + mounth);
		} else {
			System.out.println("Нет такого дня в году");
		}
		
		

	}

}

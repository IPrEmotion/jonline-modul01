package by.jonline.mod01.branching.main;
// Составить программу, определяющую результат гадания на ромашке — «любит— не любит», взяв за исходное
//данное количество лепестков п.

public class Task24 {

	public static void main(String[] args) {
		int n = 23;

		if (n <= 0) {
			System.out.println("Исходные данные не корректны");
		} else {
			if (n % 2 == 0) {
			    System.out.println("Не любит");
		    } else {
			    System.out.println("Любит");
		    }
		}

	}

}

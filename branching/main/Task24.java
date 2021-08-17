package by.jonline.mod01.branching.main;
// —оставить программу, определ€ющую результат гадани€ на ромашке Ч ЂлюбитЧ не любитї, вз€в за исходное
//данное количество лепестков п.

public class Task24 {

	public static void main(String[] args) {
		int n = 23;

		if (n <= 0) {
			System.out.println("»сходные данные не корректны");
		} else {
			if (n % 2 == 0) {
			    System.out.println("Ќе любит");
		    } else {
			    System.out.println("Ћюбит");
		    }
		}

	}

}

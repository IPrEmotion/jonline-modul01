package by.jonline.mod01.branching.main;
//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
//«Пожароопасная ситуация», если температура в комнате превысила 60° С.

public class Task25 {

	public static void main(String[] args) {
		double temp = 60.0;
		
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация, температура в помещении " + temp + "°C");
		} else {
			System.out.println("Пожароопасная ситуация не наблюдается, температура в помещении " + temp + "°C");
		}
		
	}

}

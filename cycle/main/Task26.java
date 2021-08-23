package by.jonline.mod01.cycle.main;
//Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).

public class Task26 {

	public static void main(String[] args) {
		int i = 0;
		char simbol = 0;
		
		while (i <= 255) {
			simbol = (char)i;
			System.out.println(simbol + " = " + i);
			i++;
					}
	

	}

}

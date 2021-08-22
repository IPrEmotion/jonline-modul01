package by.jonline.mod01.linear.main;

//Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное
//значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс.

public class Task18 {

	public static void main(String[] args) {
		
		double T = 12548.0;
		
		int HH = (int)T / 3600;
		int MM = (int)T % 3600 / 60;
		int SS = (int)T % 3600 % 60;
		
		System.out.println(HH + " ч " + MM + " м " + SS + " с");

	}

}

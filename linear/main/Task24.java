package by.jonline.mod01.linear.main;

// Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task24 {

	public static void main(String[] args) {
		double inRadians = 2.12;
		
		double inDegrees = inRadians * (180 / Math.PI);
		double inMinutes = (inDegrees - (int)inDegrees) * 60;
		double inSeconds = (inMinutes - (int)inMinutes) * 60;
		
		System.out.println((int)inDegrees + " градусов, " + (int)inMinutes + " минут, " + (int)inSeconds + " секунд");
	

	}

}

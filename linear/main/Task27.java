package by.jonline.mod01.linear.main;

//Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
//течения реки V1 км/ч, время движения по озеру t1 ч., а против течения реки — t2 ч.

public class Task27 {

	public static void main(String[] args) {
		double boatVelocity = 12.0;
		double riverVelocity = 7.0;
		double timeOnTheLake = 2.5;
		double timeOnTheRiver = 3.0;
		
		double lakeDistance = boatVelocity * timeOnTheLake;
		
		double riverDistance = (boatVelocity - riverVelocity) * timeOnTheRiver;
		
		double distanse = lakeDistance + riverDistance;
		
		System.out.println(distanse);
		

	}

}

package by.jonline.mod01.linear.main;

// —оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость в сто€чей воде v км/ч, скорость
// течени€ реки V1 км/ч, врем€ движени€ по озеру t1 ч., а против течени€ реки Ч t2 ч.

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

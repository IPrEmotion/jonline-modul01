package by.jonline.mod01.branching.main;
// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в у - меньшее.

public class Task22 {

	public static void main(String[] args) {
		double x = 0.4;
		double y = 1.2;
		double temp;
		
		System.out.println("Начальные значения: x равно " + x + "; y равно " + y);
		
		if (x < y ) {
			temp = x;
			x = y;
			y = temp;
			
		}
		
		System.out.println("Теперь большее значение находится в x: " + x + "; а меньшее - в y: " + y);

	}

}

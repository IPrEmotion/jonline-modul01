package by.jonline.mod01.cycle.main;
// ��������� ������� �������� ������� y = 5 - �^2/2 �� ������� [-5; 5] � ����� 0.5.

public class Task13 {

	public static void main(String[] args) {
		double x = -5.5;
		double y;
		double temp;
		
		
		while (x < 5) {
			temp = (x * x) / 2;
			y = 5 - temp;
			x += 0.5;
			System.out.println("��� � = " + x + ", � = " + y);
		}
			
		

	}

}

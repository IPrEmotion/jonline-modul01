package by.jonline.mod01.cycle.main;
// ��������� �������� ������� �� ������� [a,b] � ����� h: y = {x, x>2 � -x, x<=2}

public class Task7 {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 50.5;
		
		double h = 5.0;
		double y;
		
		double i = a;
		
		while (i <= b) {
			if (i > 2) {
				y = i;
			}else {
				y = -1 * i;
			}
			System.out.println("��� � = " + i + " ������� y ����� " + y);
			i += h;
		}	
		

	}

}

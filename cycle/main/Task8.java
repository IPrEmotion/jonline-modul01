package by.jonline.mod01.cycle.main;
// ��������� �������� ������� �� ������� [a,b] � ����� h: y = {(x + c)*2, x=15 � (x - c)+6, x!=15}
public class Task8 {

	public static void main(String[] args) {
		double a = 10.0;
		double b = 30.0;
		double c = 2.0;
		
		double h = 5.0;
		double y;
		
		double i = a;
		
		while (i <= b) {
			if (i == 15) {
				y = (i + c) * 2;
			}else {
				y = (i - c) + 6;
			}
			System.out.println("��� � = " + i + " ������� y ����� " + y);
			i += h;
		}	
		

	}

}

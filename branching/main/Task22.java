package by.jonline.mod01.branching.main;
// ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � � - �������.

public class Task22 {

	public static void main(String[] args) {
		double x = 0.4;
		double y = 1.2;
		double temp;
		
		System.out.println("��������� ��������: x ����� " + x + "; y ����� " + y);
		
		if (x < y ) {
			temp = x;
			x = y;
			y = temp;
			
		}
		
		System.out.println("������ ������� �������� ��������� � x: " + x + "; � ������� - � y: " + y);

	}

}

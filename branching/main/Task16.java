package by.jonline.mod01.branching.main;
//  �� ��������� XOY ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).

public class Task16 {

	public static void main(String[] args) {
		double x = -3.0;
		double y = 0;
		
		if ((x > 0) && (y > 0)) {
			System.out.println("����� � ������������ x = " + x + ", y = " + y + " ����������� 1�� ������������� ����.");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("����� � ������������ x = " + x + ", y = " + y + " ����������� 2�� ������������� ����.");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("����� � ������������ x = " + x + ", y = " + y + " ����������� 3�� ������������� ����.");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("����� � ������������ x = " + x + ", y = " + y + " ����������� 4�� ������������� ����.");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("����� ��������� �� ��� Y");
		}else if ((y == 0) && (x != 0)) {
			System.out.println("����� ��������� �� ��� X");
		} else if ((y == 0) && (x == 0)) {
			System.out.println("����� ��������� � ������ ���������.");
		}
		
	}

}

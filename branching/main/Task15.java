package by.jonline.mod01.branching.main;
// ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.

public class Task15 {

	public static void main(String[] args) {
		double x = -2.5;
		double y = -2.5;
		boolean equal = x != y;
		System.out.println("������� �������� x = " + x + ", y = " + y);
		
		if (equal) {
			if (x < y) {
				double sum = (x + y) / 2;
				x = sum;
				double mult = (x * y) * 2;
				y = mult;
				System.out.println("����� �������� x = " + x + ", y = " + y);
			}else {
				double sum2 = (x + y) / 2;
				y = sum2;
				double mult2 = (x * y) * 2;
				x = mult2;
				System.out.println("����� �������� x = " + x + ", y = " + y);
			}
		}else {
			System.out.println("x ����� �");
		}

	}

}

package by.jonline.mod01.branching.main;
//���� ��� ����� �(x1, y1) � B(x2, y2). ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������.

public class Task13 {

	public static void main(String[] args) {
		double x1 = -2.0;
		double y1 = 2.5;
		double x2 = 0.5;
		double y2 = -1.5;
		
		double d1 = Math.sqrt(x1 * x1 + y1 * y1);
		double d2 = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (d1 < d2) {
			System.out.println("� ������ ��������� ����� ����� � ������������� x1:" + x1 + ", y1:" + y1);
		}else {
			System.out.println("� ������ ��������� ����� ����� � ������������� x2:" + x2 + ", y2:" + y2);
		}
		

	}

}

package by.jonline.mod01.branching.main;
// ���� ��� ����� �(x1, y1), B(x2, y2) � C(x3, y3). ����������, ����� �� ��� ����������� �� ����� ������.

public class Task29 {

	public static void main(String[] args) {
		double x1 = 0;
		double x2 = 2.0;
		double x3 = 1.0;
				
		double y1 = 0;
		double y2 = 2.0;
		double y3 = 1.0;
				
		//(x - x_1) / (x_2 - x1) = (y - y_1) / (y_2 - y_1) - ��������� ������ ��� 2� �����
		
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("��� ��� ����� ����������� �� ����� ������");
		} else {
			System.out.println("������ ����� �� ����������� ����� ������");
		}

	}

}

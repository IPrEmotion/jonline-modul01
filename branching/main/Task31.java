package by.jonline.mod01.branching.main;
// ������ ������� A, B �������������� ��������� � ������� x, y, z �������. ����������, ������� �� ������ ����� ���������.

public class Task31 {

	public static void main(String[] args) {
		double A = 20.0;
		double B = 10.0;
		
		double x = 10.0;
		double y = 11.0;
		double z = 15.0;
		
		if ((A > x || A > y || A > z) && (B > x || B > y || B > z)) {
			System.out.println("������ � ���������: " + x + "x" + y + "x" + z +" ������� � ���������");
		} else {
			System.out.println("������ � ���������: " + x + "x" + y + "x" + z +" �� ������� � ���������");
		}

	}

}

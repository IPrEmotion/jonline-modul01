package by.jonline.mod01.linear.main;
// ���� �������������� ����� �. �� ��������� �������� ������� ��������������� ����������, ����� ���������,
// �������� � ���������, ��������� �� ����������� ����� ��������: 2x4 - 3�3 + 4�2 - 5� + 6.

public class Task43 {

	public static void main(String[] args) {
		
		double x = 2.0;
		
		double xx = x * x;
		
		double res = 2 * xx * (xx + 2) - x * (3 * xx + 5) + 6;
		
		System.out.println(res);	 

	}

}

package by.jonline.mod01.branching.main;
// ��������� ���������, ����������� ������ ���������� ���������� � ������� ��������. ���������
// ����������� ��������� ����, ����� �����, ��������� �����������; ���� ����� �� ���������, �������� �� ������
// ��������; ���� ����� ������� ������, ��� ����������, �� �������� ��������� ����� � ��������� ����� �����; ����
// ����� ������������, �� �������� ��������� �� ���� � ��������� ������ ����������� �����.

public class Task34 {

	public static void main(String[] args) {
		double cost = 25.03;
		double pay = 25.05;
		
		if (cost == pay) {
			System.out.println("�������!");
		}
		
		if (pay > cost) {
			double total = pay - cost;
			String result = String.format("%.2f",total);
			System.out.println("�������! ���� ����� " + result);
		}
		
		if (pay < cost) {
			double total = cost - pay;
			String result = String.format("%.2f",total);
			System.out.println("������������� ����� � ������. ��������� ��� " + result);
		}
	

	}

}

package by.jonline.mod01.linear.main;

// ���� ����������� ����� T, ������� ������������ ������������ ���������� ������� � ��������. ������� ������
// �������� ������������ � �����, ������� � �������� � ��������� �����: HH� MM��� SS�.

public class Task18 {

	public static void main(String[] args) {
		
		double T = 12548.0;
		
		int HH = (int)T / 3600;
		int MM = (int)T % 3600 / 60;
		int SS = (int)T % 3600 % 60;
		
		System.out.println(HH + "� " + MM + "� " + SS + "�");

	}

}

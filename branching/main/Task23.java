package by.jonline.mod01.branching.main;

// ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� �������
// ������������ ������, �� �������� �� ����.

public class Task23 {

	public static void main(String[] args) {

		int day = 31;
		int month = 4;

		if (month < 1 || month > 12) {
			System.out.println("����� ������ �����������");
		}

		if (day <= 0) {
			System.out.println("���� ������ �� ���������");
		}

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			System.out.println("���� ������ �� ���������");
		}
		
		if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			System.out.println("���� ������� �� ���������");
		} 
		if (month == 2 && day > 29) {
			System.out.println("���� ������� �� ���������");
		}
		
		
		System.out.println("��������� ����: " + day + "." + month);
		}

		
	}

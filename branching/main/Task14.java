package by.jonline.mod01.branching.main;
// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
public class Task14 {

	public static void main(String[] args) {
		int a = 20;
		int b = 80;
		int c = 180 - (a + b);
		
		if ((a + b) < 180) {
			System.out.println("����������� � ������ a = " + a + " �������� � b = " + b + " �������� ����������.");
			if((a == 90) || (b == 90) || (c == 90)) {
				System.out.println("� ���� ����������� �������������.");
			} else {
				System.out.println("�� ���� ����������� �� �������������.");
			}
		}else {
			System.out.println("������������ � ������ a = " + a + " �������� � b = " + b + " �������� �� ����������.");
		}

	}

}

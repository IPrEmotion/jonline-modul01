package by.jonline.mod01.cycle.main;
// ��������� ���������� ���� ����� � ��������� �� 1 �� 15 ������������. ������� �������� �� �������. 
// ��������� ������ �������� ��������� � ����������� ����� �� ���, ��� ������������� ���������, 
// � ����� ��������� ����� ������������.

public class Task31 {

	public static void main(String[] args) {
		int n;
		int x;
				
		int i = 0;
		
		while (i<5) {
			n = (int) (Math.random() * 15 + 1);
			x = (int) (Math.random() * 15 + 1);
			if (x == n) {
				System.out.println("����� ������� � ����� " + n);
			} else {
				System.out.println("���������� ����� ����� " + n);
				System.out.println("����� ������������ ����� " + x);
				i++;
			}
		}

	}

}

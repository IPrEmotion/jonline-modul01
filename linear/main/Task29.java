package by.jonline.mod01.linear.main;

// ������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ���������� � ����������� �������.

public class Task29 {

	public static void main(String[] args) {
		
		char b = '&';
		int num = (int)b;
		
		int numNext = num + 1;
		int numPrevious = num - 1;
		
		char bNext = (char)numNext;
		char bPrevious = (char)numPrevious;
		
		System.out.println("� ������� " + b + " ���������� ����� " + num);
		System.out.println("��������� ������: " + bNext + " � ��� ���������� ����� " + numNext);
		System.out.println("���������� ������: " + bPrevious + " � ��� ���������� ����� " + numPrevious);
	 

	}

}

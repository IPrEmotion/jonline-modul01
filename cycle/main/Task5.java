package by.jonline.mod01.cycle.main;
// � ������� ��������� wh�l� �������� ��������� ����������� ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������

public class Task5 {

	public static void main(String[] args) {
		
		int i = 1;
		int res = 0;
		
		while(i < 100) {
			res += i;
			i += 2;
		}
		
		System.out.println("����� ���� �������� ����� � ��������� �� 1 �� 99 ������������ ����� " + res);
		

	}

}

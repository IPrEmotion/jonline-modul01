package by.jonline.mod01.cycle.main;
// �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������. ������������� ��� � ������ �����, 
// ����� �������� ����� ��������� � �������� ������� �� ��������� � ��������� ������.

public class Task24 {

	public static void main(String[] args) {
		int n = 12367;
		int part = 0;
		int sum = 0;
		int revers = 0;
		
		int i = 1;
		while ((n / i) >= 1) {
			part = n % (i * 10) / i;
			
			if ((part % 2) == 0) {
				sum += part;
			}
			
			revers = revers * 10 + part;
									
			i*=10;		
		
		}
		
		System.out.println("����� ������ ����� ����� " + n + " ����� " + sum);
		System.out.println("��������������� �����: " + revers);
		

	}

}

package by.jonline.mod01.cycle.main;
// ���� ��� ���������� ����� � � �. �� ���� ����� ��������� 2 �������������� �����: 
// ������ ����� �������� ����� ��������� ������� ����� �, ����� B. 
// ��� ��������� ������� ����� ������� �������� ����� B, ����� �. 
// ����� ����� � � � ���� ��������, ��� ������ �������������� ����� ������ ������� �� 99, � ������ - �� 49.

public class Task37 {

	public static void main(String[] args) {
		
		Integer A = 10;
		Integer B = 10;
		
		while (A < 100) {
			while (B < 100) {
				String str1 = A.toString() + B.toString();
				String str2 = B.toString() + A.toString();
				
				Integer number1 = Integer.parseInt(str1);
				Integer number2 = Integer.parseInt(str2);
				
				if ((number1 % 99) == 0 && (number2 % 49) == 0) {
					System.out.println("������ ����� ��� " + A);
					System.out.println("������ ����� ��� " + B);
				}
							
				B++;
			}
			
			B = 10;
			A++;
		}
		
		
		

	}

}

package by.jonline.mod01.cycle.main;
//��������� ���������� ���� ����� � ��������� �� 1 �� 15 ������������. ������� �������� �� �������. 
//��������� ������ �������� ��������� � ����������� ����� �� ���, ��� ������������� ���������, 
//� ����� ��������� ����� ������������.

public class Task31_2 {

	public static void main(String[] args) {
		// ��� ����� ������, �� ��� �� ������
		int n1 = (int) (Math.random() * 15 + 1);
		int n2 = (int) (Math.random() * 15 + 1);
		int n3 = (int) (Math.random() * 15 + 1);
		int n4 = (int) (Math.random() * 15 + 1);
		int n5 = (int) (Math.random() * 15 + 1);
		
		int x;
				
		int i = 0;
		
		while (i<5) {
			x = (int) (Math.random() * 15 + 1);
			if ((x == n1)) {
				if (n1 == 0) {
					break;
				} else {
					System.out.println("����� ������� � ����� " + x);
					n1 = 0;				
		     	} 
			}else if ((x == n2)) {
				if (n2 == 0) {
					break;
				} else {
					System.out.println("����� ������� � ����� " + x);
					n2 = 0;				
		     	} 
			}else if ((x == n3)) {
				if (n3 == 0) {
					break;
				} else {
					System.out.println("����� ������� � ����� " + x);
					n3 = 0;				
		     	} 
			}else if ((x == n4)) {
				if (n4 == 0) {
					break;
				} else {
					System.out.println("����� ������� � ����� " + x);
					n4 = 0;				
		     	} 
			}else if ((x == n5)) {
				if (n5 == 0) {
					break;
				} else {
					System.out.println("����� ������� � ����� " + x);
					n5 = 0;				
		     	} 
			}else {
				System.out.println("��������� ����� ������������ ����� " + x);
			}
						
			i++;
		}
		
		if (n1 != 0) {
			System.out.println("����������� ������������� ����� ����� " + n1);
		}
		if (n2 != 0) {
			System.out.println("����������� ������������� ����� ����� " + n2);
		}
		if (n3 != 0) {
			System.out.println("����������� ������������� ����� ����� " + n3);
		}
		if (n4 != 0) {
			System.out.println("����������� ������������� ����� ����� " + n4);
		}
		if (n5 != 0) {
			System.out.println("����������� ������������� ����� ����� " + n5);
		}
		

	}

}

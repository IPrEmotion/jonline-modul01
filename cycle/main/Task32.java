package by.jonline.mod01.cycle.main;
// ��������� ��������� ������������� ������ �� ������� ������������ ��������. 
// � �������� ������� ������� ��������� ������ ����� � ���� �������������. 
// ��������� ������� ����� ���� �������, ������� � ������ �������������.

import java.lang.*;

public class Task32 {

	public static void main(String[] args) {
		String str = "Hello";
		
		char n;
		boolean x = true;
		int i = 0;
		
		
		while (x) {
			n = str.charAt(i);
			if (i == 0) {
				if ((Character.isLetter(n)) || (n == '_')) {
					System.out.println("������ ������ � ������ ������");
				
				} else {
					x = false;
					System.out.println("������������ ������ � ������ ������ " + n);
			    }
			} else {
				if ((Character.isLetterOrDigit(n)) || (n == '_')) {
					
				} else {
					x = false;
					System.out.println("������������ ������ � ������ " + n);
					
				}
			}
			i++;
			
		}

	}

}

package by.jonline.mod01.cycle.main;
// �������� ���������, � ������� �������� ��� �������� �� Y� ���� �������� (+,-,, *). 
// ��������� ��������� Z� ����������� �� �����. ������������� ������� �� ��������� �������� ���� ��������, �
//����� �� ���� Y=0 ��� �������. ������������ ����������� ������������ ���������� ��� ������������ ��������� (�.�. ��������� ����). 
// � �������� ������� ����������� ���������� ������� '0'.

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			int X;
			int Y;
			int Z;
			String znak;
			
			String str;

			int i = 2;
			while (true) {
				
				System.out.print(">> ������� ��� ����������� ����� � ���� �������� (+, -, /, *) ����� ������");
				while (sc.hasNextInt() == false) {
					str = sc.nextLine();
					System.out.print(">> ������� ��� ����������� ����� � ���� �������� (+, -, /, *) ����� ������");
				}
				
				X = sc.nextInt();
				Y = sc.nextInt();
				znak = sc.next();
											
				if ((znak.equals("+")) || (znak.equals("-")) || (znak.equals("/")) ||(znak.equals("*"))) {
					
						if (znak.equals("+")) {
							Z = X + Y;
							System.out.println("��������� " + X + " + " + Y + " = " + Z);
						}
						if (znak.equals("-")) {
							Z = X - Y;
							System.out.println("��������� " + X + " - " + Y + " = " + Z);
						}
						if (znak.equals("/")) {
							if (Y == 0) {
								System.out.println("������! ������� �� ���� �� ��������! ���������� ��� ���.");
							}else {
								Z = X / Y;
								System.out.println("��������� " + X + " / " + Y + " = " + Z);
							}
							
						}
						if (znak.equals("*")) {
							Z = X * Y;
							System.out.println("��������� " + X + " * " + Y + " = " + Z);
						}
						if (znak.equals("0")) {
							Z = X * Y;
							System.out.println("��������� " + X + " * " + Y + " = " + Z);
						}
					}else {
						System.out.println("�� ����� ������ ���� ��������! ���������� ��� ���.");	
						
				}
			}
			
			 			
		} finally {
			
			if (sc != null) {
				sc.close();
			}
		}
		

	}

}

package by.jonline.mod01.cycle.main;
// ��� ������� ������������ ����� � ���������� �� m �� � ������� ��� ��������, ����� ������� � ������ �����. m � � �������� � ����������.
import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			int m;
			int n;
			
			String str;

			int i = 2;
			System.out.print(">> ������� ��� ����������� ����� ����� ������");
			while (sc.hasNextInt() == false) {
				str = sc.nextLine();
				System.out.print(">> ������� ��� ����������� ����� ����� ������");
			}
			
			m = sc.nextInt();
			n = sc.nextInt();
			 if (m < n) {
				 
				 while (m <= n) {
						System.out.println("�������� ��� ����� " + m + " : ");
						while (i < m) {
							
							if (m % i == 0) {
								System.out.println(i);
							}
							i++;

						}
						i = 2;
						m++;
					}
				 
			 } else {
				 while (n <= m) {
						System.out.println("�������� ��� ����� " + n + " : ");
						while (i < n) {
							
							if (n % i == 0) {
								System.out.println(i);
							}
							i++;

						}
						i = 2;
						n++;
					}
			 }

			
			
		} finally {
			
			if (sc != null) {
				sc.close();
			}
		}
		
		

	}

}

package by.jonline.mod01.cycle.main;
import java.util.Scanner;
// �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int x;
			String str;
			System.out.println("������� ����� ������������� ����� >> ");
			while (sc.hasNextInt() == false) {
				str = sc.nextLine();
				System.out.println("������� ����� ������������� ����� >> ");
			}
			x = sc.nextInt();
			System.out.println("��������� ����� = " + x);
			
			int i = 1;
			int res = 0;
			while (i < (x + 1)) {
				res += i;
				i++;
			}
			
			System.out.println("����� ���� ����� �� 1 �� " + x + " ����� " + res);
			
		} finally {
			if (sc !=null) {
				sc.close();
			}
		}
		

	}

}

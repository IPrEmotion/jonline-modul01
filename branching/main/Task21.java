package by.jonline.mod01.branching.main;
// ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� M�. �

// ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�.

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String answer;

			System.out.println("��� ��: ������� ��� �������? ����� � ��� �.");
			System.out.println(">> ");

			answer = sc.next();

			if (answer.equals("�")) {
				System.out.println("��� �������� �������!");
			} else if (answer.equals("�")) {
				System.out.println("��� �������� ��������!");
			} else {
				System.out.println("�� ���������� ����.");
			}

		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}

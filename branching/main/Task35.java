package by.jonline.mod01.branching.main;
// ��������� ����� � ����� � ������������ ���� �� ������ ���.

public class Task35 {

	public static void main(String[] args) {
		int n = 124;
		
		String mounth = null;
		int day = 0;
		
		if ((n > 0) && (n <= 31)) {
			mounth = "������";
			day = n;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 31) && (n <= 59)) {
			mounth = "�������";
			day = n - 31;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 59) && (n <= 90)) {
			mounth = "�����";
			day = n - 59;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 90) && (n <= 120)) {
			mounth = "������";
			day = n - 120;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 120) && (n <= 151)) {
			mounth = "���";
			day = n - 120;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 151) && (n <= 181)) {
			mounth = "����";
			day = n - 151;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 181) && (n <= 212)) {
			mounth = "����";
			day = n - 181;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 212) && (n <= 243)) {
			mounth = "�������";
			day = n - 212;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 243) && (n <= 273)) {
			mounth = "��������";
			day = n - 243;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 273) && (n <= 304)) {
			mounth = "�������";
			day = n - 273;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 304) && (n <= 334)) {
			mounth = "������";
			day = n - 304;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else if ((n > 334) && (n <= 365)) {
			mounth = "�������";
			day = n - 334;
			System.out.println(n + " ���� � ������������ ���� ��� " + day + " " + mounth);
		} else {
			System.out.println("��� ������ ��� � ����");
		}
		
		

	}

}

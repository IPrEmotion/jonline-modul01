package by.jonline.mod01.cycle.main;
// ��������� ���������� ��������� �����, ������� ���� ������������.

public class Task25 {

	public static void main(String[] args) {
		int n = 0;
		int f = 1;
		int temp = 0;
		int i = 0;
		
		while (i < n) {
			temp = n-i;
			f *= temp;
			System.out.println(f);
			i++;
		}
		
		System.out.println("��������� ����� " + n + " ����� " + f);

	}

}

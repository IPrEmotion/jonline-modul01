package by.jonline.mod01.cycle.main;
// ��������� ��������� ���������� ������������ ��������� ������ ������� �����.

public class Task10 {

	public static void main(String[] args) {
		int i = 0;
		double res = 1.0;
		double num = 0.01;
		
		while (i <= 200) {
			res *= num * num;
			num += 0.01;
			i++;
		}
		
		System.out.println("������������ ��������� ������ ������� ����� ����� " + res);

	}

}

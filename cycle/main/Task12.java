package by.jonline.mod01.cycle.main;
// ������������������ An �������� ���: A1 = 1, An=6+An-1 , ��� ������� n>1. 
// ��������� ��������� ���������� ������������ ������ 10 ������ ���� ������������������.

public class Task12 {

	public static void main(String[] args) {
		int i = 0;
		double A = 1.0;
		int res = 1;
				
		while (i < 10) {
			res *= A;
			A += 6.0;
			i++;
		}
		System.out.println("������������ ������ 10 ������ ������������������ �n ����� " + res);

	}

}

package by.jonline.mod01.cycle.main;
// ���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1).

public class Task17 {

	public static void main(String[] args) {
		double a = 2.0;
		int n = 5;
		int i = 0;
		double res = 1.0;
		double sum = 0.0;
		
		while (i < n) {
			sum = (a + i);
			res *= sum;
			i++;
		}
		
	System.out.println("��������� a(a+1)...(a+n-1) ��� n = " + n + " ����� " + res);
		

	}

}

package by.jonline.mod01.branching.main;
// ���� �������������� ����� a,b,c. ������� ��� �����, ���� a>b>�, � �������� �� ����������� ����������, ���� ��� �� ���.

public class Task30 {

	public static void main(String[] args) {
		double a = 10;
		double b = 2.0;
		double c = -1.0;
		
		System.out.println("���� ����� a = " + a + ", b = " + b + ", c = " + c);
		
		if ((a > b) && (b > c)) {
			a *= 2;
			b *= 2;
			c *= 2;
			System.out.println("��������� �������� �����: a = " + a + ", b = " + b + ", c = " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("���������� �������� �����: a = " + a + ", b = " + b + ", c = " + c);
		}
		

	}

}

package by.jonline.mod01.branching.main;
// ��������� ��������� ���������� ������ ��������� a*x*x+b*x+c ��� �������� ��������� a, b, c � �.

public class Task7 {

	public static void main(String[] args) {
		double a = 2.0;
		double b = -30.0;
		double c = 12.0;
		double x = 2.0;
		
		double res = a * x * x + b * x + c;
		
		if (res < 0) {
			res = res * -1;
		}
		
		System.out.println(res);

	}

}

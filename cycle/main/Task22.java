package by.jonline.mod01.cycle.main;
//��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [a, b] � ����� h. 
//��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������, ������ - ��������������� �������� �������: F(x) = sin^2(x)

public class Task22 {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 10.0;
		double fun;
		double h = 2.5;
		
		while (a <= b) {
			fun = Math.pow(Math.sin(a), 2);
			System.out.println("��� x = " + a + "  ��������� F(x) = " + fun);
			a += h;
			
		}
		

	}

}

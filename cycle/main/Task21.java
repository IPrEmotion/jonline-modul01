package by.jonline.mod01.cycle.main;
// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [a, b] � ����� h. 
// ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������, ������ - ��������������� �������� �������: F(x) = x�sin(x)

public class Task21 {

	public static void main(String[] args) {
		double a = -1.0;
		double b = 5.0;
		double fun;
		double h = 1.5;
		
		while (a <= b) {
			fun = a - Math.sin(a);
			System.out.println("��� x = " + a + "  ��������� F(x) = " + fun);
			a += h;
			
		}
		

	}

}

package by.jonline.mod01.linear.main;
// ��� ������ �������� ��������� �������� ���������, ������� �������� tru�, ���� ����� � ������������ (x, y)
//����������� ����������� �������, � false � � ��������� ������

public class Task42 {

	public static void main(String[] args) {
				
		double x = - 1.0;
		double y = 1.0;
		
		// a) ��������� ������, �������������� �������: y=0, y = x + 4, y = -x + 4
		
		System.out.println(y >= 0 && y + Math.abs(x) <= 4);
		
				
		// b) ��������� ������, �������������� �������: y = 0, x = -2, x = 2, y = 4; y = 0, x = -4, x = 4, y = -3; 
		
		
		System.out.println((y <= 4 && y >= 0 && x <= 2 && x >=-2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
		
		// c) ��������� ������, �������������� �������: y*y + x*x = 16, x = 0, y = 0; y*y + x*x = 25, x = 0, y = 0
		
		System.out.println((y * y + x * x <= 16 && x >= 0 && y >= 0) || (y * y + x * x <= 25 && x >= 0 && y <= 0));

	}

}

package by.jonline.mod01.branching.main;
// �������� ���������, ������� �� �������� ���� ������ ����������, �������� �� ����� �����-���� ���� �� ��� �������������.

public class Task32 {

	public static void main(String[] args) {
		double a = - 10.0;
		double b = - 11.0;
		double c =  15.0;
		
		double x = a + b;
		double y = a + c;
		double z = b + c;
		
		if (x > 0)
		{
			System.out.println("����� ����� a � b ������������ � ����� " + x);
		}
		
		if (y > 0)
		{
			System.out.println("����� ����� a � c ������������ � ����� " + y);
		}
		
		if (z > 0)
		{
			System.out.println("����� ����� b � c ������������ � ����� " + z);
		}
		
		if ((x < 0) && (y < 0) && (z < 0)) 
		{
			System.out.println("����� ������ ����� ��� ������������� �����");
		}



	}

}

package by.jonline.mod01.linear.main;

// ���� �������� �. �� ��������� ������� ������� � ������� ��������, ����� ���������, �������� �������� a^8 ��
// ��� �������� � �^10 �� ������ ��������.

public class Task23 {

	public static void main(String[] args) {
		double a = 3.0;
		
		double inTwo = a * a;
		double inFour = inTwo * inTwo;
		double inEight = inFour * inFour;
		double inTen = inEight * inTwo;
		
		System.out.println(inEight);
		System.out.println(inTen);
		
	}

}

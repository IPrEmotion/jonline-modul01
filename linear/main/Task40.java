package by.jonline.mod01.linear.main;
//��������� �������� ���������, ���������� �������� true, ���� ��������� ������������ �������� ��������, � false � � ��������� ������:
//�������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4).

public class Task40 {

	public static void main(String[] args) {
		
		double N = 3125;
		double a = 5;
		double s = 5;
		
		double power = Math.pow(a, s);
		
		
		System.out.println(((s >= 0) && (s <= 4)) && (N == power));	
		
	}

}

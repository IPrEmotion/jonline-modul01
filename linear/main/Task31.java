package by.jonline.mod01.linear.main;

// ���� ����������� ����� � � N. ������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N.

public class Task31 {

	public static void main(String[] args) {
		double M = 113;
		double N = 3;
		
		double div = M / N;
		
		int junior = (int) (div % 10);
		int senior = (int) ((div * 10) % 10);
		
		System.out.println("��������� �������: " + div + ", ������� ����� ����� ����� - " + junior + ", ������� ����� ������� ����� - " + senior);	

	}

}

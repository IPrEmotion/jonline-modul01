package by.jonline.mod01.linear.main;
//��������� �������� ���������, ���������� �������� true, ���� ��������� ������������ �������� ��������, � false � � ��������� ������:
//������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.

public class Task37 {

	public static void main(String[] args) {
		
		int N = 333;
	
		int N1 = N / 100;
		int N2 = (N % 100) / 10;
		int N3 = N % 10;
		
		int NN = N * N;
		int sum = N1 + N2 + N3;
		int sum�ubed = sum * sum * sum;
		
		System.out.println(NN == sum�ubed);

	}

}

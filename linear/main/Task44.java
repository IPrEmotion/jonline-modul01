package by.jonline.mod01.linear.main;
// ���� �������� �. �������� ��������  -2� + 3�2 - 4�3  � 1 + 2� + 3�2 + 4�3 . ������������ �� �������� ��������.
public class Task44 {

	public static void main(String[] args) {
		double x = 1.0;
		double xx = x * x;
		
		double temp = 2 * x * (1 + 2 * xx);
		double temp2 = 3 * xx;
		
		double res1 = -temp + temp2;
		double res2 = 1 + temp + temp2;
		
		System.out.println(res1);
		System.out.println(res2);
		 

	}

}

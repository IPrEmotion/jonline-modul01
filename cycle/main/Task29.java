package by.jonline.mod01.cycle.main;
// ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.

public class Task29 {

	public static void main(String[] args) {
		int a = 0;
		int b = 57;
		int n;
		
		int i = 1;
		int k = 1;
		System.out.println("� ������ ������� ����� ������ ��������� ����� (� �����): ");
		if (a == 0) {
			System.out.println("0");
		}
		while ((a / i) >= 1) {
			n = a % (i * 10) / i;
			System.out.println(n);
											
			i*=10;		
		
		}
		
		System.out.println("� ������ ������� ����� ������ ��������� ����� (� �����): ");
		if (b == 0) {
			System.out.println("0");
		}
		while ((b / k) >= 1) {
			n = b % (k * 10) / k;
			System.out.println(n);
											
			k*=10;		
		
		}

	}

}

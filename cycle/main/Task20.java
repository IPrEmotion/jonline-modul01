package by.jonline.mod01.cycle.main;
//���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
// an = 1 / (3n-2)(3n+1)

public class Task20 {

	public static void main(String[] args) {
		double a;
		int n = 5;
		double e = 0.1;
		int i = 1;
		double sum = 0.0;
				
		while (i <= n) {
			a = 1.0 / ((3 * i - 2) * (3 * i + 1));
			System.out.println(a);
			if (Math.abs(a) >= e) {
				sum += a;
			}
			
			i++;
		}	
		
		System.out.println("C���� ��� ������ ����, ������ ������� ������ ��� ����� " + e + " ����� " + sum);
	
	}

}

package by.jonline.mod01.cycle.main;
// ������� ���������� ������ ���� ������� ������������ �����

public class Task35 {

	public static void main(String[] args) {
		int n = 888;
		int k;
		int i = 1;
		int sum = 0;
		
		while (n/i > 1) {
			k = (n % (i*10)) / i;
			if ((k % 2) == 0) {
				sum++;
			}
			i*=10;
			
		}
		
		System.out.println("� ����� " + n + " ������ ���� " + sum);

	}

}

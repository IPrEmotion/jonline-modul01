package by.jonline.mod01.cycle.main;
// ���� ����������� �. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

public class Task14 {

	public static void main(String[] args) {
		
		int n = 3;
		double res = 0.0;;
		double temp;
		double count = 1.0;
		
		while (count <= n) {
			temp = 1 / count;
			res += temp;
			count++;
									
		}
		
		System.out.println("��� n = " + n + " ��������� 1 + 1/2 + 1/3 + 1/4 + ... + 1/n ����� " + res);
		

	}

}

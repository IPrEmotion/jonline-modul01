package by.jonline.mod01.branching.main;
// ���� ����� ����� m, �. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������, ������ ��������
// �� ��������, � ���� �����, �� �������� ����� ������.

public class Task17 {

	public static void main(String[] args) {
		double m = 20.5;
		double n = 20.5;
		
		System.out.println("������� ��������: m = " + m + ", n = " + n);
		
		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("����� ��������: m = " + m + ", n = " + n);
			} else {
				m = n;
				System.out.println("����� ��������: m = " + m + ", n = " + n);
			}
		}else {
			m = 0;
			n = 0;
			System.out.println("����� ��������: m = " + m + ", n = " + n);
		}

	}

}

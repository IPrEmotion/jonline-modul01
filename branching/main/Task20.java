package by.jonline.mod01.branching.main;
// ����������, ��������� ����� ����� a, b, c �������� ����� k.

public class Task20 {

	public static void main(String[] args) {
		double a = -2.0;
		double b = 22.0;
		double c = -12.0;
		double k = 4.5;
		
		if ((a % k) == 0) {
			System.out.println("����� " + k + " �������� ��������� ��� ����� a");
		} else {
			System.out.println("����� " + k + " �� �������� ��������� ��� ����� a");
		}
		
		if ((b % k) == 0) {
			System.out.println("����� " + k + " �������� ��������� ��� ����� b");
		}else {
			System.out.println("����� " + k + " �� �������� ��������� ��� ����� b");
		}
		
		if ((c % k) == 0) {
			System.out.println("����� " + k + " �������� ��������� ��� ����� c");
		}else {
			System.out.println("����� " + k + " �� �������� ��������� ��� ����� c");
		}
		

	}

}

package by.jonline.mod01.linear.main;

// ��� ������������� R1, R2, � R3 ��������� �����������. ������� ������������� ����������.

public class Task26 {

	public static void main(String[] args) {
		
		double R1 = 1.5;
		double R2 = 5.0;
		double R3 = 0.75;
		
		double totalR = (R1 * R2 * R3) / (R1 * R2 + R1 * R3 + R2 * R3);
		
		System.out.println(totalR);

	}

}

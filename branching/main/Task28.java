package by.jonline.mod01.branching.main;
//���� ��� ����� a, b, c. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, �� ����� max(d - a, d - b, d - �).

public class Task28 {

	public static void main(String[] args) {
		double a = 12.5;
		double b = 12.0;
		double c = - 100.0;
		double d = - 12.0;
		double temp;
		
		if (a == d) {
			System.out.println("����� ������ d ��� a (" + a + ")");
		}
			
		if (b == d) {
			System.out.println("����� ������ d ��� b (" + b + ")");
		}
				
		if (c == d) {
			System.out.println("����� ������ d ��� c (" + c + ")");
		} 
		
		if ((a != d) && (b != d) && (c != d)) {
			if (((d - a) > (d - b)) && ((d - a) > (d - c))) {
				temp = d - a;
				System.out.println("max(d - a, d - b, d - �) ��� d - a ������ " + temp);
			} else if (((d - b) > (d - a)) && ((d - b) > (d - c))) {
				temp = d - b;
				System.out.println("max(d - a, d - b, d - �) ��� d - b ������ " + temp);
			} else {
				temp = d - c;
				System.out.println("max(d - a, d - b, d - �) ��� d - c ������ " + temp);
			}
		}

	}

}

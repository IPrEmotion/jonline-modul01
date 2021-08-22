package by.jonline.mod01.branching.main;
// Даны целые числа m, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
// из исходных, а если равны, то заменить числа нулями.

public class Task17 {

	public static void main(String[] args) {
		double m = 20.5;
		double n = 20.5;
		
		System.out.println("Входные значения: m = " + m + ", n = " + n);
		
		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("Новые значения: m = " + m + ", n = " + n);
			} else {
				m = n;
				System.out.println("Новые значения: m = " + m + ", n = " + n);
			}
		}else {
			m = 0;
			n = 0;
			System.out.println("Новые значения: m = " + m + ", n = " + n);
		}

	}

}
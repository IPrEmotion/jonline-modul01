package by.jonline.mod01.cycle.main;
// � ����������� ����� ���������� ������� �����. 

// ����� ���������� ����� �������� �� 7, �� �������� �������� �����. ����� ��� �����.

public class Task39 {

	public static void main(String[] args) {

		Integer number = 100;

		while (number < 1000) {
			String str = number.toString();
			
			char n2 = str.charAt(1);
			char n3 = str.charAt(2);
				
			String newStr = Character.toString(n2) + Character.toString(n3);
			int newNumber = Integer.parseInt(newStr);				

			if ((newNumber * 7) == number) {
				System.out.println("������� ����� ����� " + number);
			}

			number++;

		}

	}

}

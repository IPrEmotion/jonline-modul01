package by.jonline.mod01.linear.main;

// ������� ��������� ����������� �����: m � (0 <= m <= 23), n ��� (0 <= n <= 59), k � (0 <= k <= 59). ����� ����� ����� ����������
//���� ����� p � q ��� r �?

public class Task28 {
	public static void main(String[] args) {
		
		int hCurrent = 15;
		int mCurrent = 54;
		int sCurrent = 37;
		
		int hIncrease = 10;
		int mIncrease = 12;
		int sIncrease = 5;
		
		int s = (sCurrent + sIncrease) % 60;
		int m = ((mCurrent + mIncrease) + ((sCurrent + sIncrease) / 60)) % 60;
		int h = ((hCurrent + hIncrease) + (((mCurrent + mIncrease) + ((sCurrent + sIncrease) / 60)) / 60)) % 24;
						
		System.out.println(h + " : " + m + " : " + s);
	}

}

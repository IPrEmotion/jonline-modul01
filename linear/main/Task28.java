package by.jonline.mod01.linear.main;

//Текущее показание электронных часов: m ч (0 <= m <= 23), n мин (0 <= n <= 59), k с (0 <= k <= 59). Какое время будут показывать
//часы через p ч q мин r с?

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

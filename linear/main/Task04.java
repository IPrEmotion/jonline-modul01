package by.jonline.mod01.linear.main;
// � n ����� ������� - 80 �. ������. ������� ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 �. ������ ������, ��� � �����?

public class Task04 {
	
	public static void main(String[] args) {
		
		double n_pc = 8.0;
		double n_totalVol = 80.0;
		double n_volInOne = n_totalVol / n_pc;
		
		double m_pc = 12.0;
		double m_volInOne = n_volInOne + 12.0;
		double m_totalVol = m_pc * m_volInOne;
		
		System.out.println(m_totalVol);
	}

}

package by.jonline.mod01.linear.main;

// ���� �������� �, ���������� ����� ���������� � ������. ��������� � � ����� ������� ������� ��������� ����������.

public class Task30 {

	public static void main(String[] args) {
		 long A = 123456789125L;
		 
		 double AinKb = A / 1024;
		 double AinMb = AinKb / 1024;
		 double AinGb = AinMb / 1024;
		 double AinTb = AinGb / 1024;
		 double AinPb = AinTb / 1024;
		 double AinEb = AinPb / 1024;
		 
		 System.out.println(A + " ���� - ���: " + AinKb + " ��������, " + AinMb + " ��������, " + AinGb + " ��������, " + AinTb + " ��������, " + AinPb + " ��������, " + AinEb + " ��������.");

	}

}

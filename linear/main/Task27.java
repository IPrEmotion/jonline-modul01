package by.jonline.mod01.linear.main;

// ��������� ��������� ��� ���������� ����, ����������� ������, ���� �� �������� � ������� ���� v ��/�, ��������
// ������� ���� V1 ��/�, ����� �������� �� ����� t1 �., � ������ ������� ���� � t2 �.

public class Task27 {

	public static void main(String[] args) {
		double boatVelocity = 12.0;
		double riverVelocity = 7.0;
		double timeOnTheLake = 2.5;
		double timeOnTheRiver = 3.0;
		
		double lakeDistance = boatVelocity * timeOnTheLake;
		
		double riverDistance = (boatVelocity - riverVelocity) * timeOnTheRiver;
		
		double distanse = lakeDistance + riverDistance;
		
		System.out.println(distanse);
		

	}

}

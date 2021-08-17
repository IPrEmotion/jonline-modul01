package by.jonline.mod01.branching.main;
//Даны две точки А(x1, y1) и B(x2, y2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {

	public static void main(String[] args) {
		double x1 = -2.0;
		double y1 = 2.5;
		double x2 = 0.5;
		double y2 = -1.5;
		
		double d1 = Math.sqrt(x1 * x1 + y1 * y1);
		double d2 = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (d1 < d2) {
			System.out.println("К началу координат ближе точка с коородинатами x1:" + x1 + ", y1:" + y1);
		}else {
			System.out.println("К началу координат ближе точка с коородинатами x2:" + x2 + ", y2:" + y2);
		}
		

	}

}

package by.jonline.mod01.branching.main;
//  На плоскости XOY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {

	public static void main(String[] args) {
		double x = -3.0;
		double y = 0;
		
		if ((x > 0) && (y > 0)) {
			System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит 1му координатному углу.");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит 2му координатному углу.");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит 3му координатному углу.");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит 4му координатному углу.");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("Точка находится на оси Y");
		}else if ((y == 0) && (x != 0)) {
			System.out.println("Точка находится на оси X");
		} else if ((y == 0) && (x == 0)) {
			System.out.println("Точка находится в начале координат.");
		}
		
	}

}
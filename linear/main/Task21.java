package by.jonline.mod01.linear.main;

// Вычислить корни квадратного уравнения ах2+ bx + c = 0 с заданными коэффициентами a, b и с (предполагается,
// что a != 0) и что дискриминант уравнения неотрицателен).

public class Task21 {

	public static void main(String[] args) {
		double a = 3.0;
		double b = 13.0;
		double c = -10.0;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (- b + Math.sqrt(D)) / 2 * a;
		double x2 = (- b - Math.sqrt(D)) / 2 * a;
		
		System.out.println(x1);
		System.out.println(x2);
			
	}

}

package by.jonline.mod01.linear.main;

// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и обьем этого куба.

public class Task14 {

	public static void main(String[] args) {
		
		double cubeEdge = 8.0;
		
		double faceArea = Math.pow(cubeEdge, 2);
		
		double totalSurfaceArea = 6 * faceArea;
		
		double cubeVolume = Math.pow(cubeEdge, 3);
		
		System.out.println(faceArea);
		System.out.println(totalSurfaceArea);
		System.out.println(cubeVolume);
	

	}

}

package by.jonline.mod01.linear.main;

//Дано действительное число R вида пnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task17 {

	public static void main(String[] args) {
		
		double R = 123.875;
		
		double ddd = (R * 1000) % 1000;
		double nnn = (int)R / 1000.0;
		
		double res = ddd + nnn;
		
		System.out.println(res);

	}

}

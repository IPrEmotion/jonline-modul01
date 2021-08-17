package by.jonline.mod01.branching.main;
// Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
// запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
// «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
// денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

public class Task34 {

	public static void main(String[] args) {
		double cost = 25.03;
		double pay = 25.05;
		
		if (cost == pay) {
			System.out.println("Спасибо!");
		}
		
		if (pay > cost) {
			double total = pay - cost;
			String result = String.format("%.2f",total);
			System.out.println("Спасибо! Ваша сдача " + result);
		}
		
		if (pay < cost) {
			double total = cost - pay;
			String result = String.format("%.2f",total);
			System.out.println("Недостаточная сумма к оплате. Доплатите еще " + result);
		}
	

	}

}

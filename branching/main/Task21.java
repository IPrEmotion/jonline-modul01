package by.jonline.mod01.branching.main;
// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или M». В

// зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String answer;

			System.out.println("Кто ты: мальчик или девочка? Введи Д или М.");
			System.out.println(">> ");

			answer = sc.next();

			if (answer.equals("Д")) {
				System.out.println("Мне нравятся девочки!");
			} else if (answer.equals("М")) {
				System.out.println("Мне нравятся мальчики!");
			} else {
				System.out.println("Не корректный ввод.");
			}

		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		System.out.println("""
				please choice:
				1: Rock
				2: Scissors
				3: Paper""");
		// 用户输入:
		int choice = new Scanner(System.in).nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) (Math.random() * 3);
		// 输出信息
		System.out.printf("你出了%s,计算机出了%s,", printChoice(choice), printChoice(random));
		// （计算机-用户+3）%3
		// 0平手 1赢 2输
		System.out.print(switch ((3 + random - choice) % 3) {
		case 0 -> "平手";
		case 1 -> "你赢了";
		case 2 -> "你输了";
		default -> "";
		});
	}

	static String printChoice(int choice) {
		return choice == 1 ? "石头" : (choice == 2 ? "剪刀" : "布");
	}
}

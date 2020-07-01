package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("请输入上次的考试成绩");
		Scanner input =new Scanner(System.in);
		int prev =input.nextInt();
		System.out.println("请输入本次的考试成绩");
		int score = input.nextInt();
		double percent = 1.0*score/prev-1;
		System.out.printf("成绩提高了%f%%",percent*100);
	}

}

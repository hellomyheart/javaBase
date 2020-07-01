package com.itranswarp.learnjava;

import java.util.Arrays;

/**
 * 降序排序
 */
public class Main {
	public static void main(String[] args) {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// 排序前:
		System.out.println(Arrays.toString(ns));
		// TODO:
		for(int i=0;i<ns.length-1;i++) {
			for(int j=0;j<ns.length-1-i;j++) {
				if(ns[j]<ns[j+1])
				{
					ns[j]+=ns[j+1];
					ns[j+1]=ns[j]-ns[j+1];
					ns[j]-=ns[j+1];
				}
			}
		}
		// 排序后:
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}

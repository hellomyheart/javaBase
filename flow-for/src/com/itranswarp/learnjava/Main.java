package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
        //运行时间可能有点长，但PI更加精确。
		for (double i=1;i<=2000000000;i++) {
            pi+=Math.pow(-1,i+1)/(2*i-1);
        }
        System.out.println(4*pi);
	}

}

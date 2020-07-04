package com.itranswarp.learnjava;

import java.util.StringJoiner;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}

	static String buildSelectSql(String table, String[] fields) {
//		var s = " " + String.join(", ", fields) + " ";
		// 内容，开头，结尾，使用String.join也行 
		var sj = new StringJoiner(", ", " ", " "); 
		for (String field : fields) {
			sj.add(field);
		}

		String result = "SELECT" + sj.toString() + "FROM " + table;
		return result;
	}

}

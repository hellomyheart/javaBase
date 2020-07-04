package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		String[] temps = new String[fields.length];
		for (int i = 0; i < temps.length; i++)
			temps[i] = "?";
		StringBuilder s = new StringBuilder(1000);
		s.append("INSERT INTO ")
		 .append(table)
		 .append(" (")
		 .append(String.join(", ", fields))
		 .append(") VALUES (")
		 .append(String.join(", ", temps))
		 .append(")");
		return s.toString();
	}

}
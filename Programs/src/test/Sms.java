package test;

import java.util.Scanner;

public class Sms {
	public static void main(String x[]) {

		String str = "where are yougoing you";
		String str1 = "you are owsome today boyyour nameare sowhere";
		convert(str);
		convert(str1);

	}

	static void convert(String str) {
		str = str.replaceAll("you", "u");
		str = str.replaceAll("where", "whr");
		str = str.replaceAll("are", "r");
		System.out.println("Sms String:" + str);
	}

}

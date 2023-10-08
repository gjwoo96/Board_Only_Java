package main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class testmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String info = sc.nextLine();
		//문자만 허용
		//String express = "^[\\w]*$";
		String express = "^\\d{4}-\\d{2}-\\d{2}$";
		if(Pattern.matches(express, info)) {
			System.out.println("체크");
		}else {
			System.out.println("체크아웃");
		}
		
	}

}

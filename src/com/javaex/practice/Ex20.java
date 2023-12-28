package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String alphabet = sc.nextLine();
		
		if(alphabet.equals("a")||alphabet.equals("e")||alphabet.equals("i")||alphabet.equals("o")||alphabet.equals("u")||alphabet.equals("y")) {
			System.out.println("모음입니다.");
		}else {
			System.out.println("자음입니다.");
		}
		
		
		
		
		sc.close();

	}

}

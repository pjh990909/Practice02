package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int cm = sc.nextInt();
		
		System.out.print("몸무게: ");
		int kg =sc.nextInt();
		double standard = (cm-100)*0.9;
		
		if(standard == kg) {
			System.out.println("표준입니다.");
		}else if(standard < kg) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("저체중입니다.");
		}
		System.out.println("표준체중: " + standard);
		
		sc.close();
		

	}

}

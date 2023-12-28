package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.println("올해: 2023");
		System.out.println("태어난 해: " + year);
		System.out.println("나이: " + (2023-year));
		System.out.println("=============================");
		
		if(2023-year<20) {
			System.out.println("20살미만 건강검진대상이 아님");
		}else if(year%2==0) {
			System.out.println("20살이상");
			System.out.println("건강검진해 아님");
		}else if(year%2==1&&2023-year>=40) {
			System.out.println("20살이상");
			System.out.println("건강검진해");
			System.out.println("암 검사");
		}else {
			System.out.println("20살이상");
			System.out.println("건강검진해");
			System.out.println("암 검사x");
		}
		
		
		
		
		sc.close();

	}

}

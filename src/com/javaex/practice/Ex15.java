package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호:");
		String sign = sc.nextLine();
		
		System.out.print("숫자1: ");
		double num01 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num02 = sc.nextDouble();
		
		switch (sign) {
        case "+":
            System.out.println("결과는: " + (num01 + num02));
            break;
        case "-":
            System.out.println("결과는: " + (num01 - num02));
            break;
        case "/":
            if (num02 == 0) {
                System.out.println("계산할 수 없습니다.");
            } else {
                System.out.println("결과는: " + (num01 / num02));
            }
            break;
        case "*":
            System.out.println("결과는: " + (num01*num02));
            break;
        default:
            System.out.println("올바른 기호를 입력하세요.");
    }
		
		
		
		sc.close();

	}

}

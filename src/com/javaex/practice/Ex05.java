package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int age; //나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이를 입력받는다.
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//그룹을 분리한다.
		if(age>20) { //20살 초과
			System.out.println("\"1번그룸\"");
		}else { //20살 이하
			System.out.println("\'2번그룹\'");
		}
		
		sc.close();
		
		/*              예상      답
		(1)15일 때 결과 '2번그룹'    2
        (2)19일 때 결과 '2번그룹'    2
        (3)20일 때 결과 '2번그룹'    2
        (4)21일 때 결과 "1번그룹"    1
        (5)100일 때 결과 "1번그룹"   1
		*/
		
		
		
		

	}

}

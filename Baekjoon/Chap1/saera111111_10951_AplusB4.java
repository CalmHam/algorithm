package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.util.Scanner;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-01
 * Comment : 이 문제는 EOF를 다루는 문제이다.   
 * */

public class saera111111_10951_AplusB4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		String result = "";
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			result += a + b + "\n";
		}
		
		System.out.println(result);
	}

}

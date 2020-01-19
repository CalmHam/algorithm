package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.util.Scanner;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-01
 * Comment : 이 문제는 EOF를 다루는 문제이다.   
 * */

public class saera111111_10952_AplusB5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = "";
		
		while(a != 0 && b != 0) {
			result += a + b + "\n";
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		System.out.println(result);
	}

}

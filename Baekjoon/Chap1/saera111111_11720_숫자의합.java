package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.util.Scanner;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-12
 * Comment : 자료형 크기 고려해야하는 문제 + 왜 입력방법에 따라 안되는거지     
 * */

public class saera111111_11720_숫자의합 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		
		int result = 0;
		for(int i = 0; i<input.length();i++) {
			result += input.charAt(i) - '0';
		}
//		for (int i = 0; i < N; i++) {
//			result += System.in.read() - '0';
//		}

		System.out.println(result);
	}

}

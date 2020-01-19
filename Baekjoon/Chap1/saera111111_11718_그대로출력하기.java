package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.util.Scanner;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-12
 * Comment : 자료형 크기 고려해야하는 문제 + 왜 입력방법에 따라 안되는거지     
 * */

public class saera111111_11718_그대로출력하기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String result = "";

		while(sc.hasNextLine()) {
			result += sc.nextLine();
			result += "\n";
		}
		
		System.out.println(result);
	}

}

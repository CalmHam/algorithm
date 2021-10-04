package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-12
 * Comment : 이 문제는 EOF를 다루는 문제이다.   
 * */

public class saera111111_11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		
		for(int i = 0; i < input.length(); i = i + 10) {
			if (i + 10 > input.length())
				System.out.println(input.substring(i));
			else
				System.out.println(input.substring(i, i + 10));
		}
		
	}

}

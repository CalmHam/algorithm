package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author : �Գ���
 * create date : 2020-01-05
 * ���� : 10820 ���ڿ� �м�
 * ���� �ð� : 88 ms
 * */
public class saera111111_10820_문자열분석 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//�ҹ���, �빮��, ����, ����
		int lower = 0, upper = 0, num = 0, space = 0;
		String output = "";
		
		String S = "";
		while((S = in.readLine()) != null) {
			for(int i = 0; i < S.length(); i++) {
				char ch = S.charAt(i);
				if(Character.isDigit(ch)) {
					num ++;
				} else if (Character.isLowerCase(ch)) {
					lower++;
				} else if (Character.isUpperCase(ch)) {
					upper++;
				} else {
					space++;
				}
			}
			
			output += lower + " " + upper + " " + num + " " + space;
			output += "\n";
			
			lower = 0;
			upper = 0;
			num = 0;
			space = 0;
		}
		
		System.out.println(output);
	}

}

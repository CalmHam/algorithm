package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author : �Գ���
 * create date : 2020-01-05
 * ���� : 11655 ROT13
 * ���� �ð� : 76 ms
 * */
public class saera111111_11655_ROT13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String S = in.readLine();
		String output = "";
		char ch;
		for(int i=0; i<S.length();i++) {
			ch = S.charAt(i);

			if(Character.isLowerCase(ch)) {
				output += (char)('a' + (ch - 'a' + 13) % 26);
			} else if (Character.isUpperCase(ch)) {
				output += (char)('A' + (ch - 'A' + 13) % 26);
			} else {
				output += ch;
			}
		}
		
		System.out.println(output);
	}

}

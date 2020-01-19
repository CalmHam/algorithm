package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Author : �Գ���
 * create date : 2020-01-05
 * ���� : 10809 ���ĺ� ã��
 * ���� �ð� : 76 ms
 * */
public class saera111111_10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		String S = in.readLine();

		for(int i=0; i < S.length(); i++) {
			if(alphabet[S.charAt(i) - 'a'] == -1) {
				alphabet[S.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i = 0; i< 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}

}

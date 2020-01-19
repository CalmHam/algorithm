package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Author : �Գ���
 * create date : 2020-01-05
 * ���� : 11656 ���̻� �迭
 * ���� �ð� : 176 ms
 * */
public class saera111111_11656_접미사배열 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		ArrayList<String> arr = new ArrayList<String>();
		String suffix = "";
		for(int i = S.length()-1; i >= 0; i--) {
			suffix = S.charAt(i) + suffix;
			arr.add(suffix);
		}
		
		arr.sort(Comparator.naturalOrder());
		for (String str : arr) {
			System.out.println(str);
		}
	}

}

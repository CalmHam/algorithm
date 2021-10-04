package com.study.dreamComeTrue.Baekjoon.Chap2;

import java.io.IOException;
import java.util.Scanner;


public class saera111111_10824_네수 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C,D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		long result = Long.parseLong(Integer.toString(A) + Integer.toString(B));
		result += Long.parseLong(Integer.toString(C) + Integer.toString(D));
		
		System.out.println(result);
	}

}

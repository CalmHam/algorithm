package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.io.IOException;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-01
 * Comment :백준 수행 결과 수행시간이 꽤 걸린다. 가장 흔하게 쓰이는 입출력 방법이라고 생각했는데 다른 방법도 알아봐야겠다.
 * 
 * 1st Update
 * Comment : 108ms 에서 76ms 로 줄었다. C++는 생각없이 짜도 0ms였는데, 언어에 따라 성능 차이가 날 수 있는점이 여기서부터 실감된다.
 * */
public class saera111111_1000_AplusB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 1차 코드 
		 * Scanner sc = new Scanner(System.in); 
		 * int A = sc.nextInt(); 
		 * int B = sc.nextInt();
		 * sc.close();
		 */
		
		//System.in.read() 로 입력값을 읽을 경우 Ascii 코드값으로 읽게된다(char)
		//따라서 0의 아스키 코드값인 48이나 '0'을 빼준 것 
		int a = System.in.read() - '0';
		System.in.read();
		System.out.println(a + System.in.read() - '0');
	}

}

package com.study.dreamComeTrue.Baekjoon.Chap1;

import java.util.Scanner;

/*
 * 
 * Author : saera1111
 * Create Date : 2020-01-01
 * Comment : System.in.read() 함수는 한번에 한 문자만을 인식하기 때문에 '10'은 '1' 과 '0' 으로 두번에 걸쳐 읽게 된다. 
 * System.in.read(byte[]) 사용할 경우 배열로 문자열을 저장할 수 있다.
 * 
 * 1st update
 * Comment : 그냥 생각나는 방법으로 구현해보니 역시 120ms 의 수행시간이 걸린다. 다른 방법 있는지 알아볼 것 
 * */

public class saera111111_10950_AplusB3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*  System.in.read() 함수는 한번에 하나의 문자만 읽는다.
		 *  따라서 10 이상의 숫자를 입력하게 되면 10을 인식하지 못하고 맨 첫문자인 1을 인식하게 된다. 
		 *  
		 * String str = ""; int num = System.in.read() - '0'; System.in.read();
		 * while(num-- > 0) { int a = System.in.read() - '0'; System.in.read(); str +=
		 * (a + System.in.read() - '0') + "\n"; System.in.read(); }
		 * 
		 * System.out.println(str);
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str = "";
		while(num-- > 0) {
			str += sc.nextInt() + sc.nextInt();
			str += "\n";
		}
		
		System.out.println(str);
	}

}

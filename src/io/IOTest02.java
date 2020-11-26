package io;

import java.io.IOException;

public class IOTest02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("영문자만 입력하세요!");
		
		int n;
		//키보드에서 입력받는다.
		//stream에서 byte단위로 읽어서 int형으로 리턴
		//더이상 읽을 byte가 없으면 -1로 리턴
		
		while( (n = System.in.read() ) != 13 ) {
			System.out.println((char)n);
		}
		
	}

}

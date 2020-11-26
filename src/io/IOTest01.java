package io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IOTest01 {

	public static void main(String[] args) throws IOException {
		
		//스트림
		//1.입력스트림 - byte : InputStream , char : Reader
		//2.출력스트림 - byte : OutputStream , char : Writer
		
		//표준입출력스트림
		//표준출력스트림 : System.out // PrintStream
		//표준입력스트림 : System.in // PrintStream
		
		System.out.println("표준출력 스트림");
		Scanner in=new Scanner(System.in);
		
		//InputStream is=System.in;
		int data=System.in.read();
		
		System.out.printf("%d : %c",data,data);

	}

}

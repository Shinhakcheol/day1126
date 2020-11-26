package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class IOTest03 {

	public static void main(String[] args) throws IOException{
		
		//System.out.println("첫번째 숫자 입력:");
		//int n=System.in.read()-48;
		
		//System.out.println("두번째 숫자 입력:");
		//int m=System.in.read();
		//System.out.println("n? "+(n));
		
		//System.out.println("입력된 값에 10을 더하면? :"+(n+10));
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String indata=in.readLine();
		
		//문자열로되어 있는 숫자문자 ----> 숫자로 변경가능
		int n=Integer.parseInt(indata);
		
		
		double pi=Double.parseDouble("3.14");
		System.out.println(n+100);

	}

}

package io;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest04 {

	public static void main(String[] args) {
		
		//파일 문자형파일:텍스트파일
		//예외가 발생가능한 영역을 try{}에서 표현가고
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("test01.txt");
			//파일이 없으면 생성시켜준다.
			
			fw.write("안녕하세요");
			
		} catch (IOException e) {
			//예외가 발생되면 catch{}처리한다.
			e.printStackTrace();
		}finally {
			//try가 정상적으로 끝나고 처리하는 영역
			//try 나 catch가 블럭을 처리하고 끝나면 무조건 처리하는 영역
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest05 {

	public static void main(String[] args) {
		
		FileReader fr=null;
		try {
			fr=new FileReader("test01.txt");
			//파일이 존재하지 않으면 FileNotFoundException 발생
			int read;
			//정상적으로 글자를 읽어들이면 {} 안쪽실행
			//더이상 읽은데이터가 없으면 -1 이므로 반복탈출
			while((read=fr.read()) !=-1 ) {
				System.out.print((char)read);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.\n파일를 체크후 다시 실행하세요.");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

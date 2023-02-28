package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// 입출력은 프로그램이 기준이 된다.
// - 프로그램에서 데이터가 나가면 출력
// - 프로그램에서 데이터가 들어오면 입력


// 파일 입력 : 읽기
// 파일 출력 : 쓰기

public class Ex03 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\2월 평일 Spring 이병길\\testFolder","test.txt");
		
		// ※ writer
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("안녕하세요\n");
		bw.write("파일 출력 테스트입니다");
		
		bw.close();
		// 파일은 사용 후 꼭 닫아준다.
		
		System.out.println("작성완료");
	}
}

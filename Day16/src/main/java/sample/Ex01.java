package sample;

import java.io.File;
import java.io.IOException;

// 파일 입출력
// - 데이터를 하드 디스크의 데이터 단위인 파일로 저장 및 불러오는 방식
// - 메모리에 저장된 데이터는 프로그램 종료 및 컴퓨터의 전원 공급이 중단되면 모두 사라진다.(= 휘발성)
// - 이를 영구적으로 저장하기 위한 것이 파일이다.

// 최종 .hwp
public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 파일 객체 : 파일을 처리하기 위해 지원되는 객체
		File f1 = new File("파일이름.txt");
		// - 파일 존재 여부에 상관없이 객체를 생성할 수 있다.

		// - 지정한 파일이 있는지 없는지 검사
		System.out.println("파일 존재 : " + f1.exists());
		
		// - 프로젝트의 최상단에 파일을 생성함
		if(!f1.exists()) {
			System.out.println("file 만들기!");
			f1.createNewFile();
		}
		
		
		// - 파일을 삭제하는데 없는 파일이면 오류를 내지 않고 무시
		//f1.delete();
		
		
		File f2 = new File("D:\\2월 평일 Spring 이병길\\testFolder");
		if(f2.exists() == false) {
			System.out.println("directory 생성!");
			f2.mkdir();
		}
		
		File f3 = new File("D:\\2월 평일 Spring 이병길\\testFolder","test.txt");
		// - 지정 경로에 파일을 지정
		
		if (!f3.exists()) {
			System.out.println("특정 경로에 file만들기!");
			f3.createNewFile();
		}
		
	}
}

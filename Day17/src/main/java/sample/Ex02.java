package sample;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		File dir = new File("D:\\2월 평일 Spring 이병길\\testFolder");
		
		System.out.println("파일 입니까 ? " + dir.isFile());
		System.out.println("폴더 입니까 ? " + dir.isDirectory());
		System.out.println("폴더 위치 : " + dir.getAbsolutePath());
		
		System.out.println();
		
		File file = new File("D:\\2월 평일 Spring 이병길\\testFolder","test.txt");
		
		System.out.println("파일 입니까? : " + file.isFile());
		System.out.println("폴더 입니까? : " + file.isDirectory());
		
		System.out.println("파일위치 : "+file.getAbsolutePath());
	}
}

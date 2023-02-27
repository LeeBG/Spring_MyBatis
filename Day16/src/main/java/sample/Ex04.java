package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\2월 평일 Spring 이병길\\testFolder", "inputTest.txt");

		// 읽기 같은 경우 지정 파일이 없으면 예외
		FileReader rf = new FileReader(file);
		BufferedReader br = new BufferedReader(rf);
		String data = "";

		while (true) {
			String line = br.readLine();

			if (line == null) {
				break;
			}

			data += line + "\n";
		}
		System.out.println(data);

		br.close();

		// ※ 단순한 텍스트를 읽어올땐 Scanner 훨씬 수월하다
		System.out.println("-------------------");

		Scanner sc = new Scanner(file);
		data = "";

		while (sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}

		System.out.println(data);

		sc.close();
	}

}

package test;

import obj.Battery;
import obj.Toy;

public class Main1 {
	public static void main(String[] args) {
//		System.out.println("Maven 테스트~");
		
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = t1;
		
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
		Battery bat = new Battery();
		t1.setBat(bat);
		
		
		t1.run();
		t2.run();
		t3.run();
		
		System.out.println("t1 == t2 : 결과 " + (t1 == t2));
		System.out.println("t1 == t3 : 결과 " + (t1 == t3));
		// 해시코드가 같다 == 같은 인스턴스(=객체)를 참조중이다.
		// 해시코드가 다르다. == 서로 다른 인스턴스이다.
	}
}

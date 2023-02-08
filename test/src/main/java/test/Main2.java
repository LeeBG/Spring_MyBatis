package test;

import org.springframework.context.support.GenericXmlApplicationContext;

import obj.Toy;

public class Main2 {

	public static void main(String[] args) {
		// 스프링이 생성한 객체(스프링 빈)이 담겨있는 컨테이너를 불러온다.
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		// 컨테이너에 toy객체가 한개면, 클래스명으로 바로 가져올 수 있고
		Toy t1 = ctx.getBean(Toy.class);
		
		// toy객체가 여러개인 경우는 id까지 같이 작성한다.
		Toy t2 = ctx.getBean("toy", Toy.class);
		
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		
		
		
		t1.run();
		t2.run();
	}
}

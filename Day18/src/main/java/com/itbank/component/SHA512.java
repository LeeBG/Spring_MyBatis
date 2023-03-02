package com.itbank.component;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component // Spring MVC 필수 구성요소는 아닌데
// Spring Bean으로 등록해서 사용할 경우
public class SHA512 {
	public String getHash(String userpw) throws UnsupportedEncodingException, NoSuchAlgorithmException {

		// 해시 알고리즘 
		MessageDigest md = MessageDigest.getInstance("SHA-512"); // 싱글톤
		md.reset(); // 이전에 사용한 정보를 제거한다.

		md.update(userpw.getBytes("utf-8")); // 문자를 바이트로 바꿔서(기계어로) update

		String hash = String.format("%0128x", new BigInteger(1, md.digest())); // 빈자리를 0으로 채우고 16진수 128자리를 만들어라

		return hash;
	}
}
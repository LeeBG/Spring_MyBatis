# Spring_MyBatis

<div style="text-align: center">

![스프링이미지](https://velog.velcdn.com/images%2Fyyong3519%2Fpost%2F96f40056-2acc-4b29-9746-717dbfb05ae4%2Fdownload.png)

</div>


<br/>

# Language 
- [![자바로고](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/kr/java/)

- [![JSP로고](https://img.shields.io/badge/JSP-E34F26?style=for-the-badge&logo=&logoColor=white)](https://javaee.github.io/javaee-spec/javadocs/)

- [![Spring 로고](https://img.shields.io/badge/Spring-7fe96e?style=for-the-badge&logo=Spring&logoColor=white&color)](https://spring.io/)


# 스터디
- 주중 매일 12:30 ~ 15:30
- 자바 복습 15:00 ~ 18:00

# Tools & Version

- Windows 10
- Eclipse java Enterprise Edition Version 2019/06
    - [다운로드](https://www.eclipse.org/downloads/packages/release/2019-06/r)
- Java Version - 1.8.0.202
    - [다운로드](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- Tomcat 8.5.84
    - [다운로드](https://tomcat.apache.org/download-80.cgi)
- springframework-version 4.3.30
    - [다운로드](https://mvnrepository.com/artifact/org.springframework/spring-context/4.3.30.RELEASE)
---
## 일정별 정리표

| 번호 | 일차 | 내용 | 소스코드 | 
| :---: | :---: | :---: | :---: |
| 00 | 1일차 | JDK, Tomcat, Spring, DB설치 | [바로가기][day01] |
| 01 | 2일차 | ServletDispatcher와 Controller와 Filter사용법 | [바로가기][day02] |
| 02 | 3일차 | Springframework 동작원리 | [바로가기][day03] |
| 03 | 4일차 | Spring Controller 어노테이션과 동작 | [바로가기][day04] |
| 04 | 5일차 | Spring 프로젝트 세팅 및 DB 테이블만들어 놓기| [바로가기][day05] |
| 05 | 6일차 | Oracle DB연결 jdbc Template사용 Service사용 | [바로가기][day06] |
| 06 | 7일차 | MyBatis세팅 및 간단한 사용 | [바로가기][day07] |
| 07 | 8일차 | MyBatis - MVC insert 책데이터 | [바로가기][day08] |
| 08 | 9일차 | 테이블 update & delete Get,Post 매핑사용 | [바로가기][day09] |
| 09 | 10일차 |  | [바로가기][day10] |
| 10 | 11일차 |  | [바로가기][day11] |
| 11 | 12일차 |  | [바로가기][day12] |
| 12 | 13일차 |  | [바로가기][day13] |
| 13 | 14일차 |  | [바로가기][day13] |
| 14 | 15일차 |  | [바로가기][day15] |
| 15 | 16일차 |  | [바로가기][day16] |
| 16 | 17일차 |  | [바로가기][day17] |
| 17 | 18일차 |  | [바로가기][day18] |
| 18 | 19일차 |  | [바로가기][day19] |
| 19 | 20일차 |  | [바로가기][day20] |

## 따로 만들어보기
| 번호 | 일차 | 내용 | 소스코드 | 
| :---: | :---: | :---: | :---: |
| 00 | - | - | [바로가기][etc] |

---

# DB 세팅
```sql
-- 왼쪽에 다른 사용자가 C##itbank가 있다면 제거 후 실행
drop user c##[account] cascade;

-- 계정 생성
create user c##[account] IDENTIFIED by [password];

-- 권한 주기
grant connect,resource,dba to c##[account];

```

# web.xml - 인코딩 필터 등록

```xml
	<!-->모든 요청 주소에 인코딩 필터를 매핑<-->
    <filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>
		org.springframework.web.filter.CharacterEncodingFilter
        </filter-class>
		
		<init-param>
			<param-name>encoding</param-name>
			<param-value>utf-8</param-value>
		</init-param>
	</filter>

	<filter-mapping>
		<filter-name>encodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
```

# pom.xml

```xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.itbank</groupId>
	<artifactId>Day04</artifactId>
	<name>Day04</name>
	<packaging>war</packaging>
	<version>1.0.0-BUILD-SNAPSHOT</version>
	<properties>
		<java-version>1.8</java-version>
		<org.springframework-version>4.3.30.RELEASE</org.springframework-version>
		<org.aspectj-version>1.6.10</org.aspectj-version>
		<org.slf4j-version>1.6.6</org.slf4j-version>
	</properties>
	<dependencies>

	<!-- ...생략  -->

		<!-- https://mvnrepository.com/artifact/xerces/xercesImpl -->
		<!-- XML 파싱시 언어 차이의 문제를 해결 -->
		<dependency>
			<groupId>xerces</groupId>
			<artifactId>xercesImpl</artifactId>
			<version>2.12.2</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<artifactId>maven-eclipse-plugin</artifactId>
				<version>2.9</version>
				<configuration>
					<additionalProjectnatures>
						<projectnature>org.springframework.ide.eclipse.core.springnature</projectnature>
					</additionalProjectnatures>
					<additionalBuildcommands>
						<buildcommand>org.springframework.ide.eclipse.core.springbuilder</buildcommand>
					</additionalBuildcommands>
					<downloadSources>true</downloadSources>
					<downloadJavadocs>true</downloadJavadocs>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>2.5.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<compilerArgument>-Xlint:all</compilerArgument>
					<showWarnings>true</showWarnings>
					<showDeprecation>true</showDeprecation>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>exec-maven-plugin</artifactId>
				<version>1.2.1</version>
				<configuration>
					<mainClass>org.test.int1.Main</mainClass>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>

```

# Filter 
## 모든 요청 주소에 Encoding 필터

```xml
	<filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>
		org.springframework.web.filter.CharacterEncodingFilter
		</filter-class>

		<init-param>
			<param-name>encoding</param-name>
			<param-value>utf-8</param-value>
		</init-param>
	</filter>

	<filter-mapping>
		<filter-name>encodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>

```


[day01]: ./Day01/WebContent/
[day02]: ./Day02/
[day03]: ./Day03/
[day04]: ./Day04/
[day05]: ./Day05/
[day06]: ./Day06/
[day07]: ./Day07/
[day08]: ./Day08/
[day09]: ./Day09/
[day10]: ./Day10/
[day11]: ./Day11/
[day12]: ./Day12/
[day13]: ./Day13/
[day14]: ./Day14/
[day15]: ./Day15/
[day16]: ./Day16/
[day17]: ./Day17/
[day18]: ./Day18/
[day19]: ./Day19/
[day20]: ./Day20/
[etc]: ./test/


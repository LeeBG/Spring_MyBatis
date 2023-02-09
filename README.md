# Spring_MyBatis
Mybatis 공부

# Language 
- [![자바로고](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/kr/java/)

- [![JSP로고](https://img.shields.io/badge/JSP-E34F26?style=for-the-badge&logo=&logoColor=white)](https://javaee.github.io/javaee-spec/javadocs/)

# DB 세팅
```sql
-- 왼쪽에 다른 사용자가 C##itbank가 있다면 제거 후 실행
drop user c##account cascade;

-- 계정 생성
create user c##[account] IDENTIFIED by [password];

-- 권한 주기
grant connect,resource,dba to c##account;

```

# web.xml - 인코딩 필터 등록

```xml
    <filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>org.springframework.web.filter.CharacterEncodingFilter
        </filter-class>
		
		<init-param>
			<param-name>encoding</param-name>
			<param-value>utf-8</param-value>
		</init-param>
	</filter>
```

# 스터디
- 주중 매일 12:30 ~ 15:30
- 자바 복습 15:00 ~ 18:00

# Tools & Version

- Windows 10
- Eclipse java Enterprise Edition Version 2020/03
    - [다운로드](https://www.eclipse.org/downloads/packages/release/2020-03/r)
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
| 03 | 4일차 |  | [바로가기][day04] |
| 04 | 5일차 |  | [바로가기][day05] |
| 05 | 6일차 |  | [바로가기][day06] |
| 06 | 7일차 |  | [바로가기][day07] |
| 07 | 8일차 |  | [바로가기][day08] |
| 08 | 9일차 |  | [바로가기][day09] |
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
[day18]: ./Last/
[day19]: ./Last/
[day20]: ./Last/
[etc]: ./test/


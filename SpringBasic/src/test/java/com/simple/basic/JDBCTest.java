package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // 테스트를 진행 할 스프링 전체 경로
public class JDBCTest {
	
	
	
//	// DAOImpl에서 대체되어 사용된다...
//	@Autowired
//	private DataSource dataSource; // HikariDataSource는 dataSource를 상속 받는다 -> hikari데이터소스 객체 주입
//	
//	@Test // junit 해당 메서드를 실행
//	public void testCode() {
//		
//		System.out.println("실행 됨");
//		
//		try {
//			
//			Connection conn = dataSource.getConnection();
//			
//			System.out.println(conn); // null이 아니라는 것은 데이터베이스 연결 됨
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//			
//	}
	
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	
	
	@Autowired
	private TestMapper testMapper; // 마이바티스 인터페이스
	
	@Test
	public void testCode2() {
//		System.out.println(sqlSessionFactory);
		String result = testMapper.getTime(); // TestMapper.java를 바라본다
		System.out.println(result);
	}
	
}

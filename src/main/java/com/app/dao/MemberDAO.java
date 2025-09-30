package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.MemberVO;

public class MemberDAO {
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
	}
	public String select(MemberVO memberVO) {
		return sqlSession.selectOne("member.select", memberVO);
	}
}	

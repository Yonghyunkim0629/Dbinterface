package org.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.edu.vo.MemberVO;

public class SampleDAOImpl implements IF_SampleDAO {
	
	@Inject 
	private SqlSession sqlSession;
    //오버라이드 다형성
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert("org.edu.dao.IF_SampleDAO", vo); 
		
	}

	@Override
	public List<MemberVO> selectMember() {
		return sqlSession.selectList("org.edu.dao.IF_SampleDAO");
	}

	@Override
	public void updateMember(MemberVO vo) {
		sqlSession.update("org.edu.dao.IF_SampleDAO", vo);
		
	}

	@Override
	public void deleteMember(String userid) {
		sqlSession.delete("org.edu.dao.IF_SampleDAO", userid);
		
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUname(String uid, String upw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserId(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchUname(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}

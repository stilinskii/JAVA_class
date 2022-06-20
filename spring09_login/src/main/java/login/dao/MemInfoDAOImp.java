package login.dao;

import java.util.Optional;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import login.dto.MemInfoDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemInfoDAOImp implements MemInfoDAO{
	
	private final SqlSessionTemplate sqlSession;

	@Override
	public int insert(MemInfoDTO dto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("meminfo.save", dto);
	}

	@Override
	public String findPasswordById(String id) {
		return sqlSession.selectOne("meminfo.findPasswordById",id);
	}


	@Override
	public void update(MemInfoDTO dto) {
		sqlSession.update("meminfo.update",dto);
		
	}

	@Override
	public MemInfoDTO findById(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("meminfo.findById",id);
	}

}

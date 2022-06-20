package login.service;

import org.springframework.stereotype.Service;

import login.dao.MemInfoDAO;
import login.dto.MemInfoDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemServiceImp implements MemService{
	
	private final MemInfoDAO dao;

	
	@Override
	public MemInfoDTO save(MemInfoDTO dto) {
		
		if(dao.findPasswordById(dto.getId())==null) {
			dao.insert(dto);
			return dto;
		}else {
			return null;
		}
			
	}
	
	@Override
	public int loginChk(String id,String password) {
		if(dao.findPasswordById(id)==null) {
			//0:member not found
			return 0;
		}else {
			if(dao.findPasswordById(id).equals(password)) {
				//1:login success
				return 1;
			}else {
				//2:password incorrect
				return 2;
			}
		}
	
	}


	@Override
	public MemInfoDTO findById(String id) {
		
		return dao.findById(id);
	}
	
	@Override
	public void updateInfo(MemInfoDTO dto) {
		dao.update(dto);
	}

}

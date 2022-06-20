package login.service;

import login.dto.MemInfoDTO;

public interface MemService {
	public MemInfoDTO save(MemInfoDTO dto);
	public int loginChk(String id,String password);
	public MemInfoDTO findById(String id);
	public void updateInfo(MemInfoDTO dto);
}

package login.dao;


import login.dto.MemInfoDTO;

public interface MemInfoDAO {
	public int insert(MemInfoDTO dto);
	public void update(MemInfoDTO dto);
	public String findPasswordById(String id);
	public MemInfoDTO findById(String id);
}

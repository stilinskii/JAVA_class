package login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class MemInfoDTO {
	private String id;
	private String username;
	private String password;
	private String email;

	public MemInfoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
}

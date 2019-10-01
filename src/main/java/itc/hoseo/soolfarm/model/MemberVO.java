package itc.hoseo.soolfarm.model;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int num;
	private String email;
	private String pw;
	private String name;
	private String tel;
	private String address;
	private Date joinDate;
	
}

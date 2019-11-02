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
	private String zipCode;
	private String address1;
	private String address2;
	private Date joinDate;
	
}

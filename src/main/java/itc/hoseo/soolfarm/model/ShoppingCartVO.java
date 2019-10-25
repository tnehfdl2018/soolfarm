package itc.hoseo.soolfarm.model;

import lombok.Data;

@Data
public class ShoppingCartVO {
	
	private int sbNum;
	private String sbName;
	private String sbImg;
	private String sbPrice;
	private int sbStock;
	private String sbUser;
	
//	sb_num int primary key,
//	sb_name varchar(45) not null,
//	sb_img varchar(25) not null,
//	sb_price varchar(25) not null,
//	sb_stock int not null,
//	sb_user varchar(75) not null
//	);
}

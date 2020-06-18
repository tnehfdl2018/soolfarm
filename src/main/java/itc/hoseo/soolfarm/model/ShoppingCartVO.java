package itc.hoseo.soolfarm.model;

import lombok.Data;

@Data
public class ShoppingCartVO {
	
	private int sbNum;
	private String sbName;
	private String sbImg;
	private int sbPrice;
	private int sbStock;
	private String sbUser;

	public int getSbNum() {
		return sbNum;
	}

	public void setSbNum(int sbNum) {
		this.sbNum = sbNum;
	}

	public String getSbName() {
		return sbName;
	}

	public void setSbName(String sbName) {
		this.sbName = sbName;
	}

	public String getSbImg() {
		return sbImg;
	}

	public void setSbImg(String sbImg) {
		this.sbImg = sbImg;
	}

	public int getSbPrice() {
		return sbPrice;
	}

	public void setSbPrice(int sbPrice) {
		this.sbPrice = sbPrice;
	}

	public int getSbStock() {
		return sbStock;
	}

	public void setSbStock(int sbStock) {
		this.sbStock = sbStock;
	}

	public String getSbUser() {
		return sbUser;
	}

	public void setSbUser(String sbUser) {
		this.sbUser = sbUser;
	}


	//	sb_num int primary key,
//	sb_name varchar(45) not null,
//	sb_img varchar(25) not null,
//	sb_price varchar(25) not null,
//	sb_stock int not null,
//	sb_user varchar(75) not null
//	);
}

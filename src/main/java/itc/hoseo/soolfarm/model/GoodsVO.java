package itc.hoseo.soolfarm.model;

import java.util.Date;

import lombok.Data;

@Data
public class GoodsVO {
	
	private int gdNum;
	private String gdName;
	private String gdImg;
	private String gdKinds;
	private String gdPrice;
	private String gdMaker;
	private String gdAlcohol;
	private String gdVol;
	private Date gdStartDay;
	private String gdDiscription;
	
	


}

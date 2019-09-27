package itc.hoseo.soolfarm.model;

import java.awt.Image;

import lombok.Data;

@Data
public class GoodsBuyed {
	
	private int gdNum;
	private String gdName;
	private Image img;
	private String gdKinds;
	private String gdPrice;
	private String gdMu;
	private String gdDiscript;
	private String gdStatus;
	
}

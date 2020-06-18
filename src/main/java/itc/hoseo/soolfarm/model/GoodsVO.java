package itc.hoseo.soolfarm.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
	private int gdStock;
	private String gdDiscription;
	
	private MultipartFile imgFile;


	public int getGdNum() {
		return gdNum;
	}

	public void setGdNum(int gdNum) {
		this.gdNum = gdNum;
	}

	public String getGdName() {
		return gdName;
	}

	public void setGdName(String gdName) {
		this.gdName = gdName;
	}

	public String getGdImg() {
		return gdImg;
	}

	public void setGdImg(String gdImg) {
		this.gdImg = gdImg;
	}

	public String getGdKinds() {
		return gdKinds;
	}

	public void setGdKinds(String gdKinds) {
		this.gdKinds = gdKinds;
	}

	public String getGdPrice() {
		return gdPrice;
	}

	public void setGdPrice(String gdPrice) {
		this.gdPrice = gdPrice;
	}

	public String getGdMaker() {
		return gdMaker;
	}

	public void setGdMaker(String gdMaker) {
		this.gdMaker = gdMaker;
	}

	public String getGdAlcohol() {
		return gdAlcohol;
	}

	public void setGdAlcohol(String gdAlcohol) {
		this.gdAlcohol = gdAlcohol;
	}

	public String getGdVol() {
		return gdVol;
	}

	public void setGdVol(String gdVol) {
		this.gdVol = gdVol;
	}

	public Date getGdStartDay() {
		return gdStartDay;
	}

	public void setGdStartDay(Date gdStartDay) {
		this.gdStartDay = gdStartDay;
	}

	public int getGdStock() {
		return gdStock;
	}

	public void setGdStock(int gdStock) {
		this.gdStock = gdStock;
	}

	public String getGdDiscription() {
		return gdDiscription;
	}

	public void setGdDiscription(String gdDiscription) {
		this.gdDiscription = gdDiscription;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}
}

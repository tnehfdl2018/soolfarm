package itc.hoseo.soolfarm.model;

import java.util.Date;

import lombok.Data;

@Data
public class BannerVO {
	private int id;
	private String name;
	private Date startDttm;
	private Date endDttm;
	private String imgName;
	private String scription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDttm() {
		return startDttm;
	}

	public void setStartDttm(Date startDttm) {
		this.startDttm = startDttm;
	}

	public Date getEndDttm() {
		return endDttm;
	}

	public void setEndDttm(Date endDttm) {
		this.endDttm = endDttm;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getScription() {
		return scription;
	}

	public void setScription(String scription) {
		this.scription = scription;
	}
}

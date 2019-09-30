package itc.hoseo.soolfarm.model;

import java.util.Date;

import lombok.Data;

@Data
public class Banner {
	private int id;
	private String name;
	private Date startDttm;
	private Date endDttm;
	private String imgName;
}

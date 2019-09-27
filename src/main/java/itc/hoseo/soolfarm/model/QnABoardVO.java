package itc.hoseo.soolfarm.model;

import java.util.Date;

import lombok.Data;

@Data
public class QnABoardVO {
	
	private int postNum;
	private String postSub;
	private String postContant;
	private String postWriter;
	private Date postDate;
	

}

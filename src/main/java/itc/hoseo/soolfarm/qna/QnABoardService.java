package itc.hoseo.soolfarm.qna;

import itc.hoseo.soolfarm.model.QnABoardVO;

public interface QnABoardService {
	
	// QnA 추가
	public QnABoardVO addQnA(QnABoardVO vo);
	
	//QnA 수정
	public boolean modifyQnA(QnABoardVO vo);
	
	//QnA 삭제
	public QnABoardVO deleteQnA(QnABoardVO vo);

}
